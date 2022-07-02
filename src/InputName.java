import java.util.Scanner;
public class InputName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String x;
        String y;
        String z;
        System.out.println("Enter your first name:");
        x = input.next();

        System.out.println("Enter your surname:");
        y = input.next();

        System.out.println("Enter your sex:");
        z = input.next();

        System.out.printf("my name is %s %s, my sex is %s" , x,y,z );
    }
}