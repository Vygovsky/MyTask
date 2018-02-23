package task3;

import java.util.Scanner;

/**
 * Created by Roman_v on 23.02.2018.
 */
public class Retirement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажите количество денег при которых Вы выйдите на пенсию?");
        double goal = in.nextDouble();
        System.out.println("Сколько денег Вы будете вкладывать ежегодно? ");
        double payment = in.nextDouble();
        System.out.println("Условие ежегодного процента Банка?");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;
        while (balance < goal) {
            balance += payment;
            double sum = balance * interestRate / 100;
            balance += sum;
            year++;
        }
        System.out.println("Вы выйдите на пенсию через " + year + " год/лет.");
    }
}
