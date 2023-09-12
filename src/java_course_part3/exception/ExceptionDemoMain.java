package java_course_part3.exception;

import java.io.IOException;

public class ExceptionDemoMain {
    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
        } catch (Throwable e) {
            System.out.println("An unexpected error occurred.");
        }

    }
}
