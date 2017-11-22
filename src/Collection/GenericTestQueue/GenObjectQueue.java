package Collection.GenericTestQueue;

public class GenObjectQueue<T> {
    private ObjectBox<T> head = null;
    private ObjectBox<T> tail = null;
    private int size = 0;

    public void push(T obj) {
        ObjectBox<T> ob = new ObjectBox<>();
        ob.setObject(obj);
        if (head == null) {
            head = ob;
        } else {
            tail.setObject(obj);
            tail = ob;
            size++;
        }
    }

    public T pull() {
        if (size == 0) {
            return null;
        }
        T obj = head.getObject();
        head = head.getNext();
        if (head == null) {
            tail = null;
            size--;
        }
        return obj;
    }


    private class ObjectBox<T> {
        private T object;
        private ObjectBox next;

        public T getObject() {
            return object;
        }

        public void setObject(T object) {
            this.object = object;
        }

        public ObjectBox<T> getNext() {
            return next;
        }

        public void setNext(ObjectBox<T> next) {
            this.next = next;
        }
    }
}