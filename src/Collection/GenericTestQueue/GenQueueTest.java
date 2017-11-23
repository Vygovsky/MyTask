package Collection.GenericTestQueue;

public class GenQueueTest {
    public static void main(String[] args) {
        GenObjectQueue<String> queue = new GenObjectQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.push("Сторка: " + i);
        }
        for (int i = 0; i < queue.getSize(); i++) {
            String s = queue.get(i);
            System.out.println(s);
        }
        System.out.println("================");
        while (queue.getSize() > 0) {
            String s = queue.pull();
            System.out.println(s + " Размер:" + queue.getSize());
        }
    }

}

