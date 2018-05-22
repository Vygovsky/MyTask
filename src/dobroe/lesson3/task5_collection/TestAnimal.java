package dobroe.lesson3.task5_collection;

//import sun.reflect.generics.reflectiveObjects.NotImplementedException;

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
       /* animal.add(new Fish("Dorry", 2));
        animal.add(new Fish("Kolly", 1));
        animal.add(new Fish("Molly", 4));*/
       // printVoiceAnimal(animal);

        printInfo(animal);
        animals.deleteAnimals(animal);
        animals.getNameDogs(animal);
        printInfo(animal);
        System.out.println("====================");
        Pets pets = new Pets();

        pets.addAnimalInPet(new Cat("Москти", 5));
        pets.addAnimalInPet(new Cat("Форест", 10));
        pets.printInfoAddAnimals();
        pets.removePetsFromRangeOfAges(1, 8);
    }

    public static void printInfo(List<Animal> animals) {
        for (Animal animal : animals) {
            if (animal != null)
                System.out.println(animal.getName() + " которому " + animal.getAge() + " лет/год. Животное " +
                        "относится к классу " + animal.toString());
        }
    }

   /* public static void printVoiceAnimal(List<Animal> animals) {
        int countIO = 0;
        for (Animal animal : animals) {
            try {
                animal.voice();

            } catch (NotImplementedException e) {
                System.out.println("Рыбы не разговаривают.");
                countIO++;
            }
        }
        System.out.println("Колличество ошибок = " + countIO);
    }*/
}





