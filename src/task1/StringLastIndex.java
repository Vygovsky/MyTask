package task1;

import org.junit.Test;

public class StringLastIndex {
    public static void main(String[] args) {
        int[] a = {1, 22, 3366, 99};

        for (int i = 0; i < a.length; i++) {
            String s = String.valueOf(a[i]);
            char ch = (char) s.lastIndexOf(1);
            System.out.println(ch);

        }

    }
}




