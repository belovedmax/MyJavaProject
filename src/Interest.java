import java.util.Scanner;
public class Interest {
    public static void main(String[] args) {

        double p;
        double r = 0.05;
        double amount;
        int n;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your principal:");
        p = input.nextInt();

        for (n = 1; n <= 10; ++n){
            amount = p *Math.pow(1 + r, n);

            System.out.printf("%4d%,20.2f%n", n, amount);
        }
    }
}