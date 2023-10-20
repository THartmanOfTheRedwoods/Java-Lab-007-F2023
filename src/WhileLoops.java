import java.util.Scanner;
import java.util.ArrayList;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    /**
     * Identifies a user int value as even or odd. All even, or all odd, values up to the user int value is added and printed to terminal
     * @author Atticus Blanco
     */
    public static void eoCount() {
        ArrayList<Integer> eoArray = new ArrayList<>();

        int eoSum = 0;
        System.out.println("Enter an integer value");
        int userInt = Integer.parseInt(s.nextLine());

        if (userInt % 2 == 0) {
            while (userInt > 0) {
                eoArray.add(userInt);
                userInt -= 2;
            }

            for (int evenValue: eoArray) {
                eoSum += evenValue;
            }

            System.out.println(eoSum);
        } else {
            while (userInt > 0) {
                eoArray.add(userInt);
                userInt -= 2;
            }

            for (int evenValue: eoArray) {
                eoSum += evenValue;
            }

            System.out.println(eoSum);
        }
    }

    /**
     * Populates an ArrayList with user int values, then prints mean value of all elements in the ArrayList
     * @author Atticus Blanco
     */
    public static void mean() {
        System.out.println("Enter values to calculate a mean.\nEnter \"Q\" to begin calculation.");
        ArrayList<Integer> meanArray = new ArrayList<>();
        double meanResult = 0;
        String userInput = s.nextLine();

        while (!(userInput.equalsIgnoreCase("Q"))) {
            meanArray.add(Integer.parseInt(userInput));
            userInput = s.nextLine();
        }

        for (int meanValue: meanArray) {
            meanResult += meanValue;
        }

        meanResult = meanResult / meanArray.size();

        System.out.println("The mean of your values is " + meanResult + ".");

    }

    /**
     * Initiates eoCount method and mean method
     * @author Atticus Blanco
     */
    public static void main(String[] args) {

        eoCount();
        mean();
    }
}
