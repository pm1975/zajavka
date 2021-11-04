package day36_enum;

import java.util.Arrays;
import java.util.List;

public class Enums {
    public static void main(String[] args) {
//        Voltswagen[] values = Voltswagen.values();
//        System.out.println(Arrays.toString(values));
//        for (Voltswagen value : values) {
//            System.out.println(value);
//        }
//        Voltswagen golf = Voltswagen.valueOf("GOLF");
//        System.out.println(golf);
//
//        System.out.println(Voltswagen.GOLF.doSomething());

//        Voltswagen v1 = getV1();
//        Voltswagen v2 = getV2();
////        System.out.println(v1 == v2);
//        System.out.println(v1.equals(v2));
//        System.out.println(v1.ordinal() == 2);
//
//        String returned1 = "ARTEON";
//        String returned2 = "arteon";
//
//        v1 = Voltswagen.valueOf(returned1);
//        System.out.println(v1);
//
//        v2 = Voltswagen.valueOf(returned2);
//        System.out.println(v2

//        String color = "white";
////        List<Voltswagen> v1 = Voltswagen.ofColor(color);
//        Voltswagen v1 = Voltswagen.ofColor(color);
//        System.out.println(v1);
//        System.out.println(Arrays.asList(Voltswagen.values()));
//        System.out.println(Arrays.toString(Voltswagen.values()));
//        System.out.println(getV2().name());

        Voltswagen v = getV1();
        System.out.println(v);
        System.out.println(v.getIfMissing());
    }

    private static Voltswagen getV1() {
        return Voltswagen.ARTEON;
    }

    private static Voltswagen getV2() {
        return Voltswagen.TUAREG;
    }

}
