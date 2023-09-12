package java_course_part2_oop;

public class UIControlMain {
    public static void main(String[] args) {
        var control = new TextBox();
        control.disable();
        System.out.println(control.isEnabled());
    }
}
