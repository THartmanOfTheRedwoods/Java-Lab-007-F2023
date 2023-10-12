import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Enter an integer or -1 to stop:");
        int input = s.nextInt();
        while (input != -1) {
            if (input % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            System.out.println("Enter another integer or -1 to stop:");
            input = s.nextInt();
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }

    public static void mean() {
        int sum = 0;
        int count = 0;
        System.out.println("Enter an integer or -1 to stop:");
        int input = s.nextInt();
        while (input != -1) {
            sum += input;
            count++;
            System.out.println("Enter another integer or -1 to stop:");
            input = s.nextInt();
        }
        if (count > 0) {
            double mean = (double) sum / count;
            System.out.println("Mean: " + mean);
        } else {
            System.out.println("No numbers entered.");
        }
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}