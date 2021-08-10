package Animals;

public class Dolphin extends Animal {

    public Dolphin(int weight, String name){
        super(name, weight);
        setColor(color);
    }

    @Override
    public void giveSound(){
        System.out.println("RE RE RE RE REEE!");
    }

    @Override
    public void move(){
        System.out.println("Swimming");
    }

    public void setWeight(int weight){
        super.weight = weight;
    }

    public void setColor(String color){
        super.color = "light blue";
    }

    @Override
    public String getColor() {
        return color;
    }
}
