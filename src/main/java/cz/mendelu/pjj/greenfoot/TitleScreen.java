package cz.mendelu.pjj.greenfoot;

import greenfoot.World;

/**
 * World na titulni stranu, kde si hrac vybere, jestli chce zobrazit pravidla, ci zacit novou hru
 * @author xdivis1
 * @version etapa 4
 *
 */
public class TitleScreen extends World {
    public TitleScreen(){
        super(1300, 800, 1);
        setBackground("Images/background.jpg");
        ImageActor sign = new ImageActor("Images/strelene_kachny.jpg", 565, 90);
        addObject(sign, 600, 100);

        ImageActor ducksPicture = new ImageActor("Images/ducks.png", 255, 335);
        addObject(ducksPicture, 600, 400);

        addObject(new NewGameActor(), 200, 600);
        addObject(new RulesActor(), 1000, 600);
    }

}
