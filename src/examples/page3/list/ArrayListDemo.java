package examples.page3.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {
    private List<String> client = new ArrayList<>();

    public ArrayListDemo() {
        client.add("Roman");
    }

    public List<String> getClient() {
        return Collections.unmodifiableList(client);
    }

    public static void main(String[] args) {
  //      final List<String> list = new ArrayListDemo().getClient();
   //     list.add("Petr");
  //      System.out.println(list);
        capacGrow();
        //addString();
    }

    private static void addString() {
        List<String> str = new ArrayList<>();
        str.add("Srt_1");
        str.add("Srt_2");
        str.add("Srt_3");
        str.add("Srt_4");
        System.out.println(str);
        System.out.println(str.size());
        System.out.println(str.get(2));
        System.out.println(str.contains("Srt_2"));
        str.remove(3);
        System.out.println(str);

    }

    private static void capacGrow() {
        System.out.println("Befor ");
        List<String> capGrow = new ArrayList<>(1);
        for (int i = 0; i < 100; i++) {
            capGrow.add("Str-1");

        }
    }
}
