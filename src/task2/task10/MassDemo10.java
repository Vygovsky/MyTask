package task2.task10;

import java.util.Random;

/**
 * Created by Roman_v on 07.10.2017.
 */
public class MassDemo10 {
    public static void main(String[] args) {
        int[] array=new int[11];
        Random random=new Random();
        for (int i = 0; i <array.length ; i++) {
            array[i]=random.nextInt(3)-1;
            System.out.print(array[i]+" ");
        }
        for (int i = 0; i <array.length ; i++) {

        }
    }
}

