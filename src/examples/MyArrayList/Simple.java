package examples.MyArrayList;

public interface Simple<E> extends Iterable<E> {
    boolean add(E e);

    E get(int index);

    void delete(int index);

    int size();

    void update(int index, E e);
}
