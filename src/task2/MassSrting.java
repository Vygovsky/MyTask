package task2;

/**
 * Created by Roman_v on 28.09.2017.
 */
public class MassSrting {
    public static void main(String[] args) {
        String[][] s = new String[3][6];
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                System.out.print(" ");
                if (i == 0) {
                    s[i][j] = "a" + (j + 1);
                }
                if (i == 1) {
                    s[i][j] = "b" + (j + 1);
                }
                if (i == 2) {
                    s[i][j] = "c" + (j + 1);
                }
                System.out.print(s[i][j]);
            }
            System.out.print('\n');
        }
    }
}
