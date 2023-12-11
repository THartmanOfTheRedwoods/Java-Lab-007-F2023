/**
 *
 * @author Trevor Hartman
 * @author Angelina Perez
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.println("Number?");
        int n = 0;
        int in = s.nextInt();
        int sum = 0;
        for(int i=1; i <= n; i++) {
            sum+= i;
        }
        System.out.println("The sum is" + sum);
    }

    public static void rangeSum() {
        int one = s.nextInt();
        System.out.println("Number? ");
        int two = s.nextInt();
        System.out.println("Number? ");
        int sum = 0;
        int start = Math.min(one, two);
        int end = Math.max(one,two);
        for(int i = start; i <= end; i++) {
            sum+= i;
        }
        System.out.println("The sum is: " + sum);
    }

    public static void factorial() {
        int number = s.nextInt();
        System.out.println("Number:");
        int factorial =1;
        for(int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
