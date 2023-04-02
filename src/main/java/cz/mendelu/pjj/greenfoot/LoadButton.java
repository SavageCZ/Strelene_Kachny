package cz.mendelu.pjj.greenfoot;

import cz.mendelu.pjj.strelenekachny.Duck;
import greenfoot.Greenfoot;

public class LoadButton extends ButtonActor{

    private Duck duck;

    public LoadButton(Duck duck) {
        super("   Load   ");
        this.duck = duck;
    }

    @Override
    protected void onClick() {
        String name = Greenfoot.ask("Name of game: ");
        var duck = Duck.load(name);
        var world = new DucksWorld(duck);
        Greenfoot.setWorld(world);
    }
}
