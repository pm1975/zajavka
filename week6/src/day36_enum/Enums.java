package day36_enum;

import java.util.Arrays;

public class Enums {
    public static void main(String[] args) {
        Voltswagen[] values = Voltswagen.values();
        System.out.println(Arrays.toString(values));
        for (Voltswagen value : values) {
            System.out.println(value);
        }
        Voltswagen golf = Voltswagen.valueOf("GOLF");
        System.out.println(golf);
    }

}
