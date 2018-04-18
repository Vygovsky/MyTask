package dobroe.lesson3.task3;

public class Pets {
    private Animal[] animals;
    private int lengthMassiv;

    public Pets() {
        this.animals = new Animal[10];
        this.lengthMassiv = 0;
    }

    public void addAnimalInPet(Animal animal) {
        if (lengthMassiv < animals.length) {
            animals[lengthMassiv++] = animal;
        }
        getAnimals(animal, 1, 8);
        if(animal!=null)
        System.out.println(animal.getName());

    }

    private Animal[] getAnimals(Animal type, int start, int finish) {
        Animal[] animalsNew = new Animal[lengthMassiv];
        int count = 0;
        for (int i = 0; i < lengthMassiv; i++) {
            //if (animals[i].getAge() > start && animals[i].getAge() < finish) {
            animalsNew[count++] = animals[i];

        }
        for (int i = 0; i < animalsNew.length; i++) {
            if ( animalsNew[i].getAge() > finish) {
                animalsNew[i]=null;
            }
        }
        return animalsNew;
    }
}