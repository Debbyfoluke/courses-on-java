package java_course_part1;

import java.text.NumberFormat;

public class FormattingNumbers {
    public static void main(String[] args) {
        String result =NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
}
;