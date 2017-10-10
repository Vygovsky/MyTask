package task2.task9;

import java.util.Arrays;
import java.util.Random;

public class ThreeMas {
    public static void main(String[] args) {
        int array = 10;
        int[] array1 = new int[array];
        int[] array2 = new int[array];
        double[] doubles = new double[array];

        Random random = new Random();
        for (int i = 0; i < array; i++) {
            array1[i] = random.nextInt(9) + 1;
            array2[i] = random.nextInt(9) + 1;
            doubles[i] = (double) array1[i] / array2[i];
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(doubles));
    }
}

    /*class ThreeMasSecondImplementation {
        public static final int ARRAY_LENGTH = 10;

        public static void main(String[] args) {
            char[] arrChar1 = new char[ARRAY_LENGTH];
            char[] arrChar2 = new char[ARRAY_LENGTH];
            int[] arrInt = new int[ARRAY_LENGTH];
            Random random = new Random();
            for (int i = 0; i < ARRAY_LENGTH; i++) {
                arrChar1[i] = (char) random.nextInt(255);
                arrChar2[i] = (char) random.nextInt(255);
                arrInt[i] = arrChar1[i] + arrChar2[i];
            }
       System.out.println(Arrays.toString(arrChar1));
        System.out.println(Arrays.toString(arrChar2));
        System.out.println(Arrays.toString(arrInt));
        }
    }
*/