package cz.mendelu.pjj.strelenekachny;




public class Card {
    private static final int numberOfCards=52;


    private int id;
    private String description;
    //private Duck[] ducksOnBoard;


    public Card(int id) {
        this.id = id;
    }

    public static int getNumberOfCards() {
        return numberOfCards;
    }
}

