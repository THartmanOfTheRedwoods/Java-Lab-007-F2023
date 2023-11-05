import java.util.Scanner;

class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    public static void avgRewrite() {
        String l;
        double sum = 0.0;
        int count = 0;
        System.out.println("This program will calculate the average of numbers entered. Begin entering and enter \"Q\" to quit.");
        for (; !(l = s.nextLine()).toUpperCase().equals("Q"); count++) {
            try {
                sum += Integer.parseInt(l);
            } catch (NumberFormatException nfe) {}
        }

        if (count > 0) {
            double average = sum / count;
            System.out.printf("Average is: %.2f%n", average);
        } else {
            System.out.println("No valid numbers entered.");
        }

        s.close();
    }
    public static void sumRewrite() {
        System.out.println("Type positive integers to sum. To stop, type 0...");
        int x = -1;
        int sum = 0;

        while (x != 0) {
            try {
                x = Integer.parseInt(s.nextLine());
                if (x <= 0) {
                    continue;
                }
                System.out.println("Adding " + x);
                sum += x;
            } catch (NumberFormatException nfe) {}
        }

        System.out.printf("Sum: %d%nGood Bye%n", sum);
    }

    public static void main(String[] args) {
        sumRewrite();
        avgRewrite();
    }
}