import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        int sum = 0;
        System.out.print("Number? ");
        int n = Integer.parseInt(s.nextLine());
        for (int i = 0; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }

    public static void rangeSum() {
        int sum = 0;
        System.out.print("First number? ");
        int n = Integer.parseInt(s.nextLine());
        System.out.print("Second number? ");
        int n1 = Integer.parseInt(s.nextLine());
        int min = Math.min(n,n1);
        int max = Math.max(n,n1);
        for (int i = min; i <= max; i++){ // how to make it order agnostic
            sum = sum + i;
        }
        System.out.println("The range sum is " + sum);
    }

    public static void factorial() {
        int fact = 1;
        System.out.print("Number: ");
        int n = Integer.parseInt(s.nextLine());
        for (int i = 1; i <= n; i++){
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
