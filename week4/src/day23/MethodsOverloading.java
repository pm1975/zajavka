package day23;

/**
 * @author piotr
 */
public class MethodsOverloading {
    public static void main(String[] args) {

    }

    private void overloadingMethod(String arg1, String arg2) {
        System.out.println("String arg1 + String arg2: " + arg1 + arg2);
    }

    private void overloadingMethod(String... arg1) {
        System.out.println("String arg1 + String arg2: " + arg1);
    }

    private void overloadingMethod(String arg1, String... arg2) {
        System.out.println("String arg1 + String arg2: " + arg1 + arg2);
    }
}
