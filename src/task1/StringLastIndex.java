package task1;


import java.util.Arrays;

public class StringLastIndex {
    public static void main(String[] args) {
        int[] a = {1, 22, 3396, 99, 180, 2963, 777};
        getLastIndex(a);
        System.out.println();
        getLastIndex2(a);
    }

    public static int[] getLastIndex2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] % 10;
            System.out.print("[" + a[i] + "" + "]");
        }
        return a;
    }

    public static int[] getLastIndex(int[] a) {
        for (int i = 0; i < a.length; i++) {
            String s = String.valueOf(a[i]);
            int res = Integer.parseInt(s.substring(s.length() - 1));
            a[i] = res;
            System.out.print("[" + a[i] + "" + "]");
        }
        return a;
    }
}






