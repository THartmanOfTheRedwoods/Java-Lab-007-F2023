/**
 * @author T. Hartman
 * @author MJ Fracess
 * @since Version 1.0
 */

import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        int even = 0;       //Creates a count for even numbers
        int odd = 0;        //Creates a count for odd numbers
        do {
            System.out.println("Enter a number");  //requesting a number from the user
            int num = Integer.parseInt(s.nextLine());   //reads that number into a variable
            if (num % 2 == 0) {         //if the number is even it will add 1 to the count
                even++;
            } else {                    //if the number is odd it will add 1 to the count
                odd++;
            }
        }
        while (even < 3 && odd < 3); //if 3 even or odd numbers are entered the loop will end

        System.out.printf("%d Even numbers have been entered%n%d Odd number have been entered%n", even, odd);
    }

    public static void mean() {

        double sum = 0;
        int count = 0;

        System.out.println("Enter a number to calculate the mean");  //requesting a number from the user
        while (true) {
            if (s.hasNextInt()) {
                int num = s.nextInt();
                sum += num;
                count++;
            } else {
                System.out.println("Please try again and enter valid numbers 1 and up");
                break;
            }
            if (count > 0) {
                double mean = sum / count;
                System.out.println("Mean of the entered numbers: " + mean);
                System.out.println("Enter another number to continue calculating the mean of all numbers entered");
            } else {
                System.out.println("Please try again and enter valid number 1 and up");
            }
        }
    }

    public static void main (String[]args){
            eoCount();
            mean();
        }
    }


