package dobroe.lesson3.task5_collection;

import java.util.ArrayList;
import java.util.List;


public class Pets {
    private List<Animal> animals;

    public Pets() {
        this.animals = new ArrayList<>();
    }

    public void addAnimalInPet(Animal animal) {
        animals.add(animal);
    }
}