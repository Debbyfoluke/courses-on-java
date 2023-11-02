package java_course_part2_oop;

    import java.util.Scanner;

    public class StairCase {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get the size of the staircase from the user
            System.out.print("Enter the size of the staircase: ");
            int n = scanner.nextInt();

            printStaircase(n);

            scanner.close();
        }

        public static void printStaircase(int n) {
            for (int i = 1; i <= n; i++) {
                // Print spaces to align the staircase to the right
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }

                // Print '#' characters for the staircase steps
                for (int k = 1; k <= i; k++) {
                    System.out.print("#");
                }

                // Move to the next line for the next row
                System.out.println();
            }
        }
    }


