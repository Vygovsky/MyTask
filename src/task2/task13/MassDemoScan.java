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
        int number = 0;
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(50);
            System.out.print(array[i] + "; ");
            if (array[i] % 2 == 0) {
                number++;
            }
        }

        int index = 0;
        System.out.println();
        int[] array2 = new int[number];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 & array[i] != 0) {
                array2[j] = array[i];
                index++;
                System.out.print(array2[j] + "; ");
            }
        }
        System.out.println("\nКолличество четных элементов " + index);
    }
}

