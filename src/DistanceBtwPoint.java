import java.util.Scanner;
public class DistanceBtwPoint {
    public static void main(String[] args) {
        Scanner distance = new Scanner(System.in);
        System.out.println("Enter the x1");
        double x1 = distance.nextByte();

        System.out.println("Enter the x2");
        double x2 = distance.nextByte();

        System.out.println("Enter the y1");
        double y1 = distance.nextByte();

        System.out.println("Enter the y2");
        double y2 = distance.nextByte();

        double l = (x2 - x1);

        double b =(y2 - y1);

        double t = Math.pow(l,2) + Math.pow(b,2);

        double d = Math.sqrt(t);

        System.out.printf("The distance is %.2f " , d);



    }
}
