//Naqibullah Haiwadpal
//11/4/2023
import java.util.Scanner;

class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    public static void avgRewrite() {
        String line;
        double sum = 0.0;
        int count = 0;

        System.out.println("This program will calculate the average of numbers entered. Begin entering numbers and enter \"Q\" to quit.");

        while (!(line = s.nextLine()).toUpperCase().equals("Q")) {
            try {
                double number = Double.parseDouble(line);
                sum += number;
                count++;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input. Please enter a number.");
            }
        }

        if (count > 0) {
            System.out.printf("Average is: %.2f%n", (sum / count));
        } else {
            System.out.println("No valid numbers entered.");
        }
    }

    public static void sumRewrite() {
        System.out.println("Type positive integers to sum. To stop, type 0...");
        int sum = 0;

        while (true) {
            try {
                int x = Integer.parseInt(s.nextLine());

                if (x == 0) {
                    break;
                }

                if (x < 0) {
                    System.out.println("Please enter a positive integer.");
                    continue;
                }

                System.out.println("Adding " + x);
                sum += x;
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input. Please enter a positive integer.");
            }
        }

        System.out.printf("Sum: %d%nGood Bye%n", sum);
    }

    public static void main(String[] args) {
        avgRewrite();
        sumRewrite();
    }
}
