package dobroe.lesson3.task3;

public class Pets {
    private Animal[] animals;
    private int lengthMassiv;

    public Pets() {
        this.animals = new Animal[10];
        this.lengthMassiv = 0;
    }

    public Animal[] addAnimalInPet(Animal animal) {
        if (lengthMassiv < animals.length) {
            animals[lengthMassiv++] = animal;
        } else {
            Animal[] newAnimals = new Animal[animals.length * 2];
            System.arraycopy(animals, 0, newAnimals, 0, animals.length);
            animals = newAnimals;
            animals[lengthMassiv++] = animal;
        }
        return animals;
    }

    public void printInfoPestOfAges(Pets type, int start, int finish) {
        for (Animal pet : animals) {
            if(pet!=null)
            if (pet.getAge() > start && pet.getAge() < finish) {
                System.out.println(type.getClass().getSimpleName() + " остается в питомнике.");
            } else {
                System.out.println(type.getClass().getSimpleName() + " будет выброшен на улицу!");
            }
        }
    }
}
