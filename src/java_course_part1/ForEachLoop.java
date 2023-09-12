package java_course_part1;

public class ForEachLoop {
    public static void main(String[] args) {
       String[]  fruits = {"Apple", "Mango", "Orange"};

       for (int i = fruits.length; i > 0; i--)
           System.out.println(i);

       for (String fruit : fruits)
           System.out.println(fruit);
    }
}
