import java.util.Scanner;
import static java.util.stream.IntStream.range;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.println("enter a number ");
        int number = s.nextInt();
        int sum = 0;
        for(int s = 1; s <= number; s++){

sum = sum + s;
System.out.println("the sum is " + sum);
        }
    }

    public static void rangeSum() {
        System.out.println("enter a number ");
        int number = s.nextInt();
        System.out.println("enter a number ");
        int number1 = s.nextInt();
        int sum = 0;
        for(int s = number; s <= number1; s++){
            sum = sum + s;

System.out.println("The sum is " + sum);
        }
    }

    public static void factorial() {
        System.out.println("enter a number ");
        int number = s.nextInt();

        for(int s = 1; s < number; s++){

            System.out.print(number*s);
        }
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
