package cz.mendelu.pjj.strelenekachny;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    /**
     * @author xdivis1
     * @version etapa 1
     *
     */
    @Test
    void useCard() {
        /* setup - creating player and saving his cards into array in order to check
         * whether the card was thrown away after player used it.
         * Also creating hand for player
         *
         */
        Card card1 = new Card(1);
        Card card2 = new Card(2);
        Card card3 = new Card(3);
        Card card4 = new Card(4);
        Player player = new Player(Color.BLUE, card1, card2, card3);

        List<Card> tmp = player.getCards();
        //when
        player.useCard(1);
        //drawing new card in hand
        player.drawNewCards(card4);
        //then
        Assertions.assertFalse(player.getCards().contains(card2));

    }

}