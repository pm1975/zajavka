package com.company.package3;

/**
 * @author piotr
 */
public class IfElseExamples {
    public static void main(String[] args) {
        IfElseExamples examples = new IfElseExamples();

//        System.out.println("a = 1; b = 2");
//        examples.ifElseCase(1, 2);
//        System.out.println();
//
//        System.out.println("a = -1; b = -2");
//        examples.ifElseCase(-1, -2);
//        System.out.println();
//
//        System.out.println("a = -10; b = 20");
//        examples.ifElseCase(-10, 20);
//        System.out.println();
//
//        System.out.println("a = 100; b = 200");
//        examples.ifElseCase(100, 200);
//        System.out.println();

        System.out.println("a = 1; b = 2; result => " + examples.ifElseCaseWithReturn(1, 2));
        System.out.println();

        System.out.println("a = -1; b = -2; result => " + examples.ifElseCaseWithReturn(-1, -2));
        System.out.println();

        System.out.println("a = 10; b = 20; result => " + examples.ifElseCaseWithReturn(10, 20));
        System.out.println();

        System.out.println("a = 100; b = 200; result => " + examples.ifElseCaseWithReturn(100, 200));
        System.out.println();
    }

    private void ifElseCase(int a, int b) {
        System.out.println("CASE 1");
        if (a - b > 0) {
            System.out.println("a - b > 0");
        }

        System.out.println("CASE 2");
        if (a + b > 0) {
            System.out.println("a + b > 0");
        } else {
            System.out.println("a + b <= 0");
        }

        System.out.println("CASE 3");
        if (a + b < 0) {
            System.out.println("a + b < 0");
        } else if (a + b >= 0 && a + b < 10) {
            System.out.println("a + b >= 0 && a + b < 10");
        } else if (a + b >= 10 && a + b < 100) {
            System.out.println("a + b >= 10 && a + b < 100");
        } else {
            System.out.println("a + b >= 100");
        }
    }

    private String ifElseCaseWithReturn(int a, int b) {
        if (a + b < 0) {
            return "a + b < 0";
        } else if (a + b >= 0 && a + b < 10) {
            return "a + b >= 0 && a + b < 10";
        } else if (a + b >= 10 && a + b < 100) {
            return "a + b >= 10 && a + b < 100";
        } else {
            return "a + b >= 100";
        }
    }
}
