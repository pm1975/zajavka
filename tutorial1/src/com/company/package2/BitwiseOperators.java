package com.company.package2;

/**
 * operatory bitowe
 */
public class BitwiseOperators {
    public static void main(String[] args) {
        byte a = 12;
        byte b = 16;
//        System.out.println("a & b = " + (a & b));
//        System.out.println("a | b = " + (a | b));
//        System.out.println("a ^ b = " + (a ^ b));
//        System.out.println("~b = " + ~b); //negacja bitowa

        a = 109;
        System.out.println("a << 3 = " + (byte) (a << 3));

        //zwraca uwagę jaki znak stał na początku
        a = 127;
        System.out.println("a >> 3 = " + (byte) (a >> 3));
        a = -128;
        System.out.println("a >> 3 = " + (byte) (a >> 3));

        //nie zwraca uwagi jaki znak stał na początku
        a = 127;
        System.out.println("a >>> 3 = " + (byte) (a >>> 3));
        a = -128;
        System.out.println("a >>> 3 = " + (byte) (a >>> 3));

    }
}
