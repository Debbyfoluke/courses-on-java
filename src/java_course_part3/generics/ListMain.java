package java_course_part3.generics;

public class ListMain {
    public static void main(String[] args) {
       var list = new List();
       list.add(Integer.valueOf(1));
       list.add("1");
       list.add(new User());

       int number = (int) list.get(1);
    }
}
