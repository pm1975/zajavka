package day39.test;

public class StaticInit {
    static String value = "a";

    {
        value += "b";
        System.out.println("block 1: " + value);
    }

    static {
        value += "c";
        System.out.println("static block 1: " + value);
    }

    {
        value += "d";
        System.out.println("block 2: " + value);
    }

    public static void main(String[] args) {
        System.out.println("call 1: " + value);
        System.out.println(StaticInit.value);
        System.out.println("call 2: " + value);
        System.out.println(StaticInit.value);
        System.out.println("call 3: " + value);
        new StaticInit();
        System.out.println("call 4: " + value);
        new StaticInit();
        System.out.println("call 5: " + value);
        System.out.println(StaticInit.value);
        System.out.println("call 6: " + value);
    }
}
