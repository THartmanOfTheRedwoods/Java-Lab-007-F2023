import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int even = 0;
        int odd = 0;
        String line;
        System.out.println("Please enter a number, or press Q to quit:");
        while(!(line = s.nextLine()).equals("Q")) {
            int a = Integer.parseInt(line);
            if (a % 2 == 0){
                even++;
            } else {
                odd++;
            }
            System.out.println("Please enter a number:");
        }
        System.out.printf("You entered %s even numbers and %s odd numbers:", even, odd);
    }

    public static void mean() {
        int sum = 0;
        int count = 0;
        String line;

        System.out.println("Please enter a number, or press Q to quit:");
        while(!(line = s.nextLine()).equals("Q")) {
            int a = Integer.parseInt(line);
            sum += a;
            count++;
        }
        System.out.println("The mean is:" + sum/count);
    }

    public static void main(String[] args) {
        eoCount();
        System.out.println();
        mean();
    }
}
