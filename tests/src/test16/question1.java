package test16;

import java.time.LocalDate;
import java.time.Month;

public class question1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, 12, 31);
        System.out.println(date);
        date = LocalDate.of(2020, Month.DECEMBER, 31);
        System.out.println(date);
        date = LocalDate.of(2020, Month.DECEMBER, 33);
//        date = new LocalDate(2020, Month.DECEMBER, 33);
        System.out.println(date);
    }
}
