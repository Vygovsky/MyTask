package dobroe.lesson3.task1;

/**
 * Created by Roman_v on 21.03.2018.
 */
public class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void voice() {
        System.out.println(getName() + " умеет мяукать. Коту " + getAge() + " лет");
    }
}
