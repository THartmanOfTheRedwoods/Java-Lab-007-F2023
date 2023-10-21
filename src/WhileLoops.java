import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);
    public static int catchInt() {
        int number;
        try {
            number = Integer.parseInt(s.nextLine());
        }
        catch (NumberFormatException e) {
            return -2;
        }
        return number;
        public static void eoCount() {
            int even = 0, odd = 0, number;
            while (true) {
                System.out.println("(eoCount) Enter whole number: (enter -1 to stop)");
                number = catchInt();
                if (number == -1) {
                    break;
                } else if (number <= -2|| number == 0) {
                    System.err.println("Only whole numbers");
                    continue;
                } if (number % 2 == 0) {
                    even = even + 1;
                } else {
                    odd = odd + 1;
                }
            }
            System.out.println("Even numbers: " + even);
            System.out.println("Odd numbers: " + odd);
        }

    }

    public static void mean() {
        int sum = 0, i = 1, number;
        double mean = 0;
        while (true) {
            System.out.println("(mean) Enter whole number: (enter -1 to stop)");
            number = catchInt();
            if (number == -1) {
                break;
            } else if (number <= -2|| number == 0) {
                System.err.println("Only whole numbers");
                continue;
            }
            sum = sum + number;
            mean = (double) sum / i;
            i++;
        }
        if (mean == (int) mean) {
            int meanInt = (int) mean;
            System.out.println("The mean is: " + meanInt);
        } else {
            System.out.printf("The mean is: %.4f", mean);
        }
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
