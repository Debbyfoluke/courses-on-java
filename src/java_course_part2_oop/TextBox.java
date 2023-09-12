package java_course_part2_oop;

public class TextBox extends UIControlPolymorphisim {
    public String text = "";


//    public TextBox() {
//        super(true);
//        System.out.println("TextBox");
//    }


    @Override
    public void render() {
        System.out.println("Render TextBox");
    }

    @Override
    public String toString() {
        return text;

    }

    public void setText(String text) {
        this.text = text;
    }
    public void clear() {
        text = "";
    }
}
