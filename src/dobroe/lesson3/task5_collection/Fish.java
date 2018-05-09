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
    public void voice(String voice) {
    }

    @Override
    public void voice() throws NotImplementedException {
        throw new NotImplementedException();
    }

    @Override
    public String toString() {
        return "Fish.";
    }
}
