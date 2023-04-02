package cz.mendelu.pjj.greenfoot;

import greenfoot.Actor;
import greenfoot.GreenfootImage;

import java.awt.*;
import java.util.Objects;

public class LabelActor extends Actor {
    private String text;
    public LabelActor(String text) {
        this.setText(text);
    }

    public void setText(String text) {
        if (!Objects.equals(this.text, text)) {
            this.text = text;
            var image = new GreenfootImage(text, 24, Color.BLACK, new Color(255,25,18));
            setImage(image);
        }
    }
    protected String updateText() {
        return null;
    }

    @Override
    public void act() {
        var newText = updateText();
        if (newText != null) {
            setText(newText);
        }
    }
}
