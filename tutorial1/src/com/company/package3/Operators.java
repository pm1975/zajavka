package com.company.package3;

/**
 * @author piotr
 */
public class Operators {
    public static void main(String[] args) {
        Operators operators = new Operators();
        operators.assignmentOperators3();
    }

    private void increment() {
        int a = 1;
        a++; // a = a + 1
        System.out.println("a = " + a);
        System.out.println("a = " + a++);
        System.out.println("a = " + a);

        int b = 1;
        b++; // b = b + 1
        System.out.println("b = " + b);
        System.out.println("b = " + ++b);
        System.out.println("b = " + b);
    }

    private void decrement() {
        int a = 1;
        a--; // a = a - 1
        System.out.println("a = " + a);
        System.out.println("a = " + a--);
        System.out.println("a = " + a);

        int b = 1;
        b--; // b = b - 1
        System.out.println("b = " + b);
        System.out.println("b = " + --b);
        System.out.println("b = " + b);
    }

    //operatory przypisania
    private void assignmentOperators() {
        int a = 1;
        int b;
        a += 2; // a = a + 2;
        b = +3; // b = 3;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = 1;
        int d = 2;
        c -= 2; // c = c - 2;
        d = -3; // d = -3;
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int e = 1;
        int f = 2;
        e *= 2; // e = e * 2;
//        f =* 3; // f = f * 3;
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        int g = 1;
        int h = 2;
        g /= 2; // g = g / 2;
//        h =/ 3; // h = h / 3;
        System.out.println("g = " + g);
        System.out.println("h = " + h);

        int i = 17;
        int j = 11;
        i %= 3; // i = i % 2;
//        j =% 3; // j = j % 3;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }

    private void assignmentOperators2() {
        int x = 1;
        int y = 2;
        x <<= y; // x = x << y
        x >>= y; // x = x >> y
        x >>>= y; // x = x >>> y
        x &= y; // x = x & y
        x |= y; // x = x | y
        x ^= y; // x = x ^ y
    }
    private void assignmentOperators3() {
        boolean x = true;
        boolean y = true;
        System.out.println(x &= y); // x = x & y
        System.out.println(x |= y);; // x = x | y
        System.out.println(x ^= y);; // x = x ^ y
    }
}
