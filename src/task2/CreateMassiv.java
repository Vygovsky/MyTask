package task2;

import java.util.Collections;

public class CreateMassiv {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        getProba(array);
        System.out.println("--------------------------------------");

        int[] array2 = new int[50];
        int index = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                array2[index] = i;
                System.out.print(array2[index++] + " ");
            }
        }
        System.out.println();
        for (int j = array2.length - 1; j >= 0; j--) {
                System.out.print(array2[j] + " ");
        }
    }

    public static int[] getProba(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        return array;
    }
}
