package task3;

public class Compoundlnterest {
    public static void main(String[] args) {
        final int STARTRATE = 10;
        final int NRATE = 6;
        final int NYEAR = 10;

        // установить процентные ставки 10 . . . 15%
        double[] interestRate = new double[NRATE];
        for (int i = 0; i < interestRate.length; i++) {
            interestRate[i] = (STARTRATE + i) / 100.0;
        }
        // установить исходные остатки на счету равными 10000
        double[][] balance = new double[NYEAR][NRATE];
        for (int j = 0; j < balance[0].length; j++)
            balance[0][j] = 10000;


        // рассчитать проценты на следующие годы
        for (int k = 1; k < balance.length; k++) {
            for (int l = 0; l < balance[k].length; l++) {
                // получить остатки на счету за прошлый год
                double oldBalance = balance[k - 1][l];
                // рассчитать проценты
                double interest = oldBalance * interestRate[l];
                // рассчитать остатки на счету в текущем году
                balance[k][l] = interest + oldBalance;
            }
        }

        // вывести один ряд процентных ставок
        for (int k = 0; k < interestRate.length; k++)
            System.out.printf("%9.0f%%", 100 * interestRate[k]);

        System.out.println();
        // вывести таблицу остатков на счету
        for (double[] row : balance) {
            // вывести строку таблицы
            for (double v : row)
                System.out.printf("%10.2f", v);
            System.out.println();


        }
    }
}