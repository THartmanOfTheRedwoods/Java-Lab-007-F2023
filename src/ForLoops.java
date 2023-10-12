import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        int sum = 0;
        System.out.println("Number?");
        int n = s.nextInt();
        for (int step = 1; step <= n; n = step + 1) {
            int add = sum;
            break;
        }
        System.out.println("The sum is: " + add);
    }

    public static void rangeSum() {
    }

    public static void factorial() {
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
