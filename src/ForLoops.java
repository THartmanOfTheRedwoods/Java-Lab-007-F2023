/**
 *
 * @author Trevor Hartman
 * @author Cassandra Portlock
 *
 * @since Version 1
 *
 */

import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static int forSum() {
        System.out.print("Number? ");
        int n = s.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
        return sum;
    }

    public static int rangeSum() {
        System.out.print("Number: ");
        int num1 = s.nextInt();

        System.out.print("Number: ");
        int num2 = s.nextInt();

        int lower = Math.min(num1, num2);
        int higher = Math.max(num1, num2);

        int sum = 0;
        for (int i = lower; i <= higher; i++) {
            sum += i;
        }

        System.out.printf("The sum is: %s ", sum);
        System.out.println();
        return sum;
    }

    public static int factorial() {
        System.out.print("Number: ");
        int n = s.nextInt();

        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *=i;
        }

        System.out.printf("Factorial: %s", factorial);
        System.out.println();
        return factorial;
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
