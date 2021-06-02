package day22;

import java.sql.SQLOutput;

public class VariableVisibilityScope {
    private double a;
    private Double b;

    public static void main(String[] args) {
        VariableVisibilityScope example = new VariableVisibilityScope();
        example.method();
    }

    private void method() {
        System.out.println(a);
        System.out.println(b);
    }

    private void method2(String c) {
        System.out.println(a);
        System.out.println(c);
    }

    private void method3(String c, String ... e) {
        System.out.println(a);
        System.out.println(c);
        System.out.println(e.length);
    }

    private void method3() {
//        String d;
//        System.out.println(d);
    }
}
