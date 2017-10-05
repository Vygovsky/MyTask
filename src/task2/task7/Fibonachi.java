package task2.task7;

import java.util.Arrays;

public class Fibonachi {
    public static void main(String[] args) {
        int[] array = new int[20];
        fibonachi(array);


    }

    public static void fibonachi(int[] i) {
        int sum = 0;
        for (int j = 3; j < i.length; j++) {
            sum = sum + i[j];
            System.out.println(sum);
        }
    }
}