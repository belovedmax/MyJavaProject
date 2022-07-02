import java.util.Scanner;
public class SquareRoot {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.println("Enter the number to know its squre");
        num = input.nextInt();
       int g= (int)Math.pow(num,2);
        System.out.println("The square of the inputted number is = " +g);

    }
}