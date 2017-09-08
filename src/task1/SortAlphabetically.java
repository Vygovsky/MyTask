package task1;

import java.util.*;

public class SortAlphabetically {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
      sortArrayOfChar(sc2);


    }

    public static void sortArrayOfChar(Scanner sc) {
        String[] words = sc.nextLine().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            for (int j = words.length - 1; j > i; j--)
                if (words[j].length() < words[j - 1].length()) {
                    String temp = words[j];
                    words[j] = words[j - 1];
                    words[j - 1] = temp;
                }
        }
        for (String word:words) {
            System.out.println(word);

       }
    }

    public static void sortArrayOfLit(Scanner sc) {
        String words = sc.nextLine();
        if (words.compareTo(sc.nextLine())) {
                    String temp = words;
                    words = words[j - 1];
                    words[j - 1] = temp;
                }

        }
    }

    public static void getLetter2(Scanner sc) {
        Arrays.stream(new Scanner(System.in).nextLine().split("[\\s ]+")).
                sorted(Comparator.comparing(String::toLowerCase)).forEach(System.out::println);
    }
}