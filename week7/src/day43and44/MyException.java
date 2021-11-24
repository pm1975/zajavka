package day43and44;

public class MyException extends RuntimeException {

    public MyException() {
        super("My exception was thrown");
    }

    public MyException(String message) {
        super(message);
    }

    public MyException(String message, Throwable cause) {
        super(message, cause);
    }
}
