package java_course_part1;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
//
        String name = scanner.nextLine();
        System.out.println("You are " + name);
    }
}
