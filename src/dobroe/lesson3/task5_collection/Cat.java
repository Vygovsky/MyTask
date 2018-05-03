package dobroe.lesson3.task5_collection;

public  class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void dyingVoice() {
        System.out.println("ooo am dead. Mau");
    }

    @Override
    public void voice(String voice) {

    }


    @Override
    public void voice() {
        System.out.println(getName() + " умеет мяукать.");
    }

    protected void finalize() {
        dyingVoice();
    }

}

