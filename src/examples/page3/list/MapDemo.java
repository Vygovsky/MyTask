package examples.page3.list;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Roman_v on 16.09.2017.
 */
public class MapDemo {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("key1","value1");
        map.put("key2","value2");
        System.out.println(map);
        map.put("key1","new_value1");
        System.out.println(map);

        Map map1=new HashMap();
        map1.put("key2","new_value2");
        map1.put("key3","value2");
        map1.putAll(map);
        System.out.println(map1);

        System.out.println("Printing all key 1");
        System.out.println(map1.keySet());

        System.out.println(map1.values());



    }
}
