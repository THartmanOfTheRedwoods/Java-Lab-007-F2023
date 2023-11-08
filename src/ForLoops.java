/**
 * @author T. Hartman
 * @author MJ Fracess
 * @since Version 1.0
 */

import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.println("Enter a number to calculate if all the digits\n...starting at 1 through to the number you entered\nwere added together");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.printf("The sum is %d%n", sum );
    }
        /* this was my first attempt and while I don't think it is wrong I think you were looking for something more simple.
        I don't know why I tend to overcomplicate it at first.
        while (true) {
            if (s.hasNextInt()) {
                int n = s.nextInt();

                if (n>=1){
                    int sum = 0;
                    for (int i = 1; i <= n; i++){
                        sum += i;
                    }
                    System.out.print("The sum is "+ sum);
                } else {
                    System.out.println("Please try again and enter valid number 1 and up");
                }
            } else {
                System.out.println("Please try again and enter valid numbers 1 and up");
                break;
            }
        */


    public static void rangeSum() {
        System.out.println("Enter two numbers and then enter to calculate if all the digits from one to the other");
        int a = s.nextInt();
        int b = s.nextInt();
        int min = Math.min (a,b);
        int max = Math.max (a,b);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.printf("The sum is %d%n", sum);
    }

    public static void factorial() {
        System.out.println("Enter a number to calculate it's factorial");
        int n = s.nextInt();
        int f = 1;

        for (int i = 1; i <= n; i++) {
            f *= i;
        }
        System.out.print("The factorial is "+ f);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
