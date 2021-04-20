package com.company.package2;

public class IfElseExamples {
    public static void main(String[] args) {
        IfElseExamples examples = new IfElseExamples();
        System.out.println(examples.ternaryExample2(1, 2));;
    }

    private void ternaryExample1(int a, int b) {
//        condition ? positive : negative;
        String result = a + b > 0 ? "a + b > 0" : "a + b <= 0";
        System.out.println("Ternary variable result: " + result);
        System.out.println("Ternary no variable result " + (a + b > 0 ? "a + b > 0" : "a + b <= 0"));
    }

    private String ternaryExample2(int a, int b) {
        return a + b > 0 ? "a + b > 0" : "a + b <= 0";
    }
}
