//Naqibullah Haiwadpal
//11/4/2023
import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter integers. Enter 0 to stop.");

        while (true) {
            int number = s.nextInt();
            if (number == 0) {
                break;
            }

            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }

    public static void mean() {
        int sum = 0;
        int count = 0;

        System.out.println("Enter integers to calculate the mean. Enter 0 to stop.");

        while (true) {
            int number = s.nextInt();
            if (number == 0) {
                break;
            }

            sum += number;
            count++;
        }

        if (count > 0) {
            double mean = (double) sum / count;
            System.out.println("Mean: " + mean);
        } else {
            System.out.println("No valid numbers entered.");
        }
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
