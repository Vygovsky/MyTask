package examples.page2;

/**
 * Created by Roman_v on 11.09.2017.
 */
public class Demo2 {
    public static void main(String[] args) {
        Converter<String, Integer> convr = Integer::valueOf;
        Integer converted = convr.con("1237");
        System.out.println(converted);

        SomeString ss = new SomeString();
        Converter<String, String> converter = ss::string;
        String conver = converter.con("Java");
        System.out.println(conver);

        PersonFactory pf = Person::new;
        System.out.println(pf.create("Pety", "Kolya"));

        final int num = 1;
        Converter<Integer, String> integerStringConverter = (from) -> String.valueOf(from + num);
        System.out.println(integerStringConverter.con(2));


       // int num = 1;
       // Converter<Integer, String> integerStringConverter2 = (from) -> String.valueOf(from + num);
       // System.out.println(integerStringConverter.con(2));
    }
}
