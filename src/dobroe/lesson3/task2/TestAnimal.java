package dobroe.lesson3.task2;

/**
 * Created by Roman_v on 21.03.2018.
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animal = {
                new Cat("Мурзик", 5),
                new Dog("Тузик", 12),
                new Dog("Шарик", 3),
                new Cat("КисКис", 16),
                new Dog("Тузик", 4)
        };
        printInfo(animal);
    }

    public static void printInfo(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " которому " + animal.getAge() + " лет/год. Животное " +
                    "относится к " + "классу " + animal.toString());
        }
    }
}
