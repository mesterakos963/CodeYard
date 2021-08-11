package Animals;

public class Elephant extends Animal {

    public Elephant(int weight, String name, Color color){
        super(name, weight, color);
    }

    @Override
    public String giveSound(){
        return "TRUMPET\n";
    }

    @Override
    public String move(){
        return name +" walks on 4 legs\n";
    }
}
