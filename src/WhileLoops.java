import java.util.Scanner;

public class WhileLoops {
    private final static Scanner s = new Scanner(System.in);

    public static void eoCount() {
int number = s.nextInt();
        while (true) {
            if(number%2 == 0){
        System.out.println("Even " + number);
            break;}
       else{
            System.out.println("Odd " + number);
            break;
          }
        }
    }

    public static void mean() {
        int number = s.nextInt();
        int number1 = s.nextInt();
while(true){
    if(number >0 && number1 >0){
System.out.print("The mean is " + (number + number1) /2);
break;
    }
}
    }

    public static void main(String[] args) {
        eoCount();
        mean();
    }
}
