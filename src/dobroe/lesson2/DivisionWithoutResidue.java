package dobroe.lesson2;

import java.util.Random;

public class DivisionWithoutResidue {
    public static void main(String[] args) {
        System.out.println(countDivisionWithoutResidue(new int[10]));

    }

    public static int countDivisionWithoutResidue(int[] array) {
        int result = 0;
        Random random=new Random();
        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(50);
            if (array[i] % 2 == 0) {
                result +=array[i];
            }
        }
        return result;
    }
}
