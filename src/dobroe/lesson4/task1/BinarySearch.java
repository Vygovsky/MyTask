package dobroe.lesson4.task1;


public class BinarySearch {
    public static int binarySearch(int[] data, int element) {
        int left = 0;
        int right = data.length;

        while (true)
        {
            int mid = left + (right - left) / 2;

            if (data[mid] == element)
                return mid;

            if (data[mid] > element)
                right = mid;
            else
                left = mid + 1;
        }
    }


    public static void main(String[] args) {
        int[] array = new int[]{-2, 3, 5, 8, 6, 12, 13};
        System.out.println(binarySearch(array, 6));
    }
}
/* for (int i = 0; i < data.length; i++) {

                if (element == data[i]) {
                    return i;
                }
            }
        return -1;*/