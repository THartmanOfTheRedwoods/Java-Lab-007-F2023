import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.println("Number? ");
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
    }

    public static void rangeSum() {
        Scanner s = new Scanner(System.in);
        System.out.println("Number? ");
        int a = s.nextInt();
        System.out.println("Number? ");
        int b = s.nextInt();
        int sum = 0;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        System.out.println("The sum is: " + sum);
        System.out.println("The sum in the above example is the result of: " + min + " + ... + " + max);
    }

    public static void factorial() {
        Scanner s = new Scanner(System.in);
        System.out.println("Number? ");
        int n = s.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            System.out.println(n + "! = " + fact);
        }
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
