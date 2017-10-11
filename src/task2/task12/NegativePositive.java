package task2.task12;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Random;

public class NegativePositive {
    public static void main(String[] args) {
        Random random = new Random();
        int plus, minus, zero;
        int[] array = new int[12];
        ArrayList<Integer> arr = new ArrayList<>();

        do {
            array[i]=random.nextInt();
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