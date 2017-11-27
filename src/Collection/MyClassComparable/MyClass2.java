package Collection.MyClassComparable;

public class MyClass2 {
    private String name;

    public MyClass2(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyClass2 myClass2 = (MyClass2) o;

        return name.equals(myClass2.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return name;
    }
}
