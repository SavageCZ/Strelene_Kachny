package cz.mendelu.pjj.greenfoot;


import cz.mendelu.pjj.strelenekachny.Color;
import cz.mendelu.pjj.strelenekachny.Duck;
import greenfoot.World;


/**
 * World samotne hry a rybnicku
 * @author xdivis1
 * @version etapa 4
 *
 */
public class DucksWorld extends World {


    public DucksWorld(Duck duck){
        super(1400, 1000,1);
        setBackground("Images/background.jpg");

        //this.duck = duck;
        final int sightX = 110;
        final int sightY = 120;
        final int sightWidth = 101;
        //vytvareni obrazku oblohy
        addObject(new ImageActor("Images/sky.png", 180, 100), 140, sightY + 180);
        addObject(new ImageActor("Images/sky.png", 180, 100), sightWidth + 250, sightY + 180);
        addObject(new ImageActor("Images/sky.png", 180, 100), 2*sightWidth + 380, sightY + 180);
        addObject(new ImageActor("Images/sky.png", 180, 100), 3*sightWidth + 500, sightY + 180);
        addObject(new ImageActor("Images/sky.png", 180, 100), 4*sightWidth + 620, sightY + 180);
        addObject(new ImageActor("Images/sky.png", 180, 100), 5*sightWidth + 740, sightY + 180);

        //vytvareni zamerovacu
        SightActor s1 = new SightActor();
        addObject(s1, sightX+30, sightY);
        addObject(new SightActor(), sightX + sightWidth + 150, sightY);
        addObject(new SightActor(), sightX + 2*sightWidth + 270, sightY);
        addObject(new SightActor(), sightX + 3*sightWidth + 390, sightY);
        addObject(new SightActor(), sightX + 4*sightWidth + 510, sightY);
        addObject(new SightActor(), sightX + 5*sightWidth + 630, sightY);

        //vytvareni kachen
        addObject(new DuckActor(Color.BLUE), sightX+30, 500);
        addObject(new DuckActor(Color.BLANK), sightWidth + 250, 500);
        addObject(new DuckActor(Color.YELLOW), 2*sightWidth + 380, 500);
        addObject(new DuckActor(Color.GREEN), 3*sightWidth + 500, 500);
        addObject(new DuckActor(Color.BLUE), 4*sightWidth + 620, 500);
        addObject(new DuckActor(Color.ORANGE), 5*sightWidth + 740, 500);



        addObject(new ImageActor("Images/duck_pack.png", 100, 180), 1450, 500);

        addObject(new SaveButton(duck), 500,700);
        addObject(new LoadButton(duck), 750,700);
    }



}
