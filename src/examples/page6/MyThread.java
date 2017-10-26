package examples.page6;

/**
 * Created by Roman_v on 23.10.2017.
 */
public class MyThread {
    public static void main(String[] args) {
        System.out.println("Главный поток начал работу...");
        JThread t = new JThread("JThread");
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            System.out.printf("Поток %s преван",t.getName());
        }

        System.out.println("Главный поток закончил работу...");
    }
}
/* for (int i = 0; i <5 ; i++) {
            new JThread("JThread"+i).start();
        }*/