package task1;

import java.util.*;

public class SortAlphabetically {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        // sortArrayOfChar(sc2);
       // sortArrayOfLit(sc2);
      // sortArrayOfAbc(sc2);
        sortArrayOf2word(sc2);


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
        for (String word : words) {
            System.out.println(word);

        }
    }

    public static void sortArrayOfLit(Scanner sc) {
        List<String> list = new ArrayList<>();
        while (true) {
            String s = sc.nextLine();
            if (s.equals("q")) {
                break;

            }
            list.add(s);
            Collections.sort(list);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(j).compareTo(list.get(j - 1)) < 0) {
                    String remove = list.remove(j - 1);
                    list.add(j, remove);
                }
            }
        }
        System.out.println(list);

    }
    public static void sortArrayOfAbc(Scanner sc) {
        String[] words = sc.nextLine().split("\\s+");
        for (int i = 0; i < words.length; i++) {
            for (int j = words.length - 1; j > i; j--)
                if (words[j].compareTo(words[j-1])<0) {
                    String temp = words[j];
                    words[j] = words[j - 1];
                    words[j - 1] = temp;
                }
        }
        for (String word : words) {
            System.out.println(word);

        }
    }
    public static void sortArrayOf2word(Scanner sc) {
        List<String> list = new ArrayList<>();
        while (true) {
            String s = sc.nextLine();
            if (s.equals("q")) {
                break;

            }
            list.add(s);
            Collections.sort(list);
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                String firstStr = list.get(j);
                int firstStrLength = firstStr.length();
                int indexOfFirstSpaceOfFirstStr = firstStr.indexOf(' ');
                String subFirstStr = firstStr.substring(indexOfFirstSpaceOfFirstStr+1, firstStrLength-1);

                String secondStr = list.get(j-1);
                int secondStrLength = secondStr.length();
                int indexOfFirstSpaceOfSecondStr = firstStr.indexOf(' ');
                String subSecondStr = firstStr.substring(indexOfFirstSpaceOfSecondStr+1, secondStrLength-1);

                if (subFirstStr.compareTo(subSecondStr) < 0) {
                    String remove = list.remove(j - 1);
                    list.add(j, remove);
                }
            }
        }
        System.out.println(list);
    }



    public static void getLetter2(Scanner sc) {
        Arrays.stream(new Scanner(System.in).nextLine().split("[\\s ]+")).
                sorted(Comparator.comparing(String::toLowerCase)).forEach(System.out::println);
    }
}