package test16;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class question4 {
    public static void main(String[] args) {
        Duration duration1 = Duration.of(2, ChronoUnit.DAYS);
        Duration duration2 = Duration.of(1, ChronoUnit.HOURS);
        System.out.println(duration1);
        System.out.println(duration2);
        LocalDateTime dateTime = LocalDateTime.of(2020, 12, 31, 10, 0, 0, 0);
        System.out.println(dateTime);
        dateTime = dateTime.minus(duration1);
        System.out.println(dateTime);
        dateTime = dateTime.minus(duration2);
        System.out.println(dateTime);
        System.out.println(dateTime.format(DateTimeFormatter.ofPattern("dd-MM-yy HH:mm:ss")));

    }
}
