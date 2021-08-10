package Animals;

import Workers.Worker;
import Workers.ZooKeeper;

import java.util.Random;

public class Ostrich extends Animal {

    public Ostrich(int weight, String name){
        super(name, weight);
        setColor(color);
    }

    @Override
    public void giveSound(){
        System.out.println("BOOM");
    }

    @Override
    public void move(){
        System.out.println("Walks on 2 legs");
    }


    public void setWeight(int weight){
        super.weight = weight;
    }

    public void setColor(String color){
        super.color = "brown";
    }

    @Override
    public String getColor() {
        return color;
    }
}


