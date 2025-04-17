package com.weddingdomain.wedding.resource;

import com.weddingdomain.wedding.entity.Guest;

import com.weddingdomain.wedding.entity.OtherPeople;
import com.weddingdomain.wedding.service.CsvExportService;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.net.URI;
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
    @Produces("application/vnd.ms-excel")  // Excel MIME type
    public Response exportExcel() {
        List<Guest> guests = Guest.listAll();

        StringBuilder sb = new StringBuilder();

        // Headers (reordered)
        sb.append("Selected Option\tName\tPhone\tEmail\tPlus One\tOther Guests\n");

        guests.forEach(guest -> {
            String others = guest.otherPeople.stream()
                    .map(op -> op.name)
                    .collect(Collectors.joining(", "));

            sb.append(guest.selectedOption != null ? guest.selectedOption : "").append("\t")  // Selected Option
                    .append(guest.name).append("\t")                                                // Name
                    .append(guest.phoneNumber != null ? guest.phoneNumber : "").append("\t")       // Phone
                    .append(guest.mail != null ? guest.mail : "").append("\t")                     // Email
                    .append(guest.plusOneName != null ? guest.plusOneName : "").append("\t")       // Plus One
                    .append(others).append("\n");                                                  // Other Guests
        });

        return Response.ok(sb.toString())
                .header("Content-Disposition", "attachment; filename=wedding_guests.xls")
                .build();
    }


    @POST
    @Path("/submit-attend")
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Response create(Guest guest) {
        // Persist the guest
        if (guest == null) {
            return Response.status(Response.Status.BAD_REQUEST).entity("Guest data is missing").build();
        }
        guest.persist();

        // Persist related others if they exist
        if (guest.otherPeople != null) {
            for (OtherPeople other : guest.otherPeople) {
                other.guest = guest; // Set the relationship
                other.persist();
            }
        }

        if (guest.isPersistent()) {
            return Response.created(URI.create("/guests/" + guest.id)).build();
        }
        return Response.status(Response.Status.BAD_REQUEST).build();
    }
}