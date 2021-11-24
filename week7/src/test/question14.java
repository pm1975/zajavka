package test;

import java.sql.SQLOutput;

public class question14 {
    public static void main(String[] args) {
        question14 plane = new question14();
        plane.countWheels();
        System.out.println(5);
    }

    public String numberOfWheels;

    public long longNumberOfWheels;

    public void countWheels() {
        System.out.println(1);
        try {
            System.out.println(2);
            longNumberOfWheels = Long.parseLong(numberOfWheels);
            System.out.println(3);
        } catch (NumberFormatException e) {
            System.out.println(4);
        }
    }
}
