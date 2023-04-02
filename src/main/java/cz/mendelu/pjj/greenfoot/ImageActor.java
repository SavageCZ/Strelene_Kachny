package cz.mendelu.pjj.greenfoot;

import greenfoot.Actor;
import greenfoot.GreenfootImage;

/**
 * Trida na zobrazovani obrazku ve hre
 * @author xdivis1
 * @version etapa 4
 *
 */
public class ImageActor extends Actor {
    private int width;
    private int height;
    String file_path;
    public ImageActor(String path, int x, int y){
        file_path = path;
        width = x;
        height = y;
        update();

    }
    public void update(){
        setImage(file_path);
        getImage().scale(width, height);
    }
}
