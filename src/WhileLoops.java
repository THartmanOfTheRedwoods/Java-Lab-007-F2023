import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static boolean isANumber(String in){
        for(int i=0; i<in.length(); i++){
            switch(in.charAt(i)){
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    continue;
                default:
                    System.out.println("Not a number");
                    return false;
            }
        }
        return true;
    }
    public static void eoCount() {
        int evenCount = 0;
        int oddCount = 0;
        System.out.println("Even/Odd counter\n");
        while(true){
            try{
                System.out.print("Input a whole number, enter anything else to quit: ");
                int input = Integer.parseInt(s.nextLine());

                if((input % 2) == 0 && input != 0){
                    System.out.println(input + " is even.");
                    evenCount++;
                } else if (input == 0) {
                    System.out.println("Input is zero");
                } else{
                    System.out.println(input + " is odd.");
                    oddCount++;
                }
            }catch (NumberFormatException nfe){
                break;
            }
        }
        System.out.printf("Odd numbers: %d%nEven numbers: %d%n", evenCount, oddCount);
    }

    public static void mean() {
        int numCount = 0;
        double sum = 0.0;
        String input;
        System.out.println("Mean calculator\n");
        System.out.print("Please input a number, enter \"Q\" to quit: ");
        while(!(input = s.nextLine()).toUpperCase().equals("Q")) {
            System.out.print("Please input a number, enter \"Q\" to quit: ");
            try {
                sum += Integer.parseInt(input);
                numCount++;
            } catch (NumberFormatException nfe) {}
        }
        System.out.println("Average is " + sum / numCount);
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
