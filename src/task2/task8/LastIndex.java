package task2.task8;

import java.util.Random;

/**
 * Created by Roman_v on 07.10.2017.
 */
public class LastIndex {
    public static void main(String[] args) {
        int[] array8 = new int[12];
        getLastIndex(array8);
    }

    public static void getLastIndex(int[] array8) {
        Random random = new Random();
        for (int i = 0; i < array8.length; i++) {
            array8[i] = random.nextInt(31) - 15;
            System.out.print(array8[i] + "; ");
        }
        int index = 0; // это тоже сюда перенес, чтоб все вместе было хотя можно было оставить и там
        int max = array8[index]; // нужно писать здесь, потому как до первого цикла в array8[0] лежал 0
        for (int i = 0; i < array8.length; i++) {
            if (max <= array8[i]) {
                max = array8[i];
                index = i; // не index++, а именно index = i
            }
        }
        System.out.println();
        System.out.println("Максимальное число: " + max + " индекс равен = " + index);
    }
}

