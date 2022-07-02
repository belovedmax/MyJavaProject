import java.util.Scanner;
public class EvenNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your desired number:");
        int num= input.nextInt();

    int n;
    for(n=1; n<=num; n++){
        if (n % 2 == 0){
            System.out.println(n);
        }
    }

}
}