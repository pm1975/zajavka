package com.company.tests;

/**
 * @author piotr
 */
public class test4 {
    public static void main(String[] args) {
        {
            boolean a = true, b = true, c = false;
            int d = 1;
            boolean x = (d != 20);
            boolean y = (b = false);
            boolean z = !c;
            boolean xy = x ^ y;
            boolean xyz = xy | z;
            System.out.println("x = (d != 20) = " + x);
            System.out.println("y = (b = false) = " + y);
            System.out.println("z = !c = " + z);
            System.out.println("xy = x ^ z = " + xy);
            System.out.println("xyz = xy | z = " + xyz);
            c = (d != 20) ^ (b = false) | !c;
            System.out.println(a + ", " + b + ", " + c);
        }
        {
            byte a = 100, b = 50;
//            byte sum = (byte) a + b;
//            System.out.println(sum);
        }
        {
            String a = "2";
//            long b = 3;
//            System.out.println(a != b);
        }
    }
}
