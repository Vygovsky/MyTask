package task1;


import java.util.Arrays;

public class StringLastIndex {
    public static void main(String[] args) {
        int[] a = {1, 22, 3396, 99, 180, 2963, 777};
        System.out.println(Arrays.toString(getLastIndex(a)));
        System.out.println(Arrays.toString(getLastIndex2(a)));
        System.out.println(Arrays.toString(getLastIndex3(a)));
    }

    public static int[] getLastIndex2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] % 10;
            System.out.print(a[i] + " " + "]");
        }
        return a;
    }

    public static int[] getLastIndex3(int[] a) {
        int temp;
        int res;
        for (int i = 0; i < a.length; i++) {
            temp = a[i] / 10 * 10;
            res = a[i] - temp;
            a[i] = res;
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






