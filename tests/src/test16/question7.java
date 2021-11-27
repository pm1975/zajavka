package test16;

import java.time.*;

public class question7 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println(dateTime);
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
        System.out.println(zonedDateTime);
        Instant instant = zonedDateTime.toInstant();
        System.out.println(instant);
//        instant = Instant.from(dateTime);
        System.out.println(instant);
//        instant = dateTime.toInstant();
        instant = Instant.ofEpochMilli(8912124923912L);
        System.out.println(instant);
        instant = Instant.now();
        System.out.println(instant);
    }
}
