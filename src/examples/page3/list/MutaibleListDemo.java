package examples.page3.list;

import java.util.ArrayList;
import java.util.List;

public class MutaibleListDemo {
    public static void main(String[] args) {
        List<Element> element = new ArrayList<>();
        final Element element1 = new Element("element1");
        element.add(element1);
        System.out.println(element);
        //  element1.value="Another element"
        // System.out.println(element);
        System.out.println(element.contains(new Element("element1")));


    }

    static class Element {
        String value;

        public Element(String value) {
            this.value = value;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("Element{");
            sb.append("value=");
            sb.append(value);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Element element = (Element) o;

            return value != null ? value.equals(element.value) : element.value == null;
        }

        @Override
        public int hashCode() {
            return value != null ? value.hashCode() : 0;
        }
    }

}
