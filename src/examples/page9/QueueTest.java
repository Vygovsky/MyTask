package examples.page9;

public class QueueTest {
    public static void main(String[] args) {
        ObjectQueue queue = new ObjectQueue();
        for (int i = 0; i < 10; i++) {
            queue.push2("Строка " + i);
        }


        while (queue.size() > 0) {
            String s = (String) queue.pull();
             System.out.println(s);
            System.out.println("Размер очереди: " + queue.size());
           System.out.println(queue.get2(queue.size()-5));
        }

    }
}
