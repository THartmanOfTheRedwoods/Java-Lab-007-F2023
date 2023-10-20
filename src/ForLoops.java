import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);
    private static int resultTotal = 0;

    /**
     * Prompts user for an int value, adds all int values up to user's int value, then prints sum to terminal
     * @author Atticus Blanco
     */
    public static void forSum() {
        System.out.print("Number? ");
        int userInt = Integer.parseInt(s.nextLine());

        for (int i = 0; i <= userInt; i++) {
            resultTotal += i;
        }

        System.out.println("The sum is " + resultTotal);
    }

    /**
     * Takes two user int values, adds all values between them inclusively, then prints sum to terminal
     * @author Atticus Blanco
     */
    public static void rangeSum() {
        resultTotal = 0;

        System.out.print("Number? ");
        int userInt1 = Integer.parseInt(s.nextLine());
        System.out.print("Number? ");
        int userInt2 = Integer.parseInt(s.nextLine());
        if (userInt1 < userInt2) {
            for (int i = userInt1; i <= userInt2; i++) {
                resultTotal += i;
            }
        } else if (userInt2 < userInt1) {
            for (int i = userInt2; i <= userInt1; i++) {
                resultTotal += i;
            }        }
        System.out.println("The sum is: " + resultTotal);
    }

    /**
     * Takes a user int value, calculates the factorial, then prints product to terminal
     * @author Atticus Blanco
     */
    public static void factorial() {
        resultTotal = 1;

        System.out.print("Number? ");
        int userFactorial = Integer.parseInt(s.nextLine());

        for (int i = 1; i <= userFactorial; i++) {
            resultTotal *= i;

        }
        System.out.println("Factorial: " + resultTotal);
    }

    /**
     * Initiates forSum method, rangeSum method, and factorial method
     * @author Atticus Blanco
     */
    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
