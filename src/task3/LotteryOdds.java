package task3;

import java.util.Scanner;

/**
 * Created by Roman_v on 09.03.2018.
 */
public class LotteryOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько чисел в лотерейном билете?");
        int k = sc.nextInt();

        System.out.println("Сколько чисел в лотерейном билете?");
        int n = sc.nextInt();

        int lotteryOdds = 1;
        for (int i = 1; i <= k; i++) {
            lotteryOdds = lotteryOdds * (n - i + 1) / i;
            System.out.println("Your odds are 1 in " + lotteryOdds + ". Good luck!");

        }
    }
}
