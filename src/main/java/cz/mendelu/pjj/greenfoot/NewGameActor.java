package cz.mendelu.pjj.greenfoot;

import cz.mendelu.pjj.strelenekachny.Duck;
import cz.mendelu.pjj.strelenekachny.Game;
import greenfoot.Actor;
import greenfoot.Greenfoot;

/**
 * Trida po kliknuti na image New Game zacne novou hru
 * @author xdivis1
 * @version etapa 4
 *
 */
public class NewGameActor extends Actor {
    private Duck duck;

    public NewGameActor(){
        this.update();
    }
    public void update(){
        setImage("Images/new_game_button.png");
        getImage().scale(150, 50);
    }


    @Override
    public void act() {
        super.act();
        if (Greenfoot.mouseClicked(this)){
            Game game = new Game();
            //Pond pond = new Pond();
            //game.fillPond(pond);
            DucksWorld world = new DucksWorld(duck);
            Greenfoot.setWorld(world);
        }
    }
}
