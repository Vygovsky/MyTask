package task2;

import java.util.Random;

public class MassFoure {
    public static void main(String[] args) {
        Random ram = new Random();
        int[] array1 = new int[6];
        int[] array2 = new int[6];
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            array1[i] = ram.nextInt(5);
            System.out.print(array1[i] + " ");
            sum1 = sum1 + array1[i];
        }
        System.out.println("=> Sum 1 = " + sum1);

        for (int i = 0; i < array2.length; i++) {
            array2[i] = ram.nextInt(5);
            System.out.print(array2[i] + " ");
            sum2 = sum2 + array2[i];
        }
        System.out.println("=> Sum 2 = " + sum2);

        if (sum1 > sum2) {
            System.out.println("Первый массив больше чем второй");
        } else if (sum1 < sum2) {
            System.out.println("Второй массив больше чем первый ");
        } else {
            System.out.println("Массивы равны ");
        }
    }
}
