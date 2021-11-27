package test16;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class question5 {
    public static void main(String[] args) {
        Period period = Period.ofDays(1).ofYears(2);
        System.out.println(period);
        LocalDateTime localDateTime = LocalDateTime.of(2020, 12, 31, 10, 0, 0, 0);
        localDateTime = localDateTime.minus(period);
        System.out.println(DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss").format(localDateTime));
    }
}
