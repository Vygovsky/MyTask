package dobroe.lesson3.task5_collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Fish extends Animal {
    public Fish(String name, int age) {
        super(name, age);
    }

    @Override
    public void dyingVoice() {
    }

    @Override
    public void voice() {
        System.out.println("pppphhhh");
    }

    @Override
    public void voice(String voice) {
        try {
            voice();
            throw new NotImplementedException();
        } catch (NotImplementedException e) {
            e.printStackTrace();
        }
    }
}
