package Comparators;

import Animals.Animal;

import java.util.Comparator;

public class AnimalComparator implements Comparator<Animal> {

    @Override
    public int compare(Animal firstAnimal, Animal secondAnimal) {
        return firstAnimal.getName().compareTo(secondAnimal.getName());
    }

}
