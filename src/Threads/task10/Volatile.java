package Threads.task10;

public class Volatile {
   volatile static int i=0;

    public static void main(String[] args) {
        new MyThreadWrite().start();
        new MyThreadRead().start();
        // new MyThreadWrite().start();

    }

    static class MyThreadWrite extends Thread {

        @Override
        public void run() {
            while (i < 5) {
                System.out.println("increment on :" + (++i));
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class MyThreadRead extends Thread {
        @Override
        public void run() {
            int localVar = i;
            while (localVar < 5) {
                if (localVar != i) {
                    System.out.println("new value is : " + i);
                    localVar = i;

                }
            }
        }
    }
}
