import java.util.Scanner;
import java.util.ArrayList;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);
    private static int loopCounter = 0;

    public static void eoCount(int eoSum) {
        while (eoSum > 0) {
            if (eoSum % 2 == 0) {
                loopCounter++;
                System.out.println(eoSum);  //change to an ArrayList
                eoSum -= 2;
            } else {
                loopCounter++;
                System.out.println(eoSum);  //change to an ArrayList
                eoSum -= 2;
            }
        }
        System.out.println("Number of Loops: " + loopCounter);
        loopCounter = 0;
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
