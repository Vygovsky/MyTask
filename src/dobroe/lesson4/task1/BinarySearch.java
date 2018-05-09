package dobroe.lesson4.task1;


public class BinarySearch {
    public static int binarySearch(int[] data, int element) {
        int startArray = 0;
        int finishArray = data.length - 1;
        int position = (startArray + finishArray) / 2;

        while (data[position] != element) {
            data[position] = element;
            if (data[position] > element) {
                startArray = position + 1;
            } else {
                finishArray = position - 1;
            }
            position = (startArray + finishArray) / 2;
        }
       /* if (center == element) {
            data[element] = center;
            return element;
        }*/


        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{-2, 3, 5, 8, 6, 12, 13};
        System.out.println(binarySearch(array, 5));
    }
}
/* for (int i = 0; i < data.length; i++) {

                if (element == data[i]) {
                    return i;
                }
            }
        return -1;*/