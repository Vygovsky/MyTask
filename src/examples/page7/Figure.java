package examples.page7;

/**
 * Created by Roman_v on 26.10.2017.
 */
public class Figure {
    public static void main(String[] args) {
        int count = 11;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j <count; j++) {
                if ( j==count-1||i == (count - j) - 1 || i == count - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
    /*int count = 10;
        for (int i = 0; i < count; i++) {
        for (int j = 0; j < count; j++) {
        if (j == 0 || j == count-1||i==0||i==count-1) {
        System.out.print("*");
        } else {
        System.out.print(" ");
        }

        }
        System.out.println();*/

    /*  int count = 11;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (j == 0 || j == count-1||j==i||i==(count-j)-1||i==0||i==count-1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();*/

    /*int count = 11;
        for (int i = 0; i < count; i++) {
        for (int j = 0; j < count; j++) {
        if ( j == i || i == (count - j) - 1 || i == 0 || i == count - 1) {
        System.out.print("*");
        } else {
        System.out.print(" ");
        }
        }
        System.out.println();
        }*/