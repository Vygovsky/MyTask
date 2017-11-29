package Collection;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Roman_v on 11/29/2017.
 */
public class SetExample {
    public static void main(String[] args) {
        Set<String> test = new LinkedHashSet<>();
        for (int i = 5; i > 0; i--) {
            test.add("Строка " + i);
        }
        for (String s : test) {
            System.out.println(s);
        }
        System.out.println();
        for (int i = 1; i < 6; i++) {
            test.add("Строка " + i);
        }
        for (String s : test) {
            System.out.println(s);
        }
    }
}
