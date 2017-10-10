package task2.task9;

import java.util.Random;

public class ThreeMas {
    public static void main(String[] args) {
        int[] array = new int[10];
        int[] array2 = new int[10];
        double[] doubles = new double[10];

        Random random = new Random();
        for (int i = 1; i < array.length; i++) {
            array[i] = random.nextInt(9) + 1;
            System.out.print(array[i] + " ");
        }
     /*   for (int i = 0; i < array.length; i++) {
            doubles[i] = array[i] / array2[i];
            System.out.println(doubles + " ");
        }*/
    }
}
