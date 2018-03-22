package dobroe.lesson3.task2;

/**
 * Created by Roman_v on 21.03.2018.
 */
public class Dog extends Animal {
    private static int count;
    public Dog(String name, int age) {
        super(name, age);
        count++;
    }

    @Override
    public void voice() {
        System.out.println(getName() + " умеет гавкать. Собаке " + getAge() + " лет");
    }

    @Override
    public String toString() {
        return "Dog.";
    }
}
