package dobroe.lesson3.task1;

/**
 * Created by Roman_v on 21.03.2018.
 */
public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Cat("Музя", 5);
        Animal animal2 = new Dog("Реск", 2);
        animal.voice();
        animal2.voice();



    }
}
