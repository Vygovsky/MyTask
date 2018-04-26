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

    public void printInfoAnimalsPets() {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " которому " + animal.getAge() + " лет/год. Животное " +
                    "относится к " + "классу " + animal.toString());
        }
    }

    public void printInfoPestOfAges(Pets type, int start, int finish) {
        for (Animal animal : animals) {
            if (animal.getAge() > start && animal.getAge() < finish) {
                System.out.println(type.toString() +animal.getName()+ " остается в питомнике.");
            } else {
                System.out.println(type.getClass().getSimpleName() + " будет выброшен на улицу!");
            }
        }
    }
}