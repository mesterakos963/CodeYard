package Animals;

public class Ostrich extends Animal {

    public Ostrich(int weight, String name, Color color){
        super(name, weight, color);
    }

    @Override
    public String giveSound(){
        return "BOOM\n";
    }

    @Override
    public String move(){
        return name + " walks on 2 legs\n";
    }
}


