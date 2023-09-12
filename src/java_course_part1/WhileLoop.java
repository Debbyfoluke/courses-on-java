package java_course_part1;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")){
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        do {
            System.out.println("Input");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        } while (!input.equals("quit"));


        while (true) {
            System.out.println("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue;
            if (input.equals("quit"))
                 break;
            System.out.println(input);
        }
    }
}
