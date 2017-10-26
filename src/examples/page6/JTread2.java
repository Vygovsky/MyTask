package examples.page6;

/**
 * Created by Roman_v on 23.10.2017.
 */
public class JTread2 implements Runnable {
    private boolean isAlive;

   public void disable() {
        isAlive = false;
    }

    public JTread2() {
        isAlive = true;
    }

    public void run() {
        System.out.printf("Поток %s начал работу...\n", Thread.currentThread().getName());
        int counter=1;
        while (isAlive){
            System.out.println("cicl= "+counter++);
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("Поток прерван");
        }
        System.out.printf("Поток %s завершил работу...\n", Thread.currentThread().getName());
    }
}