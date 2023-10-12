import java.util.Scanner;
// WhileLoops class
public class WhileLoops {

    // eoCount method
    public static void eoCount() {
        // create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        // initialize variables to store the count of even and odd numbers
        int even = 0;
        int odd = 0;
        // use a while loop to read integers until the user enters 0
        while (true) {
            // prompt the user to enter an integer
            System.out.print("Enter an integer (0 to stop): ");
            // read the integer as an int
            int num = sc.nextInt();
            // check if the number is 0
            if (num == 0) {
                // break out of the loop
                break;
            }
            // check if the number is even or odd using modulo operator
            if (num % 2 == 0) {
                // increment the even count
                even++;
            } else {
                // increment the odd count
                odd++;
            }
        }
        // print the counts of even and odd numbers
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }

    // mean method
    public static void mean() {
        // create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        // initialize variables to store the sum and count of numbers
        int sum = 0;
        int count = 0;
        // use a while loop to read integers until the user enters -1
        while (true) {
            // prompt the user to enter an integer
            System.out.print("Enter an integer (-1 to stop): ");
            // read the integer as an int
            int num = sc.nextInt();
            // check if the number is -1
            if (num == -1) {
                // break out of the loop
                break;
            }
            // add the number to the sum
            sum += num;
            // increment the count
            count++;
        }
        // check if the count is zero to avoid division by zero error
        if (count == 0) {
            // print a message that no numbers were entered
            System.out.println("No numbers were entered.");
        } else {
            // calculate the mean as a double by dividing sum by count
            double mean = (double) sum / count;
            // print the mean with two decimal places using printf method
            System.out.printf("The mean is %.2f\n", mean);
        }
    }

    public static void main(String[] args) {
        eoCount();

    }
}