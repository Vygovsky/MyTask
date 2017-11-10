package examples.ArraysDemo;

import examples.page8.Robot;

import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] a = {1, 2, 56, 78, 34, 12, 89};
        char[][] graf={{'1', 'R', 'H', '&', '5', '@'}, {}, {'L', '0', 'I'}};
        for (char[] chars : graf) {
            for (char aChar : chars) {
                System.out.print(aChar);
            }
            System.out.println();
        }
    }

}


/*
        ПРИМЕР №1
int[]array=new int[10];
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i]);
            array[i]=10*(i+1);

        }
        System.out.println();
        for (int i = 0; i <array.length ; i++) {
            System.out.println(array[i]);
        }*/


/*      ПРИМЕР №2
int[] sample = {12, 56, 7, 34, 89, 43, 23, 9};
        int sum=0;

        for (int i = 0; i <sample.length ; i++) {
            sum+=sample[i];
        }
        System.out.println(sum);*/

/*     ПРИМЕР №3 Сортировка пузырьком
int[] sample = {12, 56, 7, 34, 89, 43, 23, 9};
        boolean change = true;
        while (change) {
            change = false;
            for (int i = 0; i < sample.length - 1; i++) {
                if (sample[i] > sample[i + 1]) {
                    int temp = sample[i];
                    sample[i] = sample[i + 1];
                    sample[i + 1] = temp;
                    change = true;
                }
            }
        }
        for (int i = 0; i < sample.length; i++) {
            System.out.print(sample[i]+"; ");
        }*/

/*      ПРИМЕР №4
int[] sample = new int[5];
        System.out.println("Before foreach");
        for (int i : sample) {
            System.out.println(i);
        }
        for (int i = 0; i <sample.length ; i++) {
            sample[i]=99;
        }


        System.out.println("After");
        for (int i : sample) {
            System.out.println(i);

        }
*/

/*       ПРИМЕР№5
int size = 10;
        char[][] a = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || i == size - 1 || j == 0 || j == size - 1) {
                    a[i][j] = '#';
                }else {
                    a[i][j]=' ';
                }
            }
        }
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }*/

/*       ПРИМЕР№5
int SIZE = 5;
        char[][] graf = new char[SIZE][];
        for (int i = 0; i < graf.length; i++) {
            System.out.println(graf[i] == null);

            //     for (int i = 0; i < graf.length; i++) {
            int size = (int) Math.round(Math.random() * 50) + 25;
            graf[i] = new char[size];
        }
        for (int i = 0; i <graf.length ; i++) {
            System.out.println(graf[i].length);
        }*/
