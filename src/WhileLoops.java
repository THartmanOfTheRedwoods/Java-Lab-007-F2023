/**
 *
 * @author Trevor Hartman
 * @author Cassandra Portlock
 *
 * @since Version 1
 *
 */

import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int evenCount = 0;
        int oddCount = 0;
        boolean shouldContinue = true;

        System.out.println("Numbers to count?");

        while (shouldContinue) {
            if (s.hasNextInt()) {
                int num = s.nextInt();

                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            } else {
                shouldContinue = false;
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }

    public static double mean() {
        double sum = 0.0;
        int count = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Numbers to calculate the mean?");

        while (s.hasNext()) {
            if (s.hasNextInt()) {
                int num = s.nextInt();
                sum += num;
                count++;
            } else {
                break;
            }
        }

        if (count > 0) {
            double mean = sum / count;
            System.out.printf("The mean is %s", mean);
            return mean;
        } else {
            System.out.println("No valid integers entered. Mean cannot be calculated.");
            return 0.0;
        }
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
