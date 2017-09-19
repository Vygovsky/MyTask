package examples.page3.list;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Roman_v on 16.09.2017.
 */
public class HashMapDemp {
    public static void main(String[] args) {
        Map<Mapkey, String> hasMap = new HashMap<>();

        Mapkey key3 = new Mapkey(33);
        hasMap.put(key3, "value3");
        Mapkey key1 = new Mapkey(10);
        hasMap.put(key1, "value1");
        Mapkey key2 = new Mapkey(210);
        hasMap.put(key2, "value2");
        hasMap.put(null, null);
        System.out.println("Hasmap= " + hasMap);
        for (int i = 0; i <100 ; i++) {
            System.out.println(hasMap.containsKey(key1));

        }
    }

    static class Mapkey {
        private int key;

        public Mapkey(int key) {
            this.key = key;
        }

        public int getKey() {
            return key;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Mapkey mapkey = (Mapkey) o;

            return key == mapkey.key;
        }

        @Override
        public int hashCode() {
            return (int) Math.random();
        }

        @Override
        public String toString() {
            return "key" + key;
        }
    }
}
