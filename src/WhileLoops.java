import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        System.out.println("enter a number");
        int input = s.nextInt();
        int even = 0;
        int odd = 0;


        while(true){
            if (input%2==0) {
                even = even + input;
            }
            if (input%2!=0){
                odd = odd + input;
            }

        }
    }

    public static void mean() {
        System.out.println("enter a number");
        String input;
        int n = 0;
        int counter = 0;


        while(!(input = s.nextLine()).equals("Q")){
            n = n + Integer.parseInt(input);
            counter++;

        }
        System.out.println(n/counter);
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
