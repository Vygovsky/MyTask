package Threads.task8;

/**
 * Created by Roman_v on 24.06.2018.
 */
public class TestBlackWhite {
    public static synchronized void main(String[] args) {
        Thread thread=new Thread(TestBlackWhite::printBlack);
        thread.start();
        System.out.println("white");
    }
    static synchronized void printBlack(){
        System.out.println("black");

    }
}
