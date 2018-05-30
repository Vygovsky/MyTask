package Array;

import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] array = {2, 9, 6, 7, 9, -90, -30, 60, -81};
        System.out.println(Arrays.toString(serchArray(array)));

    }

    public static int[] serchArray(int[] array) {
        int countPlus = 0;
        int countMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                countPlus++;
            } else {
                countMin += array[i];
            }
        }
        int[] input = new int[2];
        input[0] = countPlus;
        input[1] = countMin;
        return input;
    }

}
