import java.util.Scanner;

public class ForLoops {
    private final static Scanner scan = new Scanner(System.in);

    public static void forSum() {
        System.out.println("Type in a number: ");
        int userInput = scan.nextInt();
        int i = 0;
        int sum = 0;
        for (i = 0; i <= userInput; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is " + sum);
    }

    public static void rangeSum() {
        System.out.println("Type in a number: ");
        int userInput1 = scan.nextInt();
        System.out.println("Type in another number: ");
        int userInput2 = scan.nextInt();
        int sum = 0;
        if (userInput1 > userInput2) {
            int i = userInput2;
            for (i = userInput2; i <= userInput1; i++) {
                sum = sum + i;
            }
        } else {
            int i = userInput1;
            for (i = userInput1; i <= userInput2; i++) {
                sum = sum + i;
            }
        }
        System.out.println("The sum is " + sum);
    }

    public static void factorial() {
        System.out.println("Type in a number: ");
        int userInput = scan.nextInt();
        int i = 1;
        int fact = 1;
        for (i = 1; i <= userInput; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of the number you entered is " + fact);
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
