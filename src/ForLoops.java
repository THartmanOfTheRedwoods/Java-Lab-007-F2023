import java.util.Scanner;


// ForLoops class
public class ForLoops {

    // forSum method
    public static void forSum() {
        // create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        // prompt the user to enter a number
        System.out.print("Number? ");
        // read the number as an integer
        int n = sc.nextInt();
        // initialize a variable to store the sum
        int sum = 0;
        // use a for loop to iterate from 1 to n
        for (int i = 1; i <= n; i++) {
            // add i to the sum
            sum += i;
        }
        // print the sum
        System.out.println("The sum is " + sum);
    }

    // rangeSum method
    public static void rangeSum() {
        // create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        // prompt the user to enter two numbers
        System.out.print("Number? ");
        int a = sc.nextInt();
        System.out.print("Number? ");
        int b = sc.nextInt();
        // initialize a variable to store the sum
        int sum = 0;
        // use Math.min and Math.max to find the smaller and larger number
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        // use a for loop to iterate from min to max
        for (int i = min; i <= max; i++) {
            // add i to the sum
            sum += i;
        }
        // print the sum and the range
        System.out.println("The sum is: " + sum);
        System.out.println("The sum in the above example is the result of: " + min + " + ... + " + max);
    }

    // factorial method
    public static void factorial() {
        // create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        // prompt the user to enter a number
        System.out.print("Number? ");
        // read the number as an integer
        int n = sc.nextInt();
        // initialize a variable to store the factorial
        int fact = 1;
        // use a for loop to iterate from 1 to n
        for (int i = 1; i <= n; i++) {
            // multiply i to the factorial
            fact *= i;
        }
        // print the factorial
        System.out.println(n + "! = " + fact);
    }

    public static void main(String[] args) {
        forSum();
    }
}

