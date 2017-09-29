package task2;

public class MassChar {
    public static void main(String[] args) {
        String[][] s = new String[3][6];
        char c = 'a';
        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < s[0].length; j++) {
                s[i][j] = String.valueOf((char) (c + i)) + (j + 1);
                System.out.print(s[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}
