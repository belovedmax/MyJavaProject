import java.util.Scanner;
public class PrimeNum {
    public static void main(String[] args) {
        Scanner prime = new Scanner(System.in);
        System.out.println("Enter your desired number");
        int num = prime.nextInt();
        boolean flag = false;

        for (int c = 2; c <= num/2; ++c) {
            if (num % c == 0) {
                flag = true;
                break;
            }
        }
            if (!flag)
                System.out.printf(" %d is a prime number", num);
            else System.out.printf("%d is not a prime number", num);


        }
    }
