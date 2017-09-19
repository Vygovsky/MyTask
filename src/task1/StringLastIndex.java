package task1;



public class StringLastIndex {
    public static void main(String[] args) {
        int[] a = {1, 22, 3366, 99};

        for (int i = 0; i < a.length; i++) {
            String s = String.valueOf(a[i]);
            char ch = (char) (s.length()-1);
            int r=Integer.valueOf(ch);
            System.out.println(r);


        }

    }
}




