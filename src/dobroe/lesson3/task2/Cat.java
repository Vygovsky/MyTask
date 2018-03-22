package dobroe.lesson3.task2;

/**
 * Created by Roman_v on 21.03.2018.
 */
public class Cat extends Animal {
    private static int count;

    public Cat(String name, int age) {
        super(name, age);
        count++;
    }

    @Override
    public void voice() {
        System.out.println(getName() + " умеет мяукать. Коту " + getAge() + " лет");
    }

    @Override
    public String toString() {
        return "Cat.";
    }
}
