package com.weddingdomain.wedding.resource;

import com.weddingdomain.wedding.entity.Guest;

import com.weddingdomain.wedding.entity.OtherPerson;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;


@Path("/api/v1")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AttendanceResource {

    @POST
    @Path("/submit-attend")
    @Transactional
    public Response submitAttendance(AttendanceRequest request) {
        Guest guest = new Guest();
        guest.name = request.name;
        guest.plusOneName = request.plusOneName;

        // First persist the guest so we can use it for relationships
        guest.persist();

        if (request.otherPeople != null) {
            for (String name : request.otherPeople) {
                OtherPerson other = new OtherPerson();
                other.name = name;
                other.guest = guest;
                other.persist();
            }
        }

        return Response.ok().entity(new AttendanceResponse(
                "Attendance recorded successfully",
                guest.id
        )).build();
    }


    // Request DTO (Data Transfer Object)
    public static class AttendanceRequest {
        public String name;
        public String plusOneName;
        public List<String> otherPeople;

        // Empty constructor needed for JSON deserialization
        public AttendanceRequest() {
        }
    }

    // Response DTO
    public static class AttendanceResponse {
        public String message;
        public Long guestId;

        public AttendanceResponse(String message, Long guestId) {
            this.message = message;
            this.guestId = guestId;
        }
    }
}