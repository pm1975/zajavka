package day43and44;

public class MyOtherException extends RuntimeException {

    public MyOtherException() {
        super("My order exception was thrown");
    }

    public MyOtherException(String message) {
        super(message);
    }

    public MyOtherException(String message, Throwable cause) {
        super(message, cause);
    }
}
