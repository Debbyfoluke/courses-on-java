package java_course_part2_oop;

public class TextBoxMain {
    public static void main(String[] args) {
        var textBox = new TextBox();
        textBox.setText("Hello World");
        System.out.println(textBox);


//        I commented this code out because the field is private
//        textBox1.setText("Box1");
//        System.out.println(textBox1.text.toUpperCase());
//
//        var textBox2 = new TextBox();
//        textBox2.setText("Box2");
//        System.out.println(textBox2.text);

    }
}

