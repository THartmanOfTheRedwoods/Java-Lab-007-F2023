import java.util.Scanner;

class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    public static void avgRewrite() {
        String l;
        double sum = 0.0;
        int count = 0;
        System.out.println("Ths program will calculate the average of numbers entered. Begin entering and enter \"Q\" to quit.");

        for ( ; !(l = s.nextLine()).equalsIgnoreCase("Q"); count++){
            sum = sum + Integer.parseInt(l);
        }
        System.out.printf("Average is: %.3f%n", (sum/count));

        /* Old code
        while(!(l = s.nextLine()).toUpperCase().equals("Q")) {
            try {
                sum += Integer.parseInt(l);
                count++;
            } catch (NumberFormatException nfe) {}
        }
        System.out.printf("Average is: %f%n", (sum/count));
         */
    }
    public static void sumRewrite() {
        Scanner in = new Scanner(System.in);
        System.out.println("Type positive integers to sum. To stop, type 0...");
        int sum = 0;

        for (int x = -1; x != 0; sum += x){
            x = Integer.parseInt(in.nextLine());
            System.out.println("Adding " + x);
        }

        System.out.printf("Sum: %d%nGood Bye%n", sum);


        /* Old code
        while (true) {
            try {
                if(x == 0) {
                    break;
                }
                x = Integer.parseInt(in.nextLine());
                if (x <= 0) {
                    continue;
                }
                System.out.println("Adding " + x);
                sum += x;
            } catch (NumberFormatException nfe) {}
        }
         */
    }

    public static void main(String[] args) {
        avgRewrite();
        sumRewrite();
    }
}