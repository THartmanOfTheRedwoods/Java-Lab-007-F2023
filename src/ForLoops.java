//Naqibullah Haiwadpal
//11/4/2023
import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.print("Number? ");
        int n = s.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum is " + sum);
    }

    public static void rangeSum() {
        System.out.print("Number? ");
        int num1 = s.nextInt();
        System.out.print("Number? ");
        int num2 = s.nextInt();
        int smaller = Math.min(num1, num2);
        int larger = Math.max(num1, num2);
        int sum = 0;

        for (int i = smaller; i <= larger; i++) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);
    }

    public static void factorial() {
        System.out.print("Number: ");
        int num = s.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
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
