package task2;

import java.util.Random;

public class MassFoure {
    public static void main(String[] args) {
        Random ram = new Random();
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        int sum1 = 0;
        int sum2 = 0;
        double avr = 0;
        double avr2 = 0;

        for (int i = 0; i < array1.length; i++) {
            array1[i] = ram.nextInt(5);
            System.out.print(array1[i] + " ");
            sum1 = sum1 + array1[i];
            avr = sum1 % array1.length;
        }
        System.out.println("=> Sum 1 = " + avr);

        for (int i = 0; i < array2.length; i++) {
            array2[i] = ram.nextInt(5);
            System.out.print(array2[i] + " ");
            sum2 = sum2 + array2[i];
            avr2 = sum2 % array1.length;
        }
        System.out.println("=> Sum 2 = " + avr2);

        if (avr > avr2) {
            System.out.println("Первый массив больше чем второй");
        } else if (avr < avr2) {
            System.out.println("Второй массив больше чем первый ");
        } else {
            System.out.println("Массивы равны ");
        }
    }
}
