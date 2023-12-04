/**
 *
 * @author Trevor Hartman
 * @author Cameron Meng
 *
 * @since Version 1.0
 *
 */
import java.io.PrintStream;
import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        int n;
        int sum=0;
        System.out.println("Enter a number please");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(int i=1;i<=n;i++) {
            sum+=i;
        }
        System.out.println("The sum is "+sum+".");
    }

    public static void rangeSum() {
        int lower;
        int upper;
        int A;
        int B;
        int sum = 0;
        System.out.println("Provide a number please");
        Scanner sd = new Scanner(System.in);
        A = Integer.parseInt(sd.nextLine());
        System.out.println("Provide another number please");
        Scanner se = new Scanner(System.in);
        B = Integer.parseInt(se.nextLine());
        lower = Math.min(A,B);
        upper = Math.max(A,B);
        for (int i = lower; i <= upper; i++) {
            sum += i;
        }
            System.out.println("The sum is: " + sum + ".");
    }
    public static void factorial() {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number:");
        int userIn = Integer.parseInt(reader.nextLine());
        int factorial = 1;
        int i = userIn;
        while (userIn >= 1) {
            factorial *= userIn;
            userIn--;
        }
        System.out.println("The factorial is:" + factorial);
    }

    public static void main(String[] args) {
            forSum();
            rangeSum();
            factorial();

            s.close();
    }
}
