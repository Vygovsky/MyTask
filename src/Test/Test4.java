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
            /*  int a=5; int b=3; int n=5;
               S1=5+1*3=8;
               S2=5+1*3+2*3=14;
               S3=5+1*3+2*3+4*3=26;
               ....
            * */
            res = a;
            for (int j = 0; j < n; j++) {
                int x = (int) Math.pow(2, j) * b;
                res += x;
                System.out.print(res + " ");
            }
            System.out.println();
        }
        in.close();
    }
}


