package cz.mendelu.pjj.strelenekachny;

import java.util.*;

public class Player {
    private Color color;
    private List<Card> cardsInHand;
    private int numberOfDucksLeft;


    public Player(Color color, Card ... cards){
        this.color = color;
        this.numberOfDucksLeft = 5;
        this.cardsInHand = new ArrayList<>();
        cardsInHand.addAll(Arrays.asList(cards));

    }


    /**
     * @author xdivis1
     * @version etapa 3
     *
     */
    public void drawNewCards(Card ... cards) {
        cardsInHand.addAll(Arrays.asList(cards));
    }

    /**
     * Metoda pouzije kartu dle pozice v ruce (1-3), zavola prislusnou funkci ktera
     * provode to co ma karta v "description". Dal pak metoda kartu "zahodi" do
     * odhazovaciho baliku a prida hracovi novou kartu do ruky.
     * @author xdivis1
     * @version etapa 1
     *
     */
    public void useCard(int cardPosition){
        cardsInHand.remove(cardPosition);
    }

    public Color getColor() {
        return color;
    }

    public void setCardsInHand(List<Card> cardsInHand) {
        this.cardsInHand = cardsInHand;
    }

    /**
     * @author xdivis1
     * @version etapa 3
     *
     */
    public List<Card> getCards(){
        return Collections.unmodifiableList(cardsInHand);
    }

    public int getNumberOfDucksLeft(){
        return numberOfDucksLeft;
    }

    public void removeDuck(){
        numberOfDucksLeft -= 1;
    }

    /**
     * @author xdivis1
     * @version etapa 3
     *
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return numberOfDucksLeft == player.numberOfDucksLeft &&
                color == player.color &&
                Objects.equals(cardsInHand, player.cardsInHand);
    }

    /**
     * @author xdivis1
     * @version etapa 3
     *
     */
    @Override
    public int hashCode() {
        return Objects.hash(color, cardsInHand, numberOfDucksLeft);
    }

    /**
     * @author xdivis1
     * @version etapa 3
     *
     */
    @Override
    public String toString() {
        return "Player{" +
                "color=" + color +
                ", cardsInHand=" + cardsInHand +
                ", numberOfDucksLeft=" + numberOfDucksLeft +
                '}';
    }
}
