import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int evenCount = 0;
        int oddCount = 0;

        System.out.println("Enter Integers (To stop enter a non integer): ");

        while (s.hasNextInt()) {
            int num = s.nextInt();
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even #'s: " + evenCount);
        System.out.println("Odd #'s: " + oddCount);

    }

    public static void mean() {
        int sum = 0;
        int count = 0;

        System.out.println("Enter integers (enter a non-integer to stop):");

        while (s.hasNextInt()) {
            int number = s.nextInt();
            sum += number;
            count++;
        }

        if (count > 0) {
            double mean = (double) sum / count;
            System.out.println("Mean: " + mean);
        } else {
            System.out.println("No integers entered.");
        }

        s.close();
    }



    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
