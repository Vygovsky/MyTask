package Test;

import java.util.Scanner;

/**
 * Created by Roman_v on 25.01.2018.
 */
public class Test4 {
    public static void main(String[] args) {
        int res = 0;
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            res = a + b;
            for (int j = 0; j < n; j++) {
                int x = 2 ^ j * b;
                res+=x;


                System.out.print(res + " ");
            }
            System.out.println();
        }

        in.close();
    }
}


