import java.util.Scanner;

/**
 * @author Olivia McKittrick
 * @date 10/31/2023
 */
public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        Scanner scanner = new Scanner(System.in); // reads integers from System.in

        int evenCount = 0; // even integers separated from odd
        int oddCount = 0; // odd

        System.out.println("Enter integers (0 to exit):"); // Prints question for user asking for a variation of numbers to use to calculate how many even and odd #'s
        int num; // declaring variable num

        while(true) { // while statement that makes loop indefinite.
            num = scanner.nextInt();

            if (num == 0) { // if the user enters 0, the loop ends
                break;
            }

            if (num % 2 == 0) { // verifies whether number is even or odd by checking if it is divisible by 2
                evenCount++;
            } else { // if not, it is odd
                oddCount++;
            }
        }

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }

    public static void mean() { // method mean
        Scanner scanner = new Scanner(System.in);

        int sum = 0; // declares the variable sum as 0
        int count = 0; // declares the variable count as 0

        System.out.println("Enter integers (0 to calculate mean):"); // asks user to enter numbers to calculate the mean
        int num;

        while (true) { // while statement which remains true
            num = scanner.nextInt();

            if (num == 0) { // until broken when user enters 0
                break;
            }

            sum += num; // num value stored in sum
            count++; // keeps track of how many numbers have been entered
        }

        if (count > 0) { // if the number is greater than 0
            double mean = (double) sum / count; // calculating the average number of a set of numbers
            System.out.println("Mean: " + mean); // prints the mean with Mean:
        } else {
            System.out.println("No numbers entered.");
        }
    }

    public static void main(String[] args) {
        eoCount(); // calls eoCount
        mean(); // calls mean
    }
}
