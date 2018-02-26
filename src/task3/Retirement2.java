package task3;

import java.util.Scanner;

public class Retirement2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       /* System.out.println("Укажите количество денег при которых Вы выйдите на пенсию?");
        double goal = in.nextDouble();*/
        System.out.println("Сколько денег Вы будете вкладывать ежегодно? ");
        double payment = in.nextDouble();
        System.out.println("Условие ежегодного процента Банка?");
        double interestRate = in.nextDouble();

        double balance = 0;
        int year = 0;
        String input;

        do {
            balance += payment;
            double sum = balance * interestRate / 100;
            balance += sum;
            year++;
            System.out.printf("После %d лет/год ваш баланс составляет %.2f\n", year, balance);
            System.out.println("Вы готовы выйти на пенсию(Y/N)");
            input = in.next();
        } while (input.equalsIgnoreCase("N"));

    }
}
