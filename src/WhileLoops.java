import java.util.Scanner;
public class WhileLoops {
    private final static Scanner scan = new Scanner(System.in);
    public static void eoCount() {
        int evenNums = 0;
        int oddNums = 0;
        while (true) {
            System.out.println("Type in a number: ");
            int input = scan.nextInt();
            if (input % 2 == 0) {
                evenNums = evenNums + 1;
            }
            else {
                oddNums = oddNums + 1;
            }
            if (evenNums == 5 || oddNums == 5) {
                System.out.println("You entered " + evenNums + " even numbers and " + oddNums + " odd numbers.");
                break;
            }
        }
    }
    public static void mean() {
        int numbersEntered = 0;
        int input = 0;
        while (true) {
            System.out.println("Type in a number: ");
            input = input + scan.nextInt();
            numbersEntered = numbersEntered + 1;
            if (numbersEntered == 5) {
                System.out.println("The mean of the numbers you entered is approximately " + input/5);
                break;
            }
        }
    }
    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
