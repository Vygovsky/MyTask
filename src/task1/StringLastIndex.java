package task1;


import java.util.Arrays;

public class StringLastIndex {
    public static void main(String[] args) {
        int[] a = {1, 22, 3366, 99};
      // getlast(a);


    }

    public static int[] getlast(int[] a) {
        for (int i = 0; i < a.length; i++) {
            String s = String.valueOf(a[i]);
            int res = Integer.parseInt(s.substring(s.length() - 1));
            a[i] = res;
            System.out.print("[" + a[i] + "" + "]");
        }
        return a;
    }


}






