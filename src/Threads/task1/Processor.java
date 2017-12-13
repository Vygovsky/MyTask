package Threads.task1;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Processor {

    private static final int STR_COUNT = 100;
    private static final int TASK_COUNT = 10000;

    public static void main(String[] args) {
        {
            BigTaskOneThread bt = new BigTaskOneThread();
            Long d1 = System.currentTimeMillis();
            Long result = bt.startTask();
            Long d2 = System.currentTimeMillis();
            System.out.println(result + ", Time: " + (d2 - d1));

        }
        {
            BigTaskManyThread bm = new BigTaskManyThread();
            Long d1 = System.currentTimeMillis();
            Long result = bm.startTask2();
            Long d2 = System.currentTimeMillis();
            System.out.println(result + ", Time2: " + (d2 - d1));
        }
    }

    public Long process() {
        Long res = 0L;
        SecureRandom sr = new SecureRandom();
        for (int i = 0; i < TASK_COUNT; i++) {
            String g = new BigInteger(500, sr).toString(32);
            for (Character ch : g.toCharArray()) {
                res += ch;
            }
        }
        return res;
    }

    static class BigTaskOneThread {
        public Long startTask() {
            Long res = 0L;
            for (int i = 0; i < STR_COUNT; i++) {
                Processor pr = new Processor();
                res += pr.process();
            }
            return res;
        }
    }

    static class BigTaskManyThread {
        public Long startTask2() {
            int ap = Runtime.getRuntime().availableProcessors();
            ExecutorService es = Executors.newFixedThreadPool(ap);

            Long res = 0L;
            try {
                List<MyCallable> threads = new ArrayList<>();
                for (int i = 0; i < STR_COUNT; i++) {
                    threads.add(new MyCallable());
                }
                List<Future<Long>> res2 = es.invokeAll(threads);
                for (Future<Long> f : res2) {
                    res += f.get();
                }
                es.shutdown();
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace(System.out);
            }
            return res;
        }
    }

    static class MyCallable implements Callable<Long> {
        @Override
        public Long call() throws Exception {
            Processor pr = new Processor();
            return pr.process();
        }
    }
}
