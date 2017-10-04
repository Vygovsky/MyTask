package task2;

import java.util.Random;

public class MassTwo {
    public static void main(String[] args) {
        int[] array2 = new int[15];
        int index = 0;
       for (int i = 0; i < array2.length; i++) {
/*            array2[i] = (int) Math.round(Math.random() * 9);
            System.out.print(array2[i] + " ");

            if (array2[i] > 0 & array2[i] % 2 == 0) {
                index++;
            }
            System.out.println(" ");
            System.out.println("Summa chetnih chisel: " );
        }*/
         Random ram = new Random();
           array2[i] = ram.nextInt(9);
           System.out.print(array2[i] + " ");
           if (array2[i] % 2 == 0)
               index++;
           }
           System.out.println(" ");
           System.out.println("Всего в массиве "+index+" четнных чисел!");
       }
    }

