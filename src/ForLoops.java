import java.util.Scanner;

public class ForLoops {
    public static void forSum() {
        Scanner s = new Scanner(System.in);
        System.out.print("Number? ");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }

    public static void rangeSum() {
        Scanner s = new Scanner(System.in);
        System.out.print("Number? ");
        int a = s.nextInt();
        System.out.print("Number? ");
        int b = s.nextInt();
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }

    public static void factorial() {
        Scanner s = new Scanner(System.in);
        System.out.print("Number: ");
        int n = s.nextInt();
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        System.out.println("Factorial: " + fact);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}