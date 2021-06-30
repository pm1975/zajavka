package com.company.package2;

public class Operators {
    public static void main(String[] args) {
        logicalOperatorsXOR();
    }

    private static void logicalOperatorsXOR() {
        boolean a = false;
        boolean b = false;
        System.out.println(a ^ b);
//        System.out.println("(a | b) && c = " + ((firstBooleanProvider() | secondBooleanProvider()) || thirdBooleanProvider()));
//        System.Rout.println("(a | b) & c = " + ((firstBooleanProvider() | secondBooleanProvider()) & thirdBooleanProvider()));
//        System.out.println("(a ^ b) & c = " + ((firstBooleanProvider() ^ secondBooleanProvider()) & thirdBooleanProvider()));
    }

    private static boolean firstBooleanProvider() {
        System.out.println("firstBooleanProvider");
        return true;
    }

    private static boolean secondBooleanProvider() {
        System.out.println("secondBooleanProvider");
        return false;
    }

    private static boolean thirdBooleanProvider() {
        System.out.println("thirdBooleanProvider");
        return true;
    }

    private void logicalOperators() {
        boolean a = 1 > 2;
        boolean b = 3 != 2;
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + !a);
    }

    private void stringComparison() {
        String a = "word1";
        String b = "word1";
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a.equals(b) = " + (a.equals(b)));

        String c = "new sentence";
        String d = new String("new sentence");
        System.out.println("c == d = " + (c == d));
        System.out.println("c.equals(d) = " + (c.equals(d)));
    }

    private void comparison() {
        int a = 1;
        int b = 2;
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >=b = " + (a >= b));
        System.out.println("a <=b = " + (a <= b));
    }
}
