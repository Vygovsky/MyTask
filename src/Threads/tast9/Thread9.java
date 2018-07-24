package Threads.tast9;

import examples.page6.MyThread;

public class Thread9 {
    public static void main(String[] args) throws InterruptedException {
        Resource resource = new Resource();
        resource.setI(5);
        MyTread thread = new MyTread();
        thread.setName("one");
        MyTread thread2 = new MyTread();
        thread.start();
        thread2.start();
        thread.join();
        thread2.join();
        System.out.println(Resource.i);

    }
}

class MyTread extends Thread {
    Resource resource;

   /* public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        resource.changeI();
    }*/

    @Override
    public void run() {
        Resource.changeStaticI();
    }
}

class Resource {
    static int i;
    //private  int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    /*public synchronized void changeI() {
        //synchronized (this) {
        int i = this.i;
        if (Thread.currentThread().getName().equals("one")) {
            Thread.yield();
        }
        i++;
        this.i = i;
    }
*/
    //  }
    public synchronized static void changeStaticI() {
        //synchronized (this) {
        int i = Resource.i;
        if (Thread.currentThread().getName().equals("one")) {
            Thread.yield();
        }
        i++;
        Resource.i = i;
    }
    //  }
}


