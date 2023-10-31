import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.println("Please enter a number:");
        int sum = 0;
        int end = Integer.parseInt(s.nextLine());

        for (int a=0; a < end+1; a++) {
            sum+=a;
        }
        System.out.printf("The sum from 1 to %d is %d",end,sum);
    }

    public static void rangeSum() {
        System.out.println("Please enter a number:");
        int rangeOne = Integer.parseInt(s.nextLine());
        System.out.println("Please enter another number:");
        int rangeTwo = Integer.parseInt(s.nextLine());
        int sum = 0;
        int start = Math.min(rangeOne, rangeTwo);
        int end = Math.max(rangeOne, rangeTwo);

        for (int a=start; a < end+1; a++) {
            sum+=a;
        }
        System.out.printf("The sum from %d to %d is %d",start,end,sum);
    }

    public static void factorial() {
        System.out.println("Please enter a number:");
        int sum = 1;
        int start = Integer.parseInt(s.nextLine());
        int end = 1;

        for (int a=start; a > end; a--) {
            sum = sum * a;
        }
        System.out.printf("The factorial of %d is %d",start,sum);
    }

    public static void main(String[] args) {
        forSum();
        System.out.println();
        rangeSum();
        System.out.println();
        factorial();
    }
}
