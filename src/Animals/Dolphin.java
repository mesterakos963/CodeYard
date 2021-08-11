package Animals;

public class Dolphin extends Animal {

    public Dolphin(int weight, String name, Color color){
        super(name, weight, color);
    }

    @Override
    public String giveSound(){
        return "RE RE RE RE REEE!\n";
    }

    @Override
    public String move(){
        return name + " swimming\n";
    }
}
