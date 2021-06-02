package com.company.tests;

/**
 * @author piotr
 */
public class test6 {
    public static void main(String[] args) {
        test6 test6 = new test6();
        test6.question2answer();
    }

    private void question1() {
        int result = 0;
        for (int i = 10; i > 0; ) {
            i = i--;
            result++;
        }
        System.out.println(result);
    }

    private  void   question1answer() {
        int result = 0;
        for(int i = 10; i > 0; ) {
            System.out.println("i before: " + i);
            i = i--;
            System.out.println("i after: " + i);
            result++;
        }
        System.out.println(result);
    }

    private void question2() {
        int result = 0;
        int i = 1, j = 10;
        while (i < j) {
            ++j;
            i += 3;
            result += j - 2;
        }
        System.out.println(result);
    }

    private void question2answer() {
        int result = 0;
        int i = 1, j = 10;
        while (i < j) {
            System.out.println("1. i: " + i + ", j: " + j + ", res: " + result);
            ++j;
            System.out.println("2. i: " + i + ", j: " + j + ", res: " + result);
            i += 3;
            System.out.println("3. i: " + i + ", j: " + j + ", res: " + result);
            result += j - 2;
            System.out.println("4. i: " + i + ", j: " + j + ", res: " + result);
        }
        System.out.println(result);
    }

    private void question3() {
//        do {
//            int result = 0;
//            System.out.println(result++ + " ");
//        } while (result <= 10);
    }

    private void question5() {
        int result = 0;
        LABEL:
        for (int i = 10; i <= 23; i++) {
            for (int j = 1; true; j++) {
                if (i * j % 3 == 0) {
                    continue LABEL;
                }
                if (i == 14) {
                    break;
                }
                result++;
            }
        }
        System.out.println(result);
    }

    private void question6() {
        boolean loopTheLoop = true;
        int i = 0, result = 10;
        do {
            ++i;
            if (i == 8) {
                loopTheLoop = false;
            }
            result -= 2;
        } while (loopTheLoop);
        System.out.println(result);
    }

    private void question7() {
        int x = 1, y = 10;
        while (x < 10)
            y--;
        x++;
        System.out.println("x = " + x + ", y = " + y);
    }
}
