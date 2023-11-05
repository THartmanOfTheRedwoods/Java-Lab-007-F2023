import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {

        System.out.print("Number: ");
        int n = s.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);
    }

    public static void rangeSum() {

        System.out.print("Number? ");
        int num1 = s.nextInt();
        System.out.print("Number? ");
        int num2 = s.nextInt();

        int start = Math.min(num1, num2);
        int end = Math.max(num1, num2);

        int sum = 0;

        for (int i = start; i <= end; i++) {
            sum += i;
        }

        System.out.println("The sum is: " + sum);

    }

    public static void factorial() {

        System.out.print("Number: ");
        int number = s.nextInt();

        int factorial = 1;

        for (int i = number; i > 0; i--) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);

        s.close();
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
