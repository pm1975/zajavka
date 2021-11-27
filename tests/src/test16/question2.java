package test16;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class question2 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2020, 12, 31, 10, 0, 0, 0);
        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
        dateTime.plusDays(1);
        dateTime.plusHours(1);
        dateTime.plusSeconds(1);
        dateTime.plusMinutes(1);
        System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
    }
}
