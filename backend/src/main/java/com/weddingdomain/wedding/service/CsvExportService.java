package com.weddingdomain.wedding.service;

import com.weddingdomain.wedding.entity.Guest;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class CsvExportService {

    public String generateGuestCsv() {
        List<Guest> guests = Guest.listAll();

        StringBuilder csv = new StringBuilder();
        csv.append("Name,Plus One,Other Guests\n");  // Header

        guests.forEach(guest -> {
            String otherGuests = guest.otherPeople.stream()
                    .map(op -> op.name)
                    .collect(Collectors.joining(", "));

            csv.append(String.format("\"%s\",\"%s\",\"%s\"\n",
                    escapeCsv(guest.name),
                    escapeCsv(guest.plusOneName != null ? guest.plusOneName : ""),
                    escapeCsv(otherGuests)
            ));
        });

        return csv.toString();
    }

    private String escapeCsv(String input) {
        return input.replace("\"", "\"\"");  // Escape quotes
    }
}