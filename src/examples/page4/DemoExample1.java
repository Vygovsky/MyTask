package examples.page4;

/**
 * Created by Roman_v on 11.09.2017.
 */
public class DemoExample1 {
    public static void main(String[] args) {
        Formula f = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 10);
            }
        };
        f.calculate(100);
        f.calculate(4);
        System.out.println(f.toString());
    }
}
