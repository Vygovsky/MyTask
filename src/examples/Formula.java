package examples;

/**
 * Created by Roman_v on 11.09.2017.
 */
interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}
