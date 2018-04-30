package dobroe.lesson3.task5_collection;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void dyingVoice() {
        System.out.println("rrrauu am dead. Gav");
    }

    @Override
    public void voice() {
        System.out.println(getName() + " умеет гавкать.");
    }

    protected void finalize(){
        dyingVoice();
    }

}

