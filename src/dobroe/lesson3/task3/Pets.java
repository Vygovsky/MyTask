package dobroe.lesson3.task3;

public class Pets {
    private Animal[] animals;
    private int lengthMassiv;

    public Pets() {
        this.animals = new Animal[1];
        this.lengthMassiv = 0;
    }

    public void addAnimalInPet(Animal animal) {
        if (lengthMassiv < animals.length) {
            animals[lengthMassiv++] = animal;
        }
        getAnimals(animal, 1, 8);
        System.out.println(animal.getName());

    }

    private Animal[] getAnimals(Animal type, int start, int finish) {
        Animal[] animalsNew = new Animal[lengthMassiv];

        for (int i = 0; i < animals.length; i++) {
            if (animals[i].getAge() > start && animals[i].getAge() < finish) {
                animalsNew[0] = animals[i];
            }
        }
        return animalsNew;
    }
}