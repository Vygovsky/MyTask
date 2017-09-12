package examples.page2;

/**
 * Created by Roman_v on 11.09.2017.
 */
@FunctionalInterface
interface Converter<F, T> {
 T con(F from);

}

