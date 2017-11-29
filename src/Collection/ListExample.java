package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Roman_v on 29.11.2017.
 */
public class ListExample {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            stringList.add("Строка:" + i);
        }
        System.out.println();
        System.out.println("Через foreach");
        for (String s : stringList) {
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Через итератор");
        for (Iterator<String> list = stringList.iterator(); list.hasNext(); ) {
            String s = list.next();
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Печать через итератор списка от конца к началу");
        for (ListIterator<String> li = stringList.listIterator(stringList.size()); li.hasPrevious(); ) {
            String s = li.previous();
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Через итератор");
        for (ListIterator<String> li = stringList.listIterator(); li.hasNext(); ) {
            String s = li.next();
            System.out.println(s);
        }
        System.out.println();
        System.out.println("Печать через индекс элемента");
        for (int i = 0; i < stringList.size(); i++) {
            String s = stringList.get(1);
            System.out.println(s);
        }
    }
}