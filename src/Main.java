import Animals.*;
import Workers.DepartmentHead;
import Workers.Manager;
import Workers.Worker;
import Workers.ZooKeeper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.DoublePredicate;

public class Main {

    public static void main(String[] args){
        Zoo zoo = new Zoo();
        Zoo.setName("CY Zoo");

        Worker manager = new Manager("M01", null,"Tony");
        DepartmentHead departmentHead = new DepartmentHead("DH01", "M01", "Dennis");
        Worker firstZooKeeper = new ZooKeeper("ZK1", "DH01", "John", true);
        Worker secondZooKeeper = new ZooKeeper("ZK2", "DH01", "Paul", false);

        Dolphin dolphin = new Dolphin(350, "Dolphin");
        Elephant elephant = new Elephant(4000, "Elephant");
        Lion lion = new Lion(450, "Lion");
        Monkey monkey = new Monkey(50, "Monkey");
        Ostrich ostrich = new Ostrich(200, "Ostrich");

        List<Animal> animals = new ArrayList<Animal>();
        animals.add(dolphin);
        animals.add(elephant);
        animals.add(lion);
        animals.add(monkey);
        animals.add(ostrich);

        /*for (int i = 0; i < animals.length; i++){
            System.out.println(animals[i].getWeight());
            System.out.println(animals[i].getColor());
        }*/

        System.out.println("---First ZooKeeper---");
        for (int i = 0; i < animals.size(); i++){
            if (firstZooKeeper instanceof ZooKeeper) {
                animals.get(i).feed((ZooKeeper) firstZooKeeper);
            } else {
                System.out.println("Error");
            }
        }

        System.out.println("---Second ZooKeeper---");
        for (int i = 0; i < animals.size(); i++){
            if (secondZooKeeper instanceof ZooKeeper) {
                animals.get(i).feed((ZooKeeper) secondZooKeeper);
            } else {
                System.out.println("Error");
            }
        }

        System.out.println("---Manager---");
        for (int i = 0; i < animals.size(); i++){
            if (manager instanceof ZooKeeper) {
                animals.get(i).feed((ZooKeeper) manager);
            } else {
                System.out.println("Manager can't feed the " + animals.get(i).getName());
            }
        }

        List<Worker> workers = new ArrayList<Worker>();
        workers.add(manager);
        workers.add(departmentHead);
        workers.add(firstZooKeeper);
        workers.add(secondZooKeeper);

      //  findAllBoss(workers);
        findBoss(workers);
    }

    public static void findBoss(Worker[] workers){
        for (Worker workerToFindBoss : workers) {
            if (workerToFindBoss.getBossID() == null) {
                System.out.println(workerToFindBoss.getName() + " doesn't have Boss.");
                continue;
            }
            for (Worker worker : workers) {
                if (workerToFindBoss.getBossID().equals(worker.getID())) {
                    System.out.println(workerToFindBoss.getName() + "'s Boss" + " is " + worker.getName());
                }
            }
        }
    }

    /* public static void findAllBoss (Worker[] workers){
        for(int i = 0; i < workers.length; i++){
            System.out.println(findBoss(workers, workers[i]));
        }
    }

    public static Worker findBoss (Worker[] workers, Worker worker){
        for (int i = 0; i < workers.length; i++){
            if(worker.getBossID() == null){
                System.out.println(worker.getName() + " doesn't have Boss.");
                break;
            } else {
                if(worker.getBossID().equals(workers[i].getID())) {
                    return workers[i];
                }
            }
        }
        return null;
    }*/
}
