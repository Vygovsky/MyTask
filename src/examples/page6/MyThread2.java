package examples.page6;

/**
 * Created by Roman_v on 23.10.2017.
 */
public class MyThread2 {
    public static void main(String[] args) {
        System.out.println("Главный поток начал работу...");
        JTread2 myThread = new JTread2();
        new Thread(myThread,"JTraed").start();


        try {
            Thread.sleep(1100);
            myThread.disable();
            Thread.sleep(1000);

        } catch (InterruptedException e) {
            System.out.println("Potok prervan");
        }
        System.out.println("Главный поток закончил работу...");
    }
}
