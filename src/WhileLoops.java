// Daniel Faulkner Lab 007 10/14/23
import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int even = 0;
        int odd = 0;
        while (true) {
            System.out.println("Enter integer or 0 to stop: ");
            int num = s.nextInt();
            if (num == 0) {
                break;
            }
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Here are the even numbers: " + even);
        System.out.println("Here are the odd numbers: " + odd);
    }

    public static void mean() {
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
