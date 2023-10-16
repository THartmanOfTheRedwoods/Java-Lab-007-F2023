import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int even = 0;
        int odd = 0;

        while (true) {
            System.out.println("Please enter a number:");
            int number = s.nextInt();
            if (number % 2 == 0) {
                even += number;

            }
            else {
                odd += number;
            }
            System.out.println("Odd total equals " + odd);
            System.out.println("Even total equals " + even);
            }
        }


    public static void mean() {
            int sum = 0;
            int count = 0;
            double mean = 0.0;
            while (true) {
                System.out.println("Please enter a number:");
                int number = s.nextInt();
                // collecting the amount of times its adding
                count += 1;
                // adds the sum each time you enter a number
                sum += number;
                // gets the mean
                mean = (double) sum / count;
                System.out.println("Mean : " + mean);

            }

    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
