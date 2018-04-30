package dobroe.lesson3.task5_collection;

/**
 * Created by Roman_v on 30.04.2018.
 */
public class TestGC {
    public static void main(String[] args) {
        new Dog("Bob", 6);
        new Cat("Tor", 9);
        System.gc();
    }
}

