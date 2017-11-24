package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MyClass> list = new ArrayList<>();

        list.add(new MyClass("Петр"));
        list.add(new MyClass("Коля"));
        list.add(new MyClass("Марина"));
        list.add(new MyClass("Яна"));
        list.add(new MyClass("Егор"));
        list.add(new MyClass("Вика"));

        printCollection("Оригинал", list);

        //smeshivanie
        Collections.shuffle(list);
        System.out.println("Смешивание" + list);

        Collections.reverse(list);
        System.out.println("Обратный порядок" + list);

        Collections.rotate(list, 1);
        System.out.println("Проворачивание" + list);
        Collections.swap(list, 2, 3);
        printCollection("Обмен элементов", list);

        Collections.replaceAll(list, new MyClass("Andrea"), new MyClass("Angel"));
        printCollection("Замена", list);

        List<MyClass> list2 = new ArrayList<>(list.size());
        for (MyClass myClass : list) {
            list2.add(null);
        }
        Collections.copy(list2, list);
        printCollection("Копирование", list2);

        Collections.fill(list2, new MyClass("ANTON"));
        printCollection("Полная замена", list2);
    }

    private static void printCollection(String title, List<MyClass> list) {
        System.out.println(title);
        for (MyClass myClass : list) {
            System.out.println("Item :" + myClass);
        }
        System.out.println();
    }
}
