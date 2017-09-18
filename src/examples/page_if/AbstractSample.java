package examples.page_if;

import java.util.Random;


public class AbstractSample {
    public static int anInt() {
        Random random = new Random();
        int result = random.nextInt(5);
        System.out.println("Int value= " + result);
        return result;
    }
}
