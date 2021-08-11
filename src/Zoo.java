import Animals.Animal;
import Workers.Worker;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private String name;
    ArrayList<Animal> animals;
    ArrayList<Worker> workers;

    public Zoo(String name,ArrayList<Animal> animals, ArrayList<Worker> workers){
        this.workers = workers;
        this.animals = animals;
    }

    public String getName(){
        return name;
    }

    public List<Animal> getAnimals (){
        return animals;
    }

    public List<Worker> getWorkers () {
        return workers;
    }
}
