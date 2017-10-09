package task2.task11;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(3);
        list1.add(92);
        list1.add(15);
        list1.add(16);
        list1.add(8);
        isEmpy(list1);
        System.out.println();
        countingOfElements(list1);
        removeElement(list1);
        addLastPosition();


    }

    public static void addLastPosition(List<Integer> list) {
        list.lastIndexOf(0);
    }

    public static boolean isEmpy(List<Integer> list) {
        if (list != null) {
            System.out.println("Коллекция не пуста");
        }
        return false;
    }

    public static void countingOfElements(List<Integer> list) {
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }

    public static void removeElement(List<Integer> list) {
        list.clear();

    }


}
