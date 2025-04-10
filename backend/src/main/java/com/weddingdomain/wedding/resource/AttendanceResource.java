package com.weddingdomain.wedding.resource;

import com.weddingdomain.wedding.entity.Guest;

import com.weddingdomain.wedding.entity.OtherPeople;
import com.weddingdomain.wedding.service.CsvExportService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.List;
import java.util.stream.Collectors;


@Path("/api/v1")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AttendanceResource {

    @Inject
    CsvExportService csvExportService;

    @GET
    @Path("/export-excel")
    @Produces("application/json")
    public Response exportExcel() {
        List<Guest> guests = Guest.listAll();


        StringBuilder sb = new StringBuilder();
        sb.append("Name\tPlus One\tOther Guests\n");

        guests.forEach(guest -> {
            String others = guest.otherPeople.stream()
                    .map(op -> op.name)
                    .collect(Collectors.joining(", "));

            sb.append(guest.name).append("\t")
                    .append(guest.plusOneName != null ? guest.plusOneName : "").append("\t")
                    .append(others).append("\n");
        });

        return Response.ok(sb.toString())
                .header("Content-Disposition", "attachment; filename=wedding_guests.xlsx")
                .header("Content-Type", "application/vnd.ms-excel") // Excel MIME type
                .build();
    }


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
                OtherPeople other = new OtherPeople();
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