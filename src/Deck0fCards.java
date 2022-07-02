import java.security.SecureRandom;

public class Deck0fCards {
    private final Cards[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;
    // random number generator
    private  static final SecureRandom randomNumbers =new SecureRandom();

    public Deck0fCards()
    {
        String [] faces = {"Ace","Deuce", "Three","Four","Five","Six", "Seven","Eight","Nine", "Ten", "Jack", "Queen","King"};

        String[] suits = {"Heart", "Diamonds", "Clubs", "Spades"};

        deck = new Cards[NUMBER_OF_CARDS];
        currentCard = 0;

        for (int count =0 ; count < deck.length; count++)
         deck[count] = new Cards(faces[count % 13], suits[count /13]);
    }
    public void shuffle(){
        currentCard = 0;
        for (int first = 0; first < deck.length; first++ )
        {

            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            Cards temp =  deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public Cards dealCard () {
        if (currentCard<deck.length)
            return deck[currentCard++];
        else
            return null;
    }
}