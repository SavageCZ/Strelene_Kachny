package cz.mendelu.pjj.greenfoot;

import greenfoot.Greenfoot;
import greenfoot.Actor;
import greenfoot.GreenfootImage;

import java.util.function.Consumer;

public abstract class ButtonActor extends LabelActor {

    public ButtonActor(String text) {
        super(text);
    }

    protected abstract void onClick();

    @Override
    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            onClick();
        }
    }
}
