package com.company.tests;

/**
 * @author piotr
 */
public class test5 {
    public static void main(String[] args) {
        {
            int x = 2;
            System.out.println(x > 3 ? x < 8 ? 1 : 8 : 7);
        }
        {
            final char limit = 4;
            final char priorityA = 0, priorityB = 1, priorityC = 3;
            switch (priorityC) {
                case priorityC:
                    System.out.println("One");
                case priorityB:
                    System.out.println("Two");
                    break;
                case limit:
                case 'A':
                    System.out.println("Three");
            }
        }
        {
            String a = "abc";
            String concat = a.concat(String.valueOf(2));
            System.out.println(concat);
            a = a + 3;
            a = a + true;
            System.out.println(a.length());
        }
        {
            String string1 = "Java!";
            String string2 = new String(string1);
            if ("Java!".equals(string1)) System.out.println("case 1");
            if ("Java!" == string1) System.out.println("case 2");
            if ("Java!" == string1.intern()) System.out.println("case 3");
            if ("Java!".equals(string2)) System.out.println("case 4");
            if ("Java!" == string2) System.out.println("case 5");
            if ("Java!" == string2.intern()) System.out.println("case 6");
        }
    }
}
