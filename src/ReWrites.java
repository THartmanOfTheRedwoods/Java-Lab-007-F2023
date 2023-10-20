import java.util.Scanner;

class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    /**
     * Takes user int values, calculates the mean of the user int values, and prints mean to terminal
     * @author Atticus Blanco
     */
    public static void avgRewrite() {
        String l;
        double sum = 0.0;
        int count = 0;
        System.out.println("Ths program will calculate the average of numbers entered. Begin entering and enter \"Q\" to quit.");

        for (;;) {
            l = s.nextLine();
            if (l.equalsIgnoreCase("Q")) {
                break;
            }

            sum += Integer.parseInt(l);
            count++;
        }

        System.out.printf("Average is: %f%n", (sum/count));
    }

    /**
     * Takes user int values, adds all user int values, then prints sum to terminal
     * @author Atticus Blanco
     */
    public static void sumRewrite() {
        Scanner in = new Scanner(System.in);
        System.out.println("Type positive integers to sum. To stop, type 0...");
        int x = -1;
        int sum = 0;

        while (x != 0) {
            x = Integer.parseInt(in.nextLine());
            System.out.println("Adding " + x);
            sum += x;
        }

        System.out.printf("Sum: %d%nGood Bye%n", sum);
    }

    /**
     * Initiates avgRewrite method and sumRewrite method
     * @author Atticus Blanco
     */
    public static void main(String[] args) {
        avgRewrite();
        sumRewrite();
    }
}