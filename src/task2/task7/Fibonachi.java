package task2.task7;

import java.util.Arrays;

public class Fibonachi {
    public static void main(String[] args) {
        int[] array = new int[20];


    }

    static int fibonachi(int[] i) {
        for (int j = 0; j < i.length; j++) {
            if (j == 1) {
                return 1;
            }
            if (j == 2) {
                return 1;
            } else {


            }
        }
        return fibonachi(j - 1) + fibonachi(j - 2);
    }
}