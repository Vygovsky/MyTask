package Threads.task4;

/**
 * Created by Roman_v on 13.12.2017.
 */
public class SimpleRunbThread {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Runnable r = new MyThread();
            Thread t = new Thread(r);
            t.start();
        }
    }

    static class MyThread implements Runnable {

        @Override
        public void run() {
            try {
                Long pause = Math.round(Math.random() * 2000);
                Thread.sleep(pause);
                System.out.println("Simple Thread - pause " + pause);
            } catch (InterruptedException e) {

            }
        }
    }
}
