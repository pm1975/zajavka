package day43and44;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            printSomething1("ThRoW");
        } catch (Exception e) {
            System.out.println("Exception was thrown: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void printSomething1(final String input) {
        printSomething2(input);
    }

    private static void printSomething2(final String input) {
        try {
            printSomething3(input);
        } catch (MyException e) {
            throw new MyOtherException("My other exception message", e);
        }
    }

    private static void printSomething3(final String input) {
        printSomething4(input);
    }

    private static void printSomething4(final String input) {
        if ("Throw".equalsIgnoreCase(input)) {
//            throw new RuntimeException("My runtime exception");
            throw new MyException("My runtime exception");
        } else {
            System.out.println(input);
        }
    }

}
