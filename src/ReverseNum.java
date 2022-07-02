import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner reverse = new Scanner(System.in);
        System.out.println("Enter the set of number");
        int num = reverse.nextInt();
        int sum=  0;
        while (num != 0){
            int result = num % 10;
            sum = sum * 10 + result;
            num /=10;
        }
        System.out.println("reversed number %n " +sum);

    }
}
