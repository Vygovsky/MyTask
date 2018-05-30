package Array;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] array = {9, 3, -2, 6};
        System.out.println(Arrays.toString(serchArray(array)));

    }

    private static int[] serchArray(int[] array) {
        int countPlus = 0;
        int countMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPlus++;
            } else {
                countMin += array[i];
            }
        }
        int[] input = new int[]{countPlus, countMin};
        return input;
    }

}
