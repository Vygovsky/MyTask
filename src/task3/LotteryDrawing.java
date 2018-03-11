package task3;

import java.util.Arrays;
import java.util.Scanner;


public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько чисел нужно угадать в лотерейном билете?");
        int k = sc.nextInt();

        System.out.println("Сколько чисел имеет лотерейный билет?");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

        int[] res = new int[k];
        for (int i = 0; i < res.length; i++) {
            int r = (int) (Math.random() * n);
            System.out.println(r);
            res[i] = numbers[r];
            numbers[r] = numbers[n - 1];
            n--;
        }
        Arrays.sort(res);
        System.out.println("«Ставьте следующую комбинацию: это сделает вас богатыми!");
        for (int re : res) {
            System.out.print(re + " ");
        }
    }
}
