package dobroe.lesson3.task3;

public class TestAnimal {
    public static void main(String[] args) {
        DemoAnimals animals = new DemoAnimals();
        Animal[] animal = {
                new Cat("Мурзик", 5),
                new Dog("Гобсппп", 12),
                new Dog("Шарик", 3),
                new Cat("КисКис", 16),
                new Dog("Тузиккккк", 4)
        };
        printInfo(animal);
        animals.deleteAnimals(animal);
        animals.getNameDogs(animal);
        printInfo(animal);

        Pets pets = new Pets();
        pets.addAnimalInPet(new Cat("Мурзик", 10));
        pets.addAnimalInPet(new Cat("Форест", 0));
        pets.printInfoPestOfAges(pets,1,8);
    }

    public static void printInfo(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal != null)
                System.out.println(animal.getName() + " которому " + animal.getAge() + " лет/год. Животное " +
                        "относится к " + "классу " + animal.toString());
        }
    }
}

