package dobroe.lesson3.task1;

/**
 * Created by Roman_v on 21.03.2018.
 */
public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }
    @Override
    public void voice() {
        System.out.println(getName()+" умеет гавкать. Собаке "+getAge()+" лет");
    }
}
