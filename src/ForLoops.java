import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        int n;
        System.out.println("Number?");
        int in = s.nextInt();
        int sum = 0;
        for(n=(in-1); n>0; n--){
            sum = in += n;


        } System.out.println("The sum is: " + sum);
    }

    public static void rangeSum() {

        System.out.print("Number? ");
        int one = s.nextInt();
        System.out.print("\nNumber? ");
        int two = s.nextInt();
        int one1;
        int two2;
        int sum = 0;
        if (one > two) {
            for (one1 = (one-1); one1 >= two; one1--) {
                sum = one += one1;
            }
            System.out.println("\nThe sum is: " + sum);
        } else{
            for (two2 = (two-1); two2 >= one; two2--) {
                sum = two += two2;
            }
            System.out.println("\nThe sum is: " + sum);
        }
    }

    public static void factorial() {
        System.out.println("Number: ");
        int num = s.nextInt();
        int n;
        int sum = 0;
        for (n = (num-1); n>0; n--){
            sum  = num *= n;
        }
        System.out.println("Factorial: " + sum);

    }

    public static void main(String[] args) {
        forSum();
       rangeSum();
       factorial();
    }
}
