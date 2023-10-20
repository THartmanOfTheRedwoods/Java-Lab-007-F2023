import java.util.Scanner;
import java.util.ArrayList;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount(int eoValue) {
        ArrayList<Integer> eoArray = new ArrayList();
        int eoSum = 0;
        if (eoValue % 2 == 0) {
            while (eoValue > 0) {
                eoArray.add(eoValue);
                eoValue -= 2;
            }

            for (int evenValue: eoArray) {
                eoSum += evenValue;
            }

            System.out.println(eoSum);
        } else {
            while (eoValue > 0) {
                eoArray.add(eoValue);
                eoValue -= 2;
            }

            for (int evenValue: eoArray) {
                eoSum += evenValue;
            }

            System.out.println(eoSum);
        }
    }

    public static void mean() {
        System.out.println("Enter values to calculate a mean.\nEnter \"Q\" to begin calculation.");
        ArrayList<Integer> meanArray = new ArrayList();
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

    public static void main(String[] args) {

        System.out.println("Enter an integer value");
        int userInt = Integer.parseInt(s.nextLine());


        eoCount(userInt);
        mean();
    }
}
