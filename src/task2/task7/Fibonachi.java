package task2.task7;

import java.util.Arrays;

public class Fibonachi {
    public static void main(String[] args) {
        int[] array = new int[20];
        fibonachi(array);

    }

    public static void fibonachi(int[] array) {
        int sum;
        int a = 1;
        int b = 0;
        for (int j = 0; j < array.length; j++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println(sum + " ");
        }
    }
}