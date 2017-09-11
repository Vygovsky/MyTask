package examples.page1;

import java.util.*;

/**
 * Created by Roman_v on 11.09.2017.
 */
public class Lambda {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("anna", "toma", "nona", "yana", "klavdiya");
        Collections.sort(name, Comparator.naturalOrder());
        System.out.println(name);
    }
}