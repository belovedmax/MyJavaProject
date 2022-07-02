
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1;
        System.out.println("Enter the number to know if it is Odd or Even");
        number1= input.nextInt();
        if (number1 % 2 ==0)
            System.out.printf("%d is an Even number", number1);
        if(number1 % 2 !=0)
            System.out.printf("%d is an Odd number", number1);

    }
}
