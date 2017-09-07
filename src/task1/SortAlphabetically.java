package task1;

import java.util.*;

public class SortAlphabetically {
    public static void main(String[] args) {
        Scanner sc2 = new Scanner(System.in);
        getLetter2(sc2);
    }

    public void getLetter(Scanner sc) {
        List<String> scr = new ArrayList<>();
        String scanner = sc.nextLine();
        if (scanner.compareTo(sc.nextLine()) < 0) {


        }

    }
    public static void getLetter2(Scanner sc){
        Arrays.stream(new Scanner(System.in).nextLine().split("[\\s ]+")).
        sorted(Comparator.comparing(String::toLowerCase)).forEach(System.out::println);
    }
}