package Threads.task13;

public class NotifyWait {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
       /* synchronized (myThread){
            myThread.wait();
        }*/
        System.out.println(myThread.total);

    }

    static class MyThread extends Thread {
        int total=0 ;

        @Override
        public void run() {
            synchronized (this) {
                for (int i = 0; i < 5; i++) {
                    total += i;
                    try {
                        sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                notify();
            }

        }
    }
}


