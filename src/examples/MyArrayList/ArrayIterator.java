package examples.MyArrayList;

import java.util.Iterator;

public class ArrayIterator<E> implements Iterator {
    private int index = 0;
    E[] value;

    public ArrayIterator(E[] value) {
        this.value = value;
    }

    @Override
    public boolean hasNext() {
        return index<value.length;
    }

    @Override
    public Object next() {
        return  value[index++];
    }
}
