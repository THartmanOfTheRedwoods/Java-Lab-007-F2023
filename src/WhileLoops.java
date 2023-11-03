import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
        System.out.println("How many numbers are in your list of even and odd numbers" + "?");
        int limit = s.nextInt();
        s.nextLine();
        int nums = 0;
        int evens = 0;
        int odds = 0;
        System.out.println("Enter " +limit + " numbers");
        while (nums!=limit){

            int x = s.nextInt();
            if (x % 2==0){
                evens++;
                nums++;
            } else {
                odds++;
                nums++;
            }
        }
        System.out.println("There were " + evens + "even numbers and " + odds + " odd numbers");
    }

    public static void mean() {
        double sum = 0.0;
        double nums = 0.0;
        s.nextLine();
        System.out.println("How many numbers are in your list to average out?");
        int limit = parseInt(s.nextLine());
        System.out.println("Enter " +limit + " numbers");
       while (nums != limit){
        sum = sum + s.nextDouble();
        nums++;
       }

        System.out.printf("The mean of your list is %.6f", sum/nums);
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
