import Animals.*;
import Comparators.AnimalComparator;
import Comparators.WorkerComparator;
import Interfaces.Creature;
import Workers.DepartmentHead;
import Workers.Manager;
import Workers.Worker;
import Workers.ZooKeeper;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    static FileOutputStream outputStream;
    public static void main(String[] args){

        try {
            outputStream = new FileOutputStream("outputFile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred during creating the output file");
            e.printStackTrace();
        }

        ArrayList<Animal> animals = (ArrayList<Animal>) createAnimals();
        ArrayList<Worker> workers = (ArrayList<Worker>) createWorkers();

        Zoo zoo = new Zoo("CY Zoo", animals, workers);

        writeToFile("-- Every worker feed every animal -- \n-- They give sound, if they love the worker, otherwise move away. --\n\n");

        for(int i = 0; i < zoo.getWorkers().size(); i++) {
            feeding((Worker) zoo.getWorkers().get(i), zoo.getAnimals());
            }

        findBoss(zoo.getWorkers());
        List<Creature> roaster = addAllCreaturesToRoaster(animals, workers);
        printRoaster(roaster);
        try {
            outputStream.close();
        } catch (IOException e) {
            System.out.println("Unable to close file.");
        }

    }

    public static void findBoss(List<Worker> workers){
        writeToFile("\n-- Find whose boss is who--\n");
        for (Worker workerToFindBoss : workers) {
            if (workerToFindBoss.getBossID() == null) {
                writeToFile(workerToFindBoss.getName() + " doesn't have Boss.\n");
                continue;
            }
            for (Worker worker : workers) {
                if (workerToFindBoss.getBossID().equals(worker.getID())) {
                    writeToFile(workerToFindBoss.getName() + "'s Boss" + " is " + worker.getName() + "\n");
                }
            }
        }
    }

    public static List<Animal> createAnimals(){
        List<Animal> animals = new ArrayList<>();
        Ostrich ostrich = new Ostrich(200, "Ostrich Dave", Animal.Color.BROWN);
        Dolphin dolphin = new Dolphin(350, "Dolphin John", Animal.Color.BLUE);
        Monkey monkey = new Monkey(50, "Monkey Nick", Animal.Color.BLACK);
        Lion lion = new Lion(450, "Lion Simba", Animal.Color.YELLOW);
        Elephant elephant = new Elephant(4000, "Elephant Bob", Animal.Color.GREY);

        animals.add(dolphin);
        animals.add(elephant);
        animals.add(lion);
        animals.add(monkey);
        animals.add(ostrich);

        animals.sort(new AnimalComparator());
        return animals;
    }

    public static List<Worker> createWorkers(){
        List<Worker> workers = new ArrayList<>();

        Worker manager = new Manager("M01", null,"Tony");
        DepartmentHead departmentHead = new DepartmentHead("DH01", "M01", "Dennis");
        Worker firstZooKeeper = new ZooKeeper("ZK1", "DH01", "John", true);
        Worker secondZooKeeper = new ZooKeeper("ZK2", "DH01", "Paul", false);

        workers.add(manager);
        workers.add(departmentHead);
        workers.add(firstZooKeeper);
        workers.add(secondZooKeeper);
        workers.sort(new WorkerComparator());

        return workers;
    }

    public static void feeding(Worker worker, List<Animal> animals){
        for (Animal currentAnimal : animals) {
            if (worker instanceof ZooKeeper) {
                writeToFile(currentAnimal.feed((ZooKeeper) worker));
                writeToFile(worker.getName() + " fed the " + currentAnimal.getName() + ".\n");
            } else {
                writeToFile(worker.getName() + " can't feed the " + currentAnimal.getName() + ".\n");
            }
        }
    }

    public static List<Creature> addAllCreaturesToRoaster(ArrayList<Animal> animals, ArrayList<Worker> workers){
        ArrayList<Creature> allCreatures = new ArrayList<>();
        allCreatures.addAll(animals);
        allCreatures.addAll(workers);
        Collections.shuffle(allCreatures);
        return allCreatures;
    }

    public static void printRoaster(List<Creature> creatures){
        try {
            for (int i = 0; i < 5; i++) {
                Thread.sleep(1000);
                System.out.println("Roaster delayed for " + (5 - i) + " seconds.");
            }
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println("Error during delay");
            e.printStackTrace();
        }
        writeToFile("\n-- Shuffled list, that contains all workers and animals. --\n");
        for (Creature creature : creatures) {
            writeToFile(creature.getCreatureName() + " - " + creature.getClass().getCanonicalName().split( "\\.")[1] + "\n");
        }
    }

    public static void writeToFile(String str) {
        byte[] strToBytes = str.getBytes();
        try {
            outputStream.write(strToBytes);
        } catch (IOException e) {
            System.out.println("An error occurred during writing to file.");
            e.printStackTrace();
        }
    }
}
