package test16;

import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class question6 {
    public static void main(String[] args) {
        Duration durationMinute1 = Duration.of(60, ChronoUnit.SECONDS);
        Duration durationMinute2 = Duration.ofMinutes(1);
        String durationMinuteString1 = durationMinute1.toString();
        String durationMinuteString2 = durationMinute2.toString();
        Duration durationDay = Duration.ofDays(1);
        Period periodDay = Period.ofDays(1);
        String durationDayString = durationDay.toString();
        String periodDayString = periodDay.toString();
        System.out.println(durationMinute1);
        System.out.println(durationMinute2);
        System.out.println(durationDay);
        System.out.println(periodDay);
        if (durationMinute1 == durationMinute2) {
            System.out.println("durationMinute1 == durationMinute2");
        }
        if (durationMinute1.equals(durationMinute2)) {
            System.out.println("durationMinute1.equals(durationMinute2)");
        }
        if (durationMinuteString1 == durationMinuteString2) {
            System.out.println("durationMinuteString1 == durationMinuteString2");
        }
        if (durationMinuteString1.equals(durationMinuteString2)) {
            System.out.println("durationMinuteString1.equals(durationMinuteString2)");
        }
        if (durationDay.equals(periodDay)) {
            System.out.println("durationDay.equals(periodDay)");
        }
        if (durationDayString == periodDayString) {
            System.out.println("durationDayString == periodDayString");
        }
        if (durationDayString.equals(periodDayString)) {
            System.out.println("durationDayString.equals(periodDayString)");
        }
    }
}
