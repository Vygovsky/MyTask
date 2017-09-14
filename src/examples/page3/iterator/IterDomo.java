package page3.Iterator;

import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IterDomo {
    public static void main(String[] args) {
        Collection<Number> numbers = IntStream.range(10, 20).boxed().collect(Collectors.toList());
        System.out.println(numbers);
        Iterator<Number> iterator = numbers.iterator();
        Iterator<Number> iterator2 = numbers.iterator();

        System.out.println("Old_style: ");
        while (iterator.hasNext()) {
            Number number = iterator.next();
            System.out.print(number + " ");

            if (number.equals(15)){
                iterator.remove();
            }
        }
        System.out.println();
        System.out.println("After remove ");
        System.out.println(numbers);

        System.out.println("Old style for each: ");
        for (Number number : numbers) {
            System.out.print(number+" ");

        }
    }

}
