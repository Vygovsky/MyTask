package habr;

import java.util.Arrays;

/**
 * Created by Roman_v on 01.03.2018.
 */
public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{-2, 5, 15, 60, 3, 0, 8};
        System.out.println(Arrays.toString(arr) + "-->");
        // bublSort(arr);
        bublSortInvert(arr);
   /* private static void bublSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j <arr.length-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));*/
    }

    private static void bublSortInvert(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int tmp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}

