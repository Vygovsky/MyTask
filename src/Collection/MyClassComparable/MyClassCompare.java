package Collection.MyClassComparable;

public class MyClassCompare implements Comparable<MyClassCompare> {
    private String name;

    public MyClassCompare(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(MyClassCompare o) {
        return name.compareTo(name);
    }

    @Override
    public String toString() {
        return name;
    }
}