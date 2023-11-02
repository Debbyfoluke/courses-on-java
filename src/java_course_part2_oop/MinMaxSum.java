package java_course_part2_oop;
import java.util.Arrays;
import java.util.Scanner;



public class MinMaxSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input five positive integers as an array
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Calculate the minimum and maximum values
        long minimumValue = 0;
        long maximumValue = 0;

        for (int i = 0; i < 4; i++) {
            minimumValue += numbers[i];
        }

        for (int i = 1; i < 5; i++) {
            maximumValue += numbers[i];
        }

        // Print the results as space-separated long integers
        System.out.println(minimumValue + " " + maximumValue);

        scanner.close();

    }
}

