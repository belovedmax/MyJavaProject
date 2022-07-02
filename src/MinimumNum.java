import java.util.Scanner;
public class MinimumNum {
    public static void main(String[] args) {
            Scanner minimum = new Scanner(System.in);
        System.out.println("enter your desired numbers separated wih space");
        int min1 = minimum.nextInt();
        int min2 = minimum.nextInt();
        int min3 = minimum.nextInt();
        int min4 = minimum.nextInt();
        int result =minimum(min1, min2, min3, min4);
        System.out.println("the minimum number is :" + result);
        
    }

    private static int minimum(int a, int b, int c, int d) {
        int minimum = a;

        if (b < minimum)
            minimum = b;
        if (c<minimum)
            minimum=c;
        if (d<minimum)
            minimum= d;
        return minimum;
    }
    }


