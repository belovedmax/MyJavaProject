
import java.util.Scanner;
public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int largest = 0;
        int smallest = 0;
        int c;

        for (c = 1; c <= 10; ++c) {

            System.out.printf("enter your desired number %d:", c);
            num = input.nextInt();

            if (num > largest)
                largest = num;
            if (num < smallest)
                smallest = num;

        }
            System.out.printf("The largest is %d%n:", largest );
        System.out.printf("The negative number is %d%n:", smallest );

    }
    }

