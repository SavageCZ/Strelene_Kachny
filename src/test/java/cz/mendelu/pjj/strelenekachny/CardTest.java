package cz.mendelu.pjj.strelenekachny;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CardTest {

    /**
     * @author xdivis1
     * @version etapa 1
     *
     */
    @Test
    void createCards() {
        Game game = Game.newGame();
        //when
        game.createCards();
        //creating temporary set in order to check if first and last card in package exist
        List<Card> tmp = game.getCardsInPackage();
        //then
        Assertions.assertNotNull(tmp.toArray()[0]);
        Assertions.assertNotNull(tmp.toArray()[51]);
    }
}