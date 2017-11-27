package Collection.BaseClass;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roman_v on 27.11.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<MyClass3> list3 = new ArrayList<>();
        list3.add(new MyClass3("Андрей 1"));
        list3.add(new MyClass3("Настя 1"));
        list3.add(new MyClass3("Коля 1"));
        list3.add(new MyClass3("Митя 1"));
        list3.add(new MyClass3("Анна 1"));
        printCollections("Коллекция 1", list3);

        List<MyClass4> list4 = new ArrayList<>();
        list4.add(new MyClass4("Андрей 2"));
        list4.add(new MyClass4("Настя 2"));
        list4.add(new MyClass4("Коля 2"));
        list4.add(new MyClass4("Митя 2"));
        list4.add(new MyClass4("Анна 2"));
        printCollections("Коллекция 2", list4);
    }

    private static void printCollections(String title, List<? extends BaseClass> list) {
        System.out.println(title);
        for (Object mc : list) {
            BaseClass bc = (BaseClass) mc;
            System.out.println("Item :" + bc.getName());
        }
        System.out.println();
    }

}
/////////////////////Object//////////////////////////////
/* private static void printCollections(String title, List list) {
        System.out.println(title);
        for (Object mc : list) {
            BaseClass bc = (BaseClass) mc;
            System.out.println("Item :" + bc.getName());
        }
        System.out.println();
    }*/