/**
 *
 * @author Trevor Hartman
 * @author Cameron Meng
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args){
        eoCount();
        mean();
    }
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int oddCount = 0;
        int evenCount = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter integers (enter the number 0 to stop): ");
        int number = s.nextInt();

        while (number > 0) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            System.out.print("Enter another integer: ");
            number = s.nextInt();
        }

        System.out.println("Number of even integers: " + evenCount);
        System.out.println("Number of odd integers: " + oddCount);
    }

    public static void mean() {
        int total = 0;
        int count = 0;

        System.out.println("Enter integers (enter 0 to stop): ");
        int number = s.nextInt();
        while (number != 0) {
            total += number;
            count++;

            System.out.print("Enter another integer: ");
            number = s.nextInt();
        }
        if (count > 0) {
            double average = (double) total / count;
            System.out.println("The average is " + average);
        } else {
            System.out.println("No numbers entered, cannot calculate the average.");
        }
    }
}
