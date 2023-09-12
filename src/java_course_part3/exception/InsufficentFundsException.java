package java_course_part3.exception;

public class InsufficentFundsException extends Exception {
    public InsufficentFundsException() {
        super("Insufficient funds in your account.");
    }
    public InsufficentFundsException(String message) {
        super(message);
    }
}
