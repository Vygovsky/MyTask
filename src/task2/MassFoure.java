package task2;

import java.util.Random;

public class MassFoure {
    public static void main(String[] args) {
        Random ram = new Random();
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        double average1 = 0;
        double average2 = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = ram.nextInt(5);
            System.out.print(array1[i] + " ");
            average1 = (average1 + array1[i]) / array1.length;

        }
        System.out.println("=> Среднее арифметическое значение  = " + average1);

        for (int i = 0; i < array2.length; i++) {
            array2[i] = ram.nextInt(5);
            System.out.print(array2[i] + " ");
            average2 = (average2 + array1[i]) / array1.length;
        }
        System.out.println("=> Среднее арифметическое значение  = " + average2);

        if (average1 > average2) {
            System.out.println("Первый массив больше чем второй");
        } else if (average1 < average2) {
            System.out.println("Второй массив больше чем первый ");
        } else {
            System.out.println("Массивы равны ");
        }
    }
}
