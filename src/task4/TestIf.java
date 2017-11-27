package task4;

public class TestIf {
    public static void main(String[] args) {
        int a = 5;
        int b = 9;
        int c = 2;
        int d = 8;
        int v = 10;
        int x = (a > b && a > c && a > d) ? a :
                (b > a && b > c && b > d) ? b :
                        (c > a && c > b && c > d) ? c : d;
        System.out.println(x);

        int t = a == b ? 1 : 0, o = b == c ? 1 : 0, p = c == d ? 1 : 0, i = d == v ? 1 : 0, y = t + o + p + i;
        System.out.println(y);

        /////////////////min number/////////////////
       /* int x = (a < b && a < c && a < d) ? a :
                (b < a && b < c && b < d) ? b :
                        (c < a && c < b && c < d) ? c : d;
        System.out.println(x);*/
    }
}
