package Animals;

public class Monkey extends Animal {

    public Monkey(int weight, String name, Color color){
        super(name, weight, color);
    }

    @Override
    public String giveSound(){
        return "OOOH OOOH!\n";
    }

    @Override
    public String move(){
        return name + " jumping on trees\n";
    }
}

