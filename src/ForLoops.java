import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);
    public static int catchInt() {
        int number;
        try {
            number = Integer.parseInt(s.nextLine());
        } catch (NumberFormatException e) {
            return 0;
        }
        return number;
    }
    public static void forSum() {
        int number, sum = 0;
        System.out.println("(forSum) Enter whole number: ");
        number = catchInt();
        if (number <= 0)
        {
            System.err.println("Only whole numbers");
            return;
        }
        for (int i = 0; i <= number; i++)
        {
            sum = sum + i;
        }
        System.out.println("The sum is: "+sum);
    }

    public static void rangeSum() {
        int number, numberLow, numberHigh, sum = 0;
        System.out.println("(rangeSum) Enter a whole number: ");
        numberHigh = catchInt();
        if (numberHigh <= 0) {
            System.err.println("Only whole numbers");
            return;
        }
        System.out.println("(rangeSum) Enter a whole number: ");
        numberLow = catchInt();
        if (numberLow <= 0) {
            System.err.println("Only whole numbers");
            return;
        }

        if (numberLow > numberHigh) {
            number = numberHigh;
            numberHigh = numberLow;
            numberLow = number;
        }
        for (int i = numberLow; i <= numberHigh; i++) {
            sum = sum + i;
        }
        System.out.println("The rangeSum is: " + sum);
    }

    public static void factorial() {
        int number, factorial = 1;
        System.out.println("(factorial) Enter whole number: ");
        number = catchInt();
        if (number <= 0)
        {
            System.err.println("Only whole numbers");
            return;
        }
        for (int i = number; i >= 1; i--)
        {
            factorial = factorial * i;
        }
        System.out.println("Factorial: "+factorial);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
