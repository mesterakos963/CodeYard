package Animals;

import Workers.Worker;
import Workers.ZooKeeper;

import java.util.Random;

public class Lion extends Animal {

    public Lion(int weight, String name){
        super(name, weight);
        setColor(color);
    }

    @Override
    public void giveSound(){
        System.out.println("ROAR!");
    }

    @Override
    public void move(){
        System.out.println("Walks on 4 legs");
    }

    public void setWeight(int weight){
        super.weight = weight;
    }

    public void setColor(String color){
        super.color = "golden brown";
    }

    @Override
    public String getColor() {
        return color;
    }
}

