package cz.mendelu.pjj.greenfoot;

import cz.mendelu.pjj.strelenekachny.Duck;
import greenfoot.Greenfoot;

public class SaveButton extends ButtonActor {
    private final Duck duck;

    public SaveButton(Duck duck) {
        super("   Save   ");
        this.duck = duck;
    }

    @Override
    protected void onClick() {
        String name = Greenfoot.ask("Name of game: ");
        Duck.save(duck, name);
    }

}
