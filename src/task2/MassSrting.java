package task2;

/**
 * Created by Roman_v on 28.09.2017.
 */
public class MassSrting {
    public static void main(String[] args) {
        String[][] s = new String[3][6];
        char[] res = {'a', 'b', 'c'};

        for (int i = 0; i < s.length; i++) {
            System.out.println(" ");
            for (int j = 0; j < 6; j++) {
                System.out.print(s[i][j] + " " + i);
               // res[i][j] = 'a';
                System.out.print(s[i][j]);
            }

        }
    }
}
