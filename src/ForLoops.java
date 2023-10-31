import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() { // method forSum
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number? "); // asks user to input number
        int n = scanner.nextInt();

        int sum = 0; // sets sum to 0
        for (int i = 1; i <= n; i++) { // sets i to 1, i is less than or equal to 1, i will be incremented by 1 after each iteration
            sum += i; // adds i to sum
        }

        System.out.println("The sum is " + sum); // prints The sum is: with the calculated sum
    }

    public static void rangeSum() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number? "); // asks user to enter number
        int num1 = scanner.nextInt(); // reads the input and stores in num1
        System.out.print("Number? "); // asks user to enter number
        int num2 = scanner.nextInt(); // reads the input and stores in num2

        int min = Math.min(num1, num2); // used to determine the minimum value
        int max = Math.max(num1, num2); // used to determine the maximum value

        int sum = 0; // initializes sum to 0
        for (int i = min; i <= max; i++) { // initializes integer variable to i, sets a condition for loop to continue and specifies that i should be incremented by 1 after each iteration
            sum += i; // adds value i to sum
        }

        System.out.println("The sum is: " + sum); // prints The sum is: with the calculated sum
    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number: "); // asks for user to enter a number
        int num = scanner.nextInt(); // reads input and stores in num

        int factorial = 1; // sets factorial to 1
        for (int i = 1; i <= num; i++) { // initializes i to 1, sets conditions for loop to continue, increments i after each interation
            factorial *= i; // multiplies factorial by the value i
        }

        System.out.println("Factorial: " + factorial); // prints Factorial: with the calculated factorial
    }

    public static void main(String[] args) {
        forSum(); // calls forSum
        rangeSum(); // calls rangeSum
        factorial(); // calls factorial
    }
}
