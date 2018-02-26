package task3;

/**
 * Created by Roman_v on 24.02.2018.
 */
public class AlternateSqSum {
    public static int[] alternateSqSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] *= arr[i];
                sum += arr[i];
            } else {
                sum += arr[i];
            }
        }
        System.out.println(sum);
        return new int[]{sum};
    }

    public static void main(String[] args) {
        AlternateSqSum.alternateSqSum(new int[]{11, 12, 13, 14, 15});

    }
}
