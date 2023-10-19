import java.util.Scanner;
import java.util.ArrayList;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);
    private static int loopCounter = 0;


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
        ArrayList<Integer> integerList = new ArrayList<>();

        String userInput = s.nextLine();
        while (!(userInput.equalsIgnoreCase("Q"))) {
            integerList.add(Integer.parseInt(userInput));
            loopCounter++;
        }
        
    }

    public static void main(String[] args) {
        System.out.println("Enter an integer value");
        int userInt = Integer.parseInt(s.nextLine());
        
        eoCount(userInt);

        //mean();
    }
}
