package task2;

public class MasChar {
    public static void main(String[] args) {
        String[][] s = new String[3][6];
        String[] s2 = {"a", "b", "c"};
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                s[i][j] = s2[i] + (1 + j);
                System.out.print(s[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
