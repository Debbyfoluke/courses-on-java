package java_course_part2_oop;

public class UpcastingDowncasting {
    public static void main(String[] args) {
        var control = new UIControlPolymorphisim();
        var textBox = new TextBox();
        show(control);
    }

    public static void show(UIControlPolymorphisim control) {
        if (control instanceof TextBox) {
            var textBox = (TextBox) control;
            textBox.setText("HelloWorld");
        }
        System.out.println(control);
    }
}