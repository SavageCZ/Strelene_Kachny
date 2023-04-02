package cz.mendelu.pjj.strelenekachny;

import java.util.*;

public class Game {
    private int numberOfCardsUsed;
    private Pond pond;
    private List<Card> cardsInPackage;
    private Map<Player, Color> players;


    /**
     * Metoda vytvori hru jako takovou a odstartuje ji. Dale take vytvori hrace s prislusnymi
     * barvami a take rybnicek, rozda karty a rozestavi kachny na rybnicku.
     * @author xdivis1
     * @version etapa 3
     *
     */
    public static Game newGame(){
        Game game = new Game();
        return game;
    }
    public void endGame(){
        throw new UnsupportedOperationException("Not Implemented Yet");
    }

    /**
     * @author xdivis1
     * @version etapa 3
     *
     */
    public List<Card> getCardsInPackage() {
        return Collections.unmodifiableList(cardsInPackage);

    }

    /**
     * Metoda vytvori vsechny hraci karty
     * @author xdivis1
     * @version etapa 3
     *
     */
    public List<Card> createCards(){
        List<Card> Cards = new ArrayList<>();
        for (int i = 1; i <= 52; i++) {
            Card card = new Card(i);
            Cards.add(card);
        }
        cardsInPackage = Cards;
        Collections.shuffle(cardsInPackage);
        return Cards;
    }

    public void createPlayer(){
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void serveCards(){
        throw new UnsupportedOperationException("Not implemented yet");
    }

    public void fillPond(Pond pond){
        for (Player player : players.keySet()) {
            for (int i = 0; i < 5; i++) {
                Duck duck = new Duck(player.getColor(), player);
                pond.addDucksToPond(duck);
            }
        }
        pond.shuffleDucksInPackage();
    }



    /**
     * Metoda je zavolana vzdy na startu nove hry a zamicha vsechny Dale je metoda zavolana
     * ve chvili kdy hrac vezme posledni kartu z baliku. Metoda pak
     * vezme karty z odhazovaciho baliku a zamicha je.
     * @author xdivis1
     * @version etapa 1
     *
     */
    public void shufflePackage(){
        Collections.shuffle(cardsInPackage);
    }
}
