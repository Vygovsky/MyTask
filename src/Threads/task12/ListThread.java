package Threads.task12;

import java.util.ArrayList;
import java.util.List;

public class ListThread {


    public static void main(String[] args) throws Exception {
        NameList thread = new NameList();
        thread.addName("Roman");
      //  thread.addName("Sergei");
        class MyThread extends Thread {
            @Override
            public void run() {
                System.out.println(thread.removeNameFirst());
            }

        }
        MyThread myThread = new MyThread();
        myThread.setName("One");
        myThread.start();
        new MyThread().start();

    }

    static class NameList extends Thread {
        List list = new ArrayList();

        public void addName(String name) {
            list.add(name);
        }

        public String removeNameFirst() {
            if (list.size() > 0) {
                return (String) list.remove(0);
            }
            return null;
        }
    }
}


