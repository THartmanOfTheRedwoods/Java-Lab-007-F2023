import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.print("Number? ");
        int userInt = Integer.parseInt(s.nextLine());
        int userSum = 0;

        for (int i = 0; i <= userInt; i++) {
            userSum += i;
        }

        System.out.println("The sum is " + userSum);
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
