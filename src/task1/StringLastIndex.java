package task1;


import java.util.Arrays;

public class StringLastIndex {
    public static void main(String[] args) {
        int[] a = {1, 22, 3396, 99, 180, 2963, 777};
        //  getLastIndex(a);
        //  System.out.println();
        // getLastIndex2(a);
        // System.out.println();
        getLastIndex3(a);
    }

    public static String getLastIndex2(int[] a) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] % 10;
            System.out.print(a[i] + " " + "]");
        }
        return Arrays.toString(a);
    }

    public static int[] getLastIndex3(int[] a) {
        int temp;
        int res;
        for (int i = 0; i < a.length; i++) {
            temp = a[i] / 10 * 10;
            res = a[i] - temp;
            System.out.print(Arrays.toString(new int[]{res}));
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






