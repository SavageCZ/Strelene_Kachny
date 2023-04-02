package cz.mendelu.pjj.greenfoot;

import greenfoot.Actor;
import greenfoot.Greenfoot;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * Trida po kliknuti na image Rules otevre pravidla ze slozky file
 * @author xdivis1
 * @version etapa 4
 *
 */
public class RulesActor extends Actor {

    RulesActor(){
        update();
    }
    public void update(){
        setImage("Images/rules.png");
        getImage().scale(150, 50);
    }


    @Override
    public void act() {
        super.act();
        if (Greenfoot.mouseClicked(this)){
            try {
                Desktop desktop = java.awt.Desktop.getDesktop();
                URI oURL = new URI("https://docdro.id/8SMy1Y6");
                desktop.browse(oURL);
            } catch (Exception e) {
                e.printStackTrace();
            }


        }

    }
}
