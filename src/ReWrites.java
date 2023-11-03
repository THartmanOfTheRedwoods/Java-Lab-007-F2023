import java.util.Scanner;

class ReWrites {
    private final static Scanner s = new Scanner(System.in);

    public static void sumRewrite() {
        Scanner in = new Scanner(System.in);

        int x = -1;
        int sum = 0;
        int y = 0;

                for (y =x; x!=0; sum+= x) {
                    System.out.println("Type positive integers to sum. To stop, type 0...");
                    x = Integer.parseInt(in.nextLine());
                    System.out.println("Adding " + x);
                }
        System.out.printf("Sum: %d%nGood Bye%n", sum);
        }


    public static void avgRewrite() {
        String l;
        double sum = 0.0;
        int count = 0;
        System.out.println("Ths program will calculate the average of numbers entered. Begin entering and enter \"Q\" to quit.");
        for (l = s.nextLine(); !(l = s.nextLine()).toUpperCase().equals("Q"); count++)

                sum += Integer.parseInt(l);

        System.out.printf("Average is: %f%n", (sum/count));
    }

    public static void main(String[] args) {
        sumRewrite();
        avgRewrite();

    }
}