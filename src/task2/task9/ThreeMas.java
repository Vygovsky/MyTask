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

class ThreeMasSecondImplementation {
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
