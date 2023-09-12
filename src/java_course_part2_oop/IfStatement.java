package java_course_part2_oop;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
//     int temp = 30;
//     if(temp > 30){
//        System.out.println("It's a hot day");
//        System.out.println("Drink Water");
//     }else if (temp > 20)
//            System.out.println("Beautiful day");
//     else
//            System.out.println("Cold day");


//        int mark = 50;
//        if (mark >= 80)
//            System.out.println("A");
//        else if (mark >= 70)
//            System.out.println("B");
//        else if (mark >= 60)
//            System.out.println("C");
//        else if (mark >= 50)
//            System.out.println("D");
//        else if(mark >= 40)
//            System.out.println("E");
//        else
//            System.out.println("F");

//        int income = 120_000;
//        boolean hasHighIcome = (income > 100_000);

        Scanner scanner  = new Scanner(System.in);
        System.out.print("Number: ");
        int number = scanner.nextInt();


        if (number % 5 == 0){
            if (number % 3 == 0)
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);



        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else System.out.println(number);


    }
}
