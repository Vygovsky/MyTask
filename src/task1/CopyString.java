package task1;

import java.util.Arrays;

public class CopyString {
    public static void main(String[] args) {
        String[] s = {"a", "bb", "ccc"};

        for (String word : s) {
            System.out.println(word);
            getTolk(new String[]{"oo"});

            StringBuilder sb = new StringBuilder(word);
            for (int i = 1; i < 3; i++) {
                sb.append(word);
            }
            System.out.println(sb);
            String[] copyS = Arrays.copyOf(s, word.length());
            System.out.println(copyS.toString());
        }

    }

    public static void getTolk(String[] words) {
        String[] strArrey = new String[3];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < strArrey.length; i++) {
            sb.append(strArrey[i]);
        }
    }
}
