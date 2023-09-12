package java_course_part2_oop;

public class UIControl {
    private boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    public void render() {

    }

//    public void enabble() {
//        isEnabled = true;
//    }
    public void  disable() {
        isEnabled = false;
    }
    public boolean isEnabled() {
        return isEnabled;
    }
}
