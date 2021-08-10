package Animals;

import Workers.Worker;
import Workers.ZooKeeper;

public abstract class Animal {

    protected String name;
    protected String color;
    protected int weight;

    public Animal(String name, int weight){
        this.weight = weight;
        this.name = name;
    }

    public String getName(){ return name; }

    public void setName(String newName) { this.name = newName; }

    public int getWeight(){ return weight; }

    public String color(){ return color; }

    public abstract String getColor();

    public abstract void giveSound();

    public abstract void move();

    public void feed(ZooKeeper worker) {
        if (worker.getLoved()){
            giveSound();
        } else {
            move();
        }
    }
}