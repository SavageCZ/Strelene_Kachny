package cz.mendelu.pjj.greenfoot;

import cz.mendelu.pjj.strelenekachny.Pond;
import greenfoot.Actor;
import greenfoot.Greenfoot;

/**
 *
 * metoda act, která umožní hráči posun karty zaměřovače
 * @author xdivis1
 * @version etapa 4
 */
public class SightActor extends Actor {
    private Pond pond = new Pond();
    private int index = -1;
    SightActor(){
        this.index +=1;
        update();
    }

    private void update() {
        setImage("Images/sight.png");
        getImage().scale(111,171);
    }

    void aim(){
        pond.changeAim(this.index);
    }

    @Override
    public void act() {
        super.act();
        //Posunuti zamerovace nad pole rybnicku
        if (Greenfoot.mouseClicked(this)){
            if (getY() == 130){
                setLocation(getX(), getY() + 100);
                //aim();
            } else {
                setLocation(getX(), getY() + 100);
                //aim();
            }

        }
    }
}
