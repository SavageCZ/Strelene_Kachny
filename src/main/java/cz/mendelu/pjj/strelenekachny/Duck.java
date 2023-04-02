package cz.mendelu.pjj.strelenekachny;

import jdk.jshell.spi.ExecutionControl;

import java.io.*;
import java.util.Objects;
import java.awt.*;


public class Duck implements Serializable {
    private final Player owner;
    private final Color color;
    private boolean aimedAt;
    public Duck (Color color, Player owner){
        this.owner = owner;
        this.color = color;
        this.aimedAt = false;
    }

    /**
     * Uložení hry do souboru.
     * @author xdivis1
     * @versin etapa 4
     */
    public static void save(Duck duck, String name){
            try (var out = new ObjectOutputStream(new FileOutputStream(file(name)))) {
                out.writeObject(duck);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
    }

    private static File file(String name) {
        var dir = new File("save");
        if (!dir.exists()) {
            dir.mkdirs();
        }
        return new File(dir, name + ".duck");
    }

    /**
     * Načtení hry ze souboru.
     * @author xdivis1
     * @version etapa 4
     */
        public static Duck load(String name) {
            try (var in = new ObjectInputStream(new FileInputStream(file(name))))  {
                return (Duck) in.readObject();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                throw new IllegalArgumentException("Load game failed.", e);
            } catch (IOException e) {
                e.printStackTrace();
                throw new IllegalArgumentException("Load game failed.", e);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
                throw new IllegalArgumentException("Load game failed.", e);
            }

        }



    public boolean isAimedAt() {
        return aimedAt;
    }

    public void setAimedAt(){
        this.aimedAt = !this.aimedAt;
    }
    public Player getOwner() {
        return owner;
    }

    /**
     * @author xdivis1
     * @version etapa 3
     *
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duck duck = (Duck) o;
        return aimedAt == duck.aimedAt &&
                Objects.equals(owner, duck.owner) &&
                color == duck.color;
    }

    /**
     * @author xdivis1
     * @version etapa 3
     *
     */
    @Override
    public int hashCode() {
        return Objects.hash(owner, color, aimedAt);
    }
}
