package Animals;

public class Lion extends Animal {

    public Lion(int weight, String name, Color color){
        super(name, weight, color);
    }

    @Override
    public String giveSound(){
        return "ROAR!\n";
    }

    @Override
    public String move(){
        return name + " walks on 4 legs\n";
    }
}

