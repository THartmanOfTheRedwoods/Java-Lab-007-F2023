/**
 *
 * @author Trevor Hartman
 * @author Angelina Perez
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int even = 0,odd = 0;
        System.out.println("Enter integer(enter non integer to end):");
        while(s.hasNextInt()) {
            int n = s.nextInt();
            if(n % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Event Count: " + even);
        System.out.println("Odd Count:" + odd);
    }

    public static void mean() {
        int sum = 0, count = 0;

        System.out.println("Enter an integer(enter non integer to stop):");
        while (s.hasNextInt()) {
            int n = s.nextInt();
            sum += n;
            count++;
        }

        if (count > 0) {
            double mean = (double) sum / count;
            System.out.println("Mean: " + mean);
        } else {
            System.out.println("Enter a valid number to calculate mean.");
        }
    }

    public static void main(String[] args) {
        mean();
        eoCount();
    }
}



