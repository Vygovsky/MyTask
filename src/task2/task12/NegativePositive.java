package task2.task12;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class NegativePositive {
    public static void main(String[] args) {
        Random random = new Random();
        // int plus, minus, zero;
        int[] array = new int[6];
        int[] array2 = new int[6];
        int[] array3 = new int[12];
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(6) - 6;
            array2[i] = random.nextInt(6) ;
            System.out.print(array[i] + "; ");
            System.out.print(array2[i] + "; ");
            array3[i] = array2[i];


            System.out.println(array3[i]);

       /* do {
            array[i]=random.nextInt();
        }*/
        }
    }
}
/*  int min = 0;
        int max = 0;
        int[] array = new int[12];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9)-10;
            do {

                array[i] = random.nextInt(9)-10;

            } while (array[i] == 0);

            System.out.print(array[i] + " ");
        }
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];

            }

        }
        System.out.println();
        System.out.print(min);*/