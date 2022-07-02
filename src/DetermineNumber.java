import java.util.Scanner;
public class DetermineNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        System.out.println("Enter the 1st number:");
        num1 = input.nextInt();

        System.out.println("Enter the 2nd  number:");
        num2 = input.nextInt();

        System.out.println("Enter the 3rd  number:");
        num3 = input.nextInt();

        System.out.println("Enter the 4th number:");
        num4 = input.nextInt();

        System.out.println("Enter the 5th  number:");
        num5 = input.nextInt();

        if (num1 < 0)
            System.out.printf("%d is a negative number %n", num1);

        if (num1 >=0)
            System.out.printf("%d is a positive number %n", num1);
        if (num2 < 0)
            System.out.printf("%d is a negative number %n", num2);

        if (num2 >=0)
            System.out.printf("%d is a positive number %n", num2);

        if (num3 < 0)
            System.out.printf("%d is a negative number %n", num3);

        if (num3 >=0)
            System.out.printf("%d is a positive number %n", num3);

        if (num4 < 0)
            System.out.printf("%d is a negative number %n", num4);

        if (num4 >=0)
            System.out.printf("%d is a positive number %n", num4);

        if (num5 < 0)
            System.out.printf("%d is a negative number %n", num5);

        if (num5 >=0)
            System.out.printf("%d is a positive number %n", num5);


    }
}