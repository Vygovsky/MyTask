package Collection.GenericTestQueue;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericMethod {
    public <T> T addAndReturn(T element, Collection<T>list){
        list.add(element);
        return element;
    }

    public static void main(String[] args) {
        GenericMethod gm=new GenericMethod();
        String element1="StringElement";
        List<String>stringList=new ArrayList<>();
        String theElement=gm.addAndReturn(element1,stringList);
        System.out.println("Element 1: "+theElement);

        Integer intElement=99;
        List<Integer> integerList=new ArrayList<>();
        Integer theElement2=gm.addAndReturn(intElement,integerList);
        System.out.println("Element 2: "+theElement2);
    }

}
