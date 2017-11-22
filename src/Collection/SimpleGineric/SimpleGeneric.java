package Collection.SimpleGineric;

public class SimpleGeneric<T> {
    private T element;

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }
}

 class GenericTest {
    public static void main(String[] args) {
        SimpleGeneric<String> sg = new SimpleGeneric<>();
        sg.setElement("121545");

        SimpleGeneric<Integer>sg2=new SimpleGeneric<>();
        sg2.setElement(99);


    }
}
