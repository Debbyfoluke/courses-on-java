package java_course_part3.lambdas;

public class ConsolePrinter implements Printer{
    @Override
    public void print(String message) {
        System.out.println(message);

    }
}
