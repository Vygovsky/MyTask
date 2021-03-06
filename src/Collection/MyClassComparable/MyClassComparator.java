package Collection.MyClassComparable;

import java.util.Comparator;

public class MyClassComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().compareTo(o2.toString());
    }

    public int reversed(Object o3, Object o4) {
        return o3.toString().compareTo(o4.toString());
    }
}
