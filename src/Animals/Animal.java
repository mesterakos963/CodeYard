package Animals;

import Interfaces.Creature;
import Workers.ZooKeeper;

public abstract class Animal implements Creature {

    protected String name;
    protected int weight;
    protected Color color;

    public enum Color {
        BROWN,
        GREY,
        BLACK,
        YELLOW,
        BLUE
    }

    public Animal(String name, int weight, Color color){
        this.weight = weight;
        this.name = name;
        this.color = color;
    }

    public String getName(){ return name; }

    public void setName(String newName) { this.name = newName; }
    
    public abstract String giveSound();

    public abstract String move();

    public String feed(ZooKeeper worker) {
        if (worker.getLoved()){
            return giveSound();
        } else {
            return move();
        }
    }

    public String getCreatureName(){
        return this.name;
    }
}