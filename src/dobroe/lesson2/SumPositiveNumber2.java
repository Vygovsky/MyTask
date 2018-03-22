package dobroe.lesson2;

/**
 * Created by Roman_v on 22.03.2018.
 */
public class SumPositiveNumber2 {
    public static int intTest(int a, int b, int c) {
        int result = 0;
        if (a > 0) result += a;
        if (b > 0) result += b;
        if (c > 0) result += c;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(intTest(3, -5, 9));
    }
}

