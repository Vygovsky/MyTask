package task1;

import java.util.*;

public class SortAlphabetically {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
       getLetter2(sc2);
        //getLetter(sc2);

    }

    public static void getLetter(Scanner sc) {
        String[] words = sc.nextLine().split("[\\s ]+ ");
        for (int i = 0; i < words.length; i++)
            for (int j = words.length - 1; j > i; j++)
                if (words[0].length() > words[1].length()) {
                String temp=words[0];
                words[0]=words[1];
                words[1]=temp;



                }

    }

    public static void getLetter2(Scanner sc) {
        Arrays.stream(new Scanner(System.in).nextLine().split("[\\s ]+")).
                sorted(Comparator.comparing(String::toLowerCase)).forEach(System.out::println);
    }
}