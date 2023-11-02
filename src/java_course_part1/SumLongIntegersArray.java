package java_course_part1;

public class SumLongIntegersArray {
        public static void main(String[] args) {
            // Declare and initialize an array of long integers
            long[] numbers = { 1000000000L, 2000000000L, 3000000000L, 4000000000L, 5000000000L };

            // Create a variable to store the sum and initialize it to 0
            long sum = 0L;

            // Iterate through the array and add each element to the sum
            for (long num : numbers) {
                sum += num;
            }

            // Print the result
            System.out.println("Sum of the array elements: " + sum);
        }


}
