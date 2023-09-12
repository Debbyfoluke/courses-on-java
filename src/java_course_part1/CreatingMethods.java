package java_course_part1;

public class CreatingMethods {
    public static void main(String[] args) {
      String message =  greetUser("Mosh", "Hamedani");
        greetUser("John", "Reddy");
    }
    public  static String  greetUser(String firstName, String lastName) {
       return  "Hello " + firstName + " " + lastName;
    }
}
