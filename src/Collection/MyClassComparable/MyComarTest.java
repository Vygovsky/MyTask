package Collection.MyClassComparable;


import Collection.MyClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyComarTest {
    public static void main(String[] args) {
        System.out.println("Вариант сортировки через Comparator");
        List<MyClassCompare> listSort = new ArrayList<>();
        listSort.add(new MyClassCompare("Андрей"));
        listSort.add(new MyClassCompare("Мила"));
        listSort.add(new MyClassCompare("Антон"));
        listSort.add(new MyClassCompare("Наталья"));
        listSort.add(new MyClassCompare("Анна"));
        listSort.add(new MyClassCompare("Татьяна"));
        printCollection1("Без сортировки", listSort);
        Collections.sort(listSort);
        printCollection1("После сортировки", listSort);


        System.out.println("Вариант сортировки через Comparator");
        List<MyClass> list = new ArrayList<>();
        list.add(new MyClass("Андрей"));
        list.add(new MyClass("Мила"));
        list.add(new MyClass("Антон"));
        list.add(new MyClass("Наталья"));
        list.add(new MyClass("Анна"));
        list.add(new MyClass("Татьяна"));
        printCollection2("Без сортироваи", list);
        list.sort(new MyClassComparator());
        printCollection2("После сортировки", list);
    }

    public static void printCollection1(String title, List<MyClassCompare> list) {
        System.out.println(title);
        for (MyClassCompare myClassCompare : list) {
            System.out.println("Item: " + myClassCompare);
        }
        System.out.println();
    }

    public static void printCollection2(String title, List<MyClass> list) {
        System.out.println(title);
        for (MyClass myClass : list) {
            System.out.println("Item: " + myClass);
        }
        System.out.println();
    }

}
