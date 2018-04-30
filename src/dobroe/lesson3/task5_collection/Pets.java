package dobroe.lesson3.task5_collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pets {
    private List<Animal> animals;

    public Pets() {
        this.animals = new ArrayList<>();
    }

    public void addAnimalInPet(Animal animal) {
        animals.add(animal);
    }

    public void printInfoAddAnimals() {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " которому " + animal.getAge() + " лет/год. Животное " +
                    "относится к " + "классу " + animal.toString());
        }
    }

    public void removePetsFromRangeOfAges(int start, int finish) {
        for (Iterator<Animal> iterator = animals.iterator(); iterator.hasNext(); ) {
            Animal currentAnimal = iterator.next();
            int age = currentAnimal.getAge();
            if (age > start && age < finish) {
                System.out.println(currentAnimal.getClass().getSimpleName() + " - " + currentAnimal.getName() + " остается в питомнике.");
            } else {
                System.out.println(currentAnimal.getClass().getSimpleName() + " - " + currentAnimal.getName() + " будет выброшен на улицу!");
                iterator.remove();
            }
        }
    }
}