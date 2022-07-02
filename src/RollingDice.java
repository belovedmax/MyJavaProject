import java.security.SecureRandom;
public class RollingDice {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int c;
        for ( c = 1; c <= 20; c++)
        {
            int face = 1 + random.nextInt(6);
            System.out.printf("%d ", face);

            if (c % 5 == 0) System.out.println();
        }
    }
}