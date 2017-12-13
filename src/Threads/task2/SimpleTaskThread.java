package Threads.task2;

public class SimpleTaskThread {
    public static void  main(String[] args) {

        for (int i = 0; i < 10; i++) {
            Thread first = new MyThread();
            first.start();

        }
    }

    static class  MyThread extends Thread {

        @Override
        public void run() {
            try {
                Long pause = Math.round(Math.random() * 2000);
                Thread.sleep(pause);
                System.out.println( "Sipmle Thread - pause " + pause);

            } catch (InterruptedException e) {
            }
        }
    }
}
