package java_course_part3.exception;

public class AccountException  extends Exception {
    public AccountException(Exception cause) {
        super(cause);
    }
}
