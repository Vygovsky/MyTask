package Test;

import java.util.Scanner;

/**
 * Created by Roman_v on 05.01.2018.
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int i = 1;
        int res = 0;

        while (i <= 10) {
            res = N * i;
            System.out.printf("%d x %d = %d%n", N, i, res);
            i++;
        }
    }
}

/*int res=2;
        res*=N;
        System.out.println(res);*/