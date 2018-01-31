package Test;

import java.util.Scanner;


public class Test5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            try {
                long x = sc.nextInt();
                System.out.println(x + " can be fitted in:");
                if (x >= -128 && x <= 127) System.out.println(" * byte");
                if (x >= (short) -Math.pow(2, 15) && x <= (short) Math.pow(2, 15) - 1) System.out.println(" * short");
                if (x >= (int) -Math.pow(2, 31) && x <= (int) Math.pow(2, 31) - 1) System.out.println(" * int");
                if (x >= (long) -Math.pow(2, 63) && x <= (long) Math.pow(2, 63) - 1) System.out.println(" * long");

            } catch (Exception e) {
                System.out.println(sc.next() + " can't be fitted anywhere.");
            }


        }
    }
}
/* if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) System.out.println(" * byte");
                if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) System.out.println(" * short");
                if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) System.out.println(" * int");
                if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) System.out.println(" * long");*/