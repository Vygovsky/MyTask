package Threads.task7;

public class CounterThread extends Thread {
    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increaseCounter();
        }
    }


    static class Counter {
        private Long counter = 0L;

        public synchronized void increaseCounter() {
            //synchronized (this){};
            counter++;
        }

        public Long getCounter() {
            return counter;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        for (int i = 0; i < 200; i++) {

            CounterThread ct = new CounterThread(counter);
            ct.start();
        }
            Thread.sleep(1000);
            System.out.println("Counter " + counter.getCounter());
        }
    }

