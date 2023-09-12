package java_course_part2_oop;

public class CheckBoxMain {
    public static void main(String[] args) {
        UIControlPolymorphisim[]  controls = { new UIControlPolymorphisim(), new TextBox(), new CheckBox() };
      for (var control : controls)
          control.render();
    }
}
