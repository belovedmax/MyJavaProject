public class Cards {
    private final String face;
    private final String suit;

    public Cards(String cardFace, String cardSuit){
        this.face = cardFace;
        this.suit = cardSuit;
    }
    public String toString() {
            return face          + " of " +   suit;


    }
    }

