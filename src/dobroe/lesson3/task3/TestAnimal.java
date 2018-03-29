package dobroe.lesson3.task3;


public class TestAnimal {
    static int count2=0;
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
            animal.voice();
        }
    }

    public static void getCatOfAge(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                //  if (animal.getAge() > 8 | animal.getAge() < 1) {
                deleteAnimals(animals);
                System.out.println("удаление кота " + animal.getName());
            }
        }

    }


    private static void deleteAnimals(Animal[] animals) {

        if (animal instanceof Cat)
            for (int i = 0; i < animals.length; i++) {
                if (animals[i].getAge() > 8 | animals[i].getAge() < 1) {
                    animals[i] = null;
                    count2--;
                }
            }
    }
}



