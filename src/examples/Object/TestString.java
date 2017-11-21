package examples.Object;

import java.util.Date;

public class TestString {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("1");
        System.out.println(System.currentTimeMillis());
        for (int i = 0; i < 100000; i++) {
            sb.append("1");

        }
        System.out.println(System.currentTimeMillis());
    }
}
/*    String s = "1";
        System.out.println(new Date());
        for (int i = 0; i < 100000; i++) {
            s += "" + i;

        }
        System.out.println(new Date());*/