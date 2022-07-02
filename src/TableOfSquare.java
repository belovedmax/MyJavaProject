import java.util.Scanner;
public class TableOfSquare {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Desired number:");
        int num = input.nextInt();
        System.out.printf("divisors of %d are: %n",num);

        for (int c =1; c <= num; ++c){
           if (num % c ==2)
               System.out.println(c);
        }

    }
}