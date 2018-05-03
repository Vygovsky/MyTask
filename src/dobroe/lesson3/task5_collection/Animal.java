package dobroe.lesson3.task5_collection;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void voice() {
        System.out.println("Rrrrr...");
    }
    public abstract void dyingVoice();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age &&
                Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + this.getClass().getSimpleName() + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public abstract void voice(String voice);
}
