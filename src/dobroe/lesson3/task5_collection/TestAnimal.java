package dobroe.lesson3.task5_collection;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {

    public static void main(String[] args) {
        DemoAnimal animals = new DemoAnimal();
        List<Animal> animal = new ArrayList<>();
        animal.add(new Cat("Мурзик", 6));
        animal.add(new Dog("Гобсппп", 12));
        animal.add(new Dog("Шарик", 3));
        animal.add(new Cat("КисКис", 16));
        animal.add(new Dog("Тузик", 4));
        printInfo(animal);
        animals.deleteAnimals(animal);
        animals.getNameDogs(animal);
        printInfo(animal);
        //  Pets pets = new Pets();

        //   pets.addAnimalInPet(new Cat("Мурзик", 5));
        //   pets.addAnimalInPet(new Cat("Форест", 10));
    }

    public static void printInfo(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal != null)
                System.out.println(animal.getName() + " которому " + animal.getAge() + " лет/год. Животное " +
                        "относится к " + "классу " + animal.toString());
            //   animal.voice();
        }
    }

}
