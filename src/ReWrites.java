import java.util.Scanner;

class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    public static void avgRewrite() { // it looks like this was already written without the break statement and without the boolean true in parenthesis so not sure what im supposed to do here
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
        Scanner in = new Scanner(System.in);
        System.out.println("Type positive integers to sum. To stop, type 0...");
        int sum = 0;

        for (int x = -1; x != 0; x = Integer.parseInt(in.nextLine())) {
            try {
                if(x <= 0) {
                    continue;
                }
                x = Integer.parseInt(in.nextLine());
                if (x <= 0) {
                    continue;
                }
                System.out.println("Adding " + x);
                sum += x;
            } catch (NumberFormatException nfe) {
                throw new RuntimeException(nfe);
            }
        }

        System.out.printf("Sum: %d%nGood Bye%n", sum);
    }

    public static void main(String[] args) {
        avgRewrite();
        sumRewrite();
    }
}