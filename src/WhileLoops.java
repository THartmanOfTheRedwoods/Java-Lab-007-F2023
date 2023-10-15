/* Java Lab 007
 * Finn Clark
 * 10/14/23
 * CIS - 12
 * Hartman*/

import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);
    public static String enter = "Enter an integer or Q to quit: ";

    public static void eoCount() {
        System.out.println(enter);
        String in = s.nextLine();
        int e = 0;
        int o = 0;
        while (!in.toUpperCase().equals("Q")) {
            int num = Integer.parseInt(in);
            if (num % 2 == 0) {
                e++;
            } else {
                o++;

            }
            System.out.println(enter);
            in = s.nextLine();
        }
        System.out.printf("You entered %d even number(s) and %d odd number(s)", e, o);
    }

    public static String part2 = "Enter any amount of numbers to find the mean (any non-number entered will calculate): ";

    public static void mean() {
        Scanner input = new Scanner(System.in);
        System.out.printf("%n" + part2);
        double sum = 0;
        double count = 0;
        while (input.hasNextDouble()) {
            double num = input.nextDouble();
            sum += num;
            count++;
        }
        if (count == 0) {
            System.out.println("No numbers entered to calculate mean");
        } else {
            double mean = sum / count;
            System.out.println("The mean of numbers entered is: " + mean);
        }
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}

