import java.util.Scanner;
public class MaxMindNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your desired number separated by space");
        double num1 = input.nextInt();
        double num2 = input.nextInt();
        double num3 = input.nextInt();
        double result = maximum (num1,num2,num3);
        System.out.printf("the maximum number is %n" +result);

    }

    private static double maximum(double x, double y, double z) {
        double maximum = x;
        if (y> maximum)
            maximum=y;
        if (z> maximum)
            maximum=z;
        return maximum;


    }
}
