package cz.mendelu.pjj.strelenekachny;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {

    /**
     * @author xdivis1
     * @version etapa 1
     *
     */
    @Test
    void newGame_duplcity() {
        //when
        Game game1 = Game.newGame();
        Game game2 = Game.newGame();
        //then
        assertNotSame(game1, game2);
    }

    /**
     * @author xdivis1
     * @version etapa 1
     *
     */
    @Test
    void newGame() {
        //when
        Game game1 = Game.newGame();
        //then
        assertNotNull(game1);
    }


    /**
     * @author xdivis1
     * @version etapa 1
     *
     */
    @Test
    void shufflePackage() {
        /*
         * setup - saving cardsInPackage to an array in order to check whether
         * the package has been shuffled
         */
        Game game = Game.newGame();
        game.createCards();
        List<Card> tmp = game.getCardsInPackage();
        //when
        game.shufflePackage();
        //then
        Assertions.assertEquals(tmp.get(0), game.getCardsInPackage().get(0));
        Assertions.assertEquals(tmp.get(51), game.getCardsInPackage().get(51));
    }
}