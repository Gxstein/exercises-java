package Extras.DataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {
    public static void main(String[] args) {
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate d08 = LocalDate.parse("22/09/2026", fmt1);
        System.out.println("ISO: " + d08);
        LocalDate d01 = LocalDate.now();
        System.out.println("Data: " + d01);
        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("Data/Hora: " + d02);
        Instant d03 = Instant.now();
        System.out.println("Data/Hora GMT: " + d03);
        LocalDate d04 = LocalDate.parse("2026-07-20");
        System.out.println(d04);
        LocalDateTime d05 = LocalDateTime.parse("2026-07-20T01:30:26");
        System.out.println(d05);
        Instant d06 = Instant.parse("2026-07-20T01:30:26Z");
        System.out.println(d06);
        Instant d07 = Instant.parse("2026-07-20T01:30:26-03:00");
        System.out.println(d07);
        LocalDate d09 = LocalDate.of(2026, 9, 20);
        System.out.println(d09);
        LocalDateTime d10 = LocalDateTime.of(2026, 9, 20, 14, 48);
        System.out.println(d10);
    }
}
