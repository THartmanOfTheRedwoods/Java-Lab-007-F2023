import java.util.Scanner;

public class ForLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void forSum() {
        System.out.println("enter a number");
        int input = s.nextInt();
        int sum;

        for(sum=0; input>0; input--){
            sum += input;
        }
        System.out.println(sum);
    }

    public static void rangeSum() {
        System.out.println("number?");
        int input = s.nextInt();
        System.out.println("number?");
        int lowLimit = s.nextInt();
        int n = lowLimit;
        int sum = 0;

        for (; input > n; ) {

            n = n++;
            sum = sum + n;
            System.out.println(sum);
        }
    }

    public static void factorial() {
            System.out.println("enter a number");
            int input = s.nextInt();
            int n = 0;
            int times = 0;


        for (int i = 1; i <= n; i++) {
            times *= i;
            System.out.println(times);

            }
    }

    public static void main(String[] args) {
        forSum();
        rangeSum();
        factorial();
    }
}
