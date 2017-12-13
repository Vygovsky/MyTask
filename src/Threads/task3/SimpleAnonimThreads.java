package Threads.task3;

public class SimpleAnonimThreads {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread() {
                @Override
                public void run() {
                    try {
                        Long pause = Math.round(Math.random() * 2000);
                        Thread.sleep(pause);
                        System.out.println("Simple Threat - pause" + pause);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            t.start();
        }
    }
}