package test16;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class question3 {
    public static void main(String[] args) {
        Period period = Period.of(1, 2, 3);
        System.out.println(period);
        LocalDateTime dateTime = LocalDateTime.of(2020, 12, 31, 10, 0, 0, 0);
        dateTime = dateTime.minus(period);
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
    }
}
