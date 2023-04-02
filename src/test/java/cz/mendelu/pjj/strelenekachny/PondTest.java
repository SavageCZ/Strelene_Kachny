package cz.mendelu.pjj.strelenekachny;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PondTest {

    /**
     * @author xdivis1
     * @version etapa 1
     *
     */
    @Test
    void moveDucks() {
        //setup - saving duck at location 1 in order to compare it later, whether it moved
        Pond pond = new Pond();

        Player player = new Player(Color.BLUE);
        Duck duck0 = new Duck(Color.BLUE, player);
        Duck duck1 = new Duck(Color.BLUE, player);
        Duck duck2 = new Duck(Color.BLUE, player);
        Duck duck3 = new Duck(Color.BLUE, player);
        Duck duck4 = new Duck(Color.BLUE, player);
        Duck duck5 = new Duck(Color.BLUE, player);
        Duck duck6 = new Duck(Color.BLUE, player);
        Duck duck7 = new Duck(Color.BLUE, player);
        pond.addDucksToPond(duck0, duck1, duck3, duck4, duck5, duck6, duck7);
        Duck tmp = pond.returnDuck(1);

        //when
        pond.moveDucks();
        Duck tmxp = pond.returnDuck(1);
        //then
        Assertions.assertNotSame(tmp, pond.returnDuck(1));
    }


    /**
     * @author xdivis1
     * @version etapa 1
     *
     */
    @Test
    void killDuck() {
        /*
        * setup - creating player and duck in order to try the method killDuck()
        * then creating pond and adding duck into the pond
        * then checking whether the duck is being removed from pond and
        * if one duck is being removed from players duck counter
        *
        */
        Player player = new Player(Color.BLUE);
        Pond pond = new Pond();
        Duck duck0 = new Duck(Color.BLUE, player);
        pond.addDucksToPond(duck0);
        duck0.setAimedAt();

        //when
        pond.killDuck(0);
        int tmp = player.getNumberOfDucksLeft();
        //then
        Assertions.assertTrue(pond.getDucksOnPond().isEmpty());
        Assertions.assertEquals(tmp, 4);


    }


}