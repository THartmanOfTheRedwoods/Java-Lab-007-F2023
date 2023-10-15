/* Java Lab 007
* Finn Clark
* 10/14/23
* CIS - 12
* Hartman*/

import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static int forSum() {
        int sum = 0;
        System.out.println("Number?");
        int n = s.nextInt();
        for (int step = 1; step <= n; step++) {
            sum += step;
        }System.out.println("The sum is: " + sum);
        return sum;
    }

   public static void rangeSum() {
        int range = 0;
        System.out.println("Number?");
        int start = s.nextInt();
        System.out.println("Number?");
        int end = s.nextInt();

        if (start > end) {
            for (int i = end; i < start; i++){
                range += i;
            }
        }
        for (int i = start; i < end; i++){
                range += i;
        }
        System.out.println("The sum is: " + range);
    }

    public static void factorial() {
        System.out.println("Enter a number to find the factorial: ");
        int input = s.nextInt();
        int count = 0;
        int fact = 1;
        for (int i = input; i > 0; i--, count++){
            fact *= i;
        }
        System.out.printf("Number: %d%n", input );
        System.out.println("Factorial: " + fact);

    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
