
import java.util.Scanner;
public class ProductOfInt {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number1;
        int number2;
        int number3;
       System.out.println("Enter first number =");
        number1 = input.nextInt();

        System.out.println("Enter second number =");
        number2 = input.nextInt();

        System.out.println("Enter third number =");
        number3 = input.nextInt();

        int product = ((number1)*(number2)*(number3));
        System.out.printf("product is =%d%n", product );

        if (number1 % 2 ==0)
            System.out.printf("%d is = Even %n", number1);
        if(number1 % 2 !=0)
            System.out.printf("%d is = Odd", number1);

        if (number2 % 2 ==0)
            System.out.printf("%d is = Even %n", number2);
        if(number2 % 2 !=0)
            System.out.printf("%d is = Odd %n", number2);

        if (number3 % 2 ==0)
            System.out.printf("%d is = Even %n", number3);
        if(number3 % 2 !=0)
            System.out.printf("%d is = Odd %n", number3);
    }
}