package examples.MyArrayList;

import java.util.Iterator;

public class MyArrayList<E> implements Simple<E> {
    public static void main(String[] args) {
        Simple<String> stringSimple = new MyArrayList<>();
        stringSimple.add("abc");
        stringSimple.add("rpo");
        stringSimple.add("turbo");
        //System.out.println(stringSimple.get(1));
        stringSimple.delete(1);
        //stringSimple.update(1, "update");
        System.out.println(stringSimple.get(1));
    }

    private E[] value;

    public MyArrayList() {
        value = (E[]) new Object[0];
    }

    @Override
    public int size() {
        return value.length;
    }

    @Override
    public boolean add(E e) {
        try {
            E[] temp = value;
            value = (E[]) new Object[temp.length + 1];
            System.arraycopy(temp, 0, value, 0, temp.length);
            value[value.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public E get(int index) {
        return value[index];
    }

    @Override
    public void delete(int index) {

        try {
            E[] temp = value;
            value = (E[]) new Object[temp.length - 1];
            System.arraycopy(temp, 0, value, 0, index);
            int currentElement = temp.length - index - 1;
            System.arraycopy(temp, index + 1, value, index, currentElement);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void update(int index, E e) {
        value[index] = e;
    }

    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(value);
    }
}

