package Animals;

import Workers.Worker;
import Workers.ZooKeeper;

import java.util.Random;

public class Monkey extends Animal {

    public Monkey(int weight, String name){
        super(name, weight);
        setColor(color);
    }

    @Override
    public void giveSound(){
        System.out.println("OOOH OOOH!");
    }

    @Override
    public void move(){
        System.out.println("Jumping on trees");
    }


    public void setWeight(int weight){
        super.weight = weight;
    }

    public void setColor(String color){
        super.color = "black";
    }

    @Override
    public String getColor() {
        return color;
    }
}

