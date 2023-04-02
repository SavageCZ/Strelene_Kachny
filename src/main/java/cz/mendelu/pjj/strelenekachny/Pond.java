package cz.mendelu.pjj.strelenekachny;

import java.lang.reflect.Array;
import java.util.*;

public class Pond {
    private List<Duck> ducksInPackage;
    private List<Duck> ducksOnPond; //TODO Stack !!!
    private int currentFirstDuck = 0;

    public Pond() {
        ducksOnPond = new ArrayList<>();
        ducksInPackage = new ArrayList<>();
    }




    /**
     *
     * @author xdivis1
     * @version etapa 1
     * Metoda zkontroluje jestli je kachna zamerena, pokud je, tak kachnu odstrani z
     * hraciho pole a zavola metodu, ktera kachnu odstrani z hracova pocitadla kachen
     */
    public void killDuck(int location){
        Duck duck = ducksOnPond.get(location);
        if (!duck.isAimedAt()){
            System.out.println("Duck need to be aimed at");
        } else {
            ducksOnPond.remove(duck);
            duck.getOwner().removeDuck();
        }

    }

    public List<Duck> getDucksOnPond() {
        return Collections.unmodifiableList(ducksOnPond);
    }

    /**
     * @author xdivis1
     * @version etapa 3
     *
     */
    public void addDucksToPond(Duck ... duck){
        ducksInPackage.addAll(Arrays.asList(duck));
        ducksOnPond.addAll(Arrays.asList(duck));
    }


    public void changeAim(int index){
        ducksOnPond.get(index).setAimedAt();
    }

    /**
     * @author xdivis1
     * @version etapa 3
     *
     */
    public Duck returnDuck(int location){
        if (location < 0 || location > 6){
            System.out.println("Error");
        }
        return ducksOnPond.get(location);
    }

    /**
     * Metoda posune vsechny kachny na rybnicku o jedno pole vpravo. Kachnu nejvice vpravo
     * odebere z herniho pole a da ji do baliku s kachnami. Dale pak prida jednu kachnu
     * do leva
     * @author xdivis1
     * @version etapa 3
     *
     */
    public void moveDucks(){
        currentFirstDuck+=1;
        ducksOnPond.removeAll(ducksOnPond);
        for (int i = currentFirstDuck; i < 6 + currentFirstDuck; i++) {
            ducksOnPond.add(ducksInPackage.get(i));
        }

    }

    public void shuffleDucksInPackage(){
        Collections.shuffle(ducksInPackage);
    }


}
