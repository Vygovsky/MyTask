package dobroe.lesson4.task1;


public class BinarySearch {
    public static int binarySearch(int[] data, int element) {
        int left = 0;
        int right = data.length;
        int mid = left + (right - left) / 2;
        while (data[mid] != element) {
            // return mid;
            if (data[mid] > element) {
                right = mid - 1;
            } else
                left = mid + 1;
            mid = (left + right) / 2;
        }
        if (left <= right) {
            return mid;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] array = new int[]{-2, 3, 5, 8, 9, 12, 13};
        System.out.println(binarySearch(array, 1));
    }
}
