package day24;

/**
 * @author piotr
 */
public class Autoboxing {
    public static void main(String[] args) {
        byte a = 3;
        short b = 10;
        int c = 19;
        long d = 12;
        char e = 's';

        Byte aC = a;
        Short bC = b;
        Integer cC = c;
        Long dC = d;
        Character eC = e;

        int f = cC;

        method(c, b);

        String as = "12";
        int bs = Integer.parseInt(as);


    }

    private static void method(Integer a, Short b) {
        System.out.println(a + b);
    }
}
