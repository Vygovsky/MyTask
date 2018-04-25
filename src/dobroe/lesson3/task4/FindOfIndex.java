package dobroe.lesson3.task4;

import java.util.Arrays;

public class FindOfIndex {
    public static void main(String[] args) {
        int maxNumb = 0;
        int[] array = new int[]{5, 3, 7, 3, 1, 9, 2, 9, 0, 4, 9};
        for (int i = 0; i < array.length; i++) {
            if (maxNumb < array[i])
                maxNumb = array[i];
        }
        int[] inputIndex = new int[maxNumb + 1];
        for (int i = 0; i < array.length; i++) {
            inputIndex[array[i]]++;
        }
        System.out.println("Input index = "+ Arrays.toString(inputIndex));
    }
}
