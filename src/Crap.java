import java.security.SecureRandom;
public class Crap {
    private static final SecureRandom randomNumbers = new SecureRandom();
    
    private enum Status { CONTINUE, LOST, WON }

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN= 7;
    private static final int YO_ELEVEN= 11;
    private static final int BOX_CARS = 12;

    public static void main(String[] args) {
        
        int point = 0;
        Status gameStatus;
        int sumOfDice = rollDice();

        switch (sumOfDice) {
            case SEVEN, YO_ELEVEN -> gameStatus = Status.WON;
            case SNAKE_EYES, TREY, BOX_CARS -> gameStatus = Status.LOST;
            default -> {
                gameStatus = Status.CONTINUE;
                point = sumOfDice;
                System.out.printf("point is %d%n", point);
            }
        }
        while (gameStatus == Status.CONTINUE){
            sumOfDice = rollDice();
            if(sumOfDice == point)
                gameStatus = Status.WON;
            else
               if  (sumOfDice == SEVEN)
                   gameStatus= Status.LOST;
        }

       if(gameStatus ==Status.WON)
           System.out.println("player wins");
       else
           System.out.println("player loses");
    }

    public static int rollDice() {

        int d1= 1 + randomNumbers.nextInt(6);
        int d2 = 1+ randomNumbers.nextInt(6);

        int sum =  d1 + d2;

        System.out.printf("player rolled %d  + %d   = %d%n  ", d1, d2, sum);
        return sum;

    }


}
