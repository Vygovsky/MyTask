package examples.page6;

/**
 * Created by Roman_v on 23.10.2017.
 */
public class ThreadApp {
    public static void main(String[] args) {
        CommonResourse commonResourse=new CommonResourse();
        for (int i = 1; i <6 ; i++) {
            Thread  t=new Thread();
            t.setName("Potok "+i);
            t.getName();

        }
    }

    static class CommonResourse {
        int x = 0;
    }

    static  class  ContThread implements Runnable {
        CommonResourse res;

        ContThread(CommonResourse res) {
            this.res = res;
        }

        public void run() {
            res.x=1;
            for (int i = 1; i <5 ; i++) {
                System.out.printf("%s,%d",Thread.currentThread().getName(),res.x);
                res.x++;
            }
            try {
             Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
    }
}
