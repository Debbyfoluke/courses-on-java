package java_course_part1;

public class MathClass {
    public static void main(String[] args) {
      int result = Math.round(0.0392F);
        System.out.println(result);

      int result1 = (int)Math.ceil(1.1F);
        System.out.println(result1);

       int result2 = (int)Math.floor(1.1F);
        System.out.println(result2);

        int result3 = Math.max(1,2);
        System.out.println(result3);

      int result4 = Math.min(1,2);
        System.out.println(result4);

        int result5 = (int)Math.round(Math.random() * 100);
        System.out.println(result5);
    }
}
