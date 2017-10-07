package task2.task10;

import java.util.Random;

/**
 * Created by Roman_v on 07.10.2017.
 */
public class MassDemo10 {
    public static void main(String[] args) {
        int[] array = new int[11];
        int minusOne = 0;
        int zero = 0;
        int plusOne = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(3) - 1;
            System.out.print(array[i] + "; ");
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == -1) {
                minusOne++;
            }
            if (array[i] == 0) {
                zero++;
            }
            if (array[i] == 1) {
                plusOne++;
            }
        }

        if (minusOne > zero & minusOne > plusOne) {
            System.out.println("Элемент -1 встречается в массиве чаще всего = " + minusOne);
        } else if (zero > minusOne && zero > plusOne) {
            System.out.println("Элемент 0 встречается в массиве чаще всего = " + zero);
        } else {
            System.out.println("Элемент 1 встречается в массиве чаще всего = " + plusOne);

        }
    }
}

