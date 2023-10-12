import java.util.Scanner;

// ReWrites class
public class ReWrites {
    public static void main(String[] args) {
 sumRewrite();
    }
    // sumRewrite method
    public static void sumRewrite() {
        // create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        // initialize variables to store the sum and the number
        int sum = 0;
        int num = 0;
        // use a while loop to read integers until the user enters -1
        while (num != -1) { // change the condition from true to num != -1
            // prompt the user to enter an integer
            System.out.print("Enter an integer (-1 to stop): ");
            // read the integer as an int
            num = sc.nextInt();
            // check if the number is -1
            if (num == -1) {
                // remove the break statement
            } else {
                // add the number to the sum
                sum += num;
            }
        }
        // print the sum
        System.out.println("The sum is " + sum);
    }

    // avgRewrite method
    public static void avgRewrite() {
        // create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);
        // initialize variables to store the sum, count and number
        int sum = 0;
        int count = 0;
        int num = 0;
        // use a for loop instead of a while loop to read integers until the user enters -1
        for (; num != -1; count++) { // initialize count as 0 and increment it in each iteration
            // prompt the user to enter an integer
            System.out.print("Enter an integer (-1 to stop): ");
            // read the integer as an int
            num = sc.nextInt();
            // check if the number is -1
            if (num == -1) {
                // break out of the loop
                break;
            }
            // add the number to the sum
            sum += num;
        }
        // check if the count is zero to avoid division by zero error
        if (count == 0) {
            // print a message that no numbers were entered
            System.out.println("No numbers were entered.");
        } else {
            // calculate the average as a double by dividing sum by count
            double avg = (double) sum / count;
            // print the average with two decimal places using printf method
            System.out.printf("The average is %.2f\n", avg);
        }
    }
}
