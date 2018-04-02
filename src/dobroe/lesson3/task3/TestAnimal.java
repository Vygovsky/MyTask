package dobroe.lesson3.task3;


public class TestAnimal {
    static int count2 = 0;

    public static void main(String[] args) {
        DemoAnimals animals = new DemoAnimals();
        Animal[] animal = {
                new Cat("Мурзик", 5),
                new Dog("Тузик", 12),
                new Dog("Шарик", 3),
                new Cat("КисКис", 16),
                new Dog("Тузик", 4)
        };
        printInfo(animal);
       animals.remove(animal);
       printInfo(animal);

    }

    public static void printInfo(Animal[] animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " которому " + animal.getAge() + " лет/год. Животное " +
                    "относится к " + "классу " + animal.toString());
            //   animal.voice();
        }
    }


}





