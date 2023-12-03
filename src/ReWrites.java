/**
 *
 * @author Trevor Hartman
 * @author Cameron Meng
 *
 * @since Version 1.0
 *
 */
import java.util.Scanner;

class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    public static void avgRewrite() {
        String l;
        double sum = 0.0;
        int count = 0;
        System.out.println("Ths program will calculate the average of numbers entered. Begin entering and enter \"Q\" to quit.");
        while(!(l = s.nextLine()).toUpperCase().equals("Q")) {
            try {
                sum += Integer.parseInt(l);
                count++;
            } catch (NumberFormatException nfe) {}
        }

        System.out.printf("Average is: %f%n", (sum/count));
    }
    public static void sumRewrite() {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Type positive integers to sum. To stop, type 0...");

        int num = -1;
        int sum = 0;

        for (; ; ) {
            try {
                num = Integer.parseInt(inputScanner.nextLine());

                if (num > 0) {
                    System.out.println("Adding " + num);
                    sum += num;
                } else if (num == 0) {
                    break;
                } else {
                    System.out.println("Please enter a positive integer or 0 to stop.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 0 to stop.");
            }
        }

        System.out.printf("Sum: %d%nGoodbye%n", sum);
        inputScanner.close();
    }
    public static void main(String[] args) {
        avgRewrite();
        sumRewrite();
    }
}