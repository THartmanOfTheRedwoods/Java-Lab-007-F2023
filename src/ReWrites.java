/* Java Lab 007
 * Finn Clark
 * 10/14/23
 * CIS - 12
 * Hartman*/

import java.util.Scanner;

class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    public static void avgRewrite() {
        double sum = 0.0;
        int count = 0;
        System.out.println("Ths program will calculate the average of numbers entered. Begin entering and enter \"Q\" to quit.");
        String l = s.nextLine();
        for (count = 1; !(l.equals("Q")); count++) {
            sum += Integer.parseInt(l);
            if (s.nextLine().equalsIgnoreCase("Q")){
                break;
            }
        }
        System.out.printf("Average is: %f%n", (sum / count));
    }

    public static void sumRewrite() {
        Scanner in = new Scanner(System.in);
        System.out.println("Type positive integers to sum. To stop, type 0...");
        int x = -1;
        int sum = 0;
        while (true) {
            try {
                if(x == 0) {
                    System.out.printf("Sum: %d%nGood Bye%n", sum);
                    return;
                }
                x = Integer.parseInt(in.nextLine());
                if (x >= 0) {
                    System.out.println("Adding " + x);
                    sum += x;
                    continue;
                }
            } catch (NumberFormatException nfe) {}
        }

    }

    public static void main(String[] args) {
        avgRewrite();
        sumRewrite();
    }
}