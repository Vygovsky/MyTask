package task2.task13;

import java.util.Random;
import java.util.Scanner;

public class MassDemoScan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число больше чем три :");
        int n = sc.nextInt();
        if (n > 3) {
            System.out.println("Запоняем массив :");
        } else {
            System.out.println("Пользователь ввёл не подходящее число. Число должно больше трех");
            System.exit(0);
        }
        int[] array = new int[n];
        int[] array2 = new int[n];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.print(array[i] + "; ");

        }
        System.out.println();
        int value;
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                value = array[i];
                array2[i] = value;
                index++;
            }
            System.out.print(array2[i] + "; ");

        }
        System.out.println(index);
    }

}
