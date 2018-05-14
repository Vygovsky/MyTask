package dobroe.lesson4.task2;

public abstract class MyLinkedList<E> implements Iterable {
    private E[] value;

    public MyLinkedList(E[] value) {
        value = (E[]) new Object[0];
    }

    boolean add(Object element) {
        return true;
    }

    boolean contains(Object element) {
        return true;
    }

    int size() {
        return value.length;
    }

    boolean isEmpty() {
        return true;

    }

    boolean remove(Object element) {
        return true;
    }


}
