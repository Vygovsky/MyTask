package examples.page7;

/**
 * Created by Roman_v on 26.10.2017.
 */
public class Figure {
    public static void main(String[] args) {
        int count = 12;
        int count2 = 10;
        for (int i = 0; i < count2 + 1; i++) {
            for (int j = 1; j < count; j++) {
                if (j == count / 2 - i || j == count / 2 + i || i == (count2 - 1) / 2 + j || j == count2 / 2 + (count2 + 1) - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();


        int count6=6;
         for (int i = 0; i < count6 + 1; i++) {
            for (int j = 1; j < count; j++) {
                if (j == count / 2 - i || j == count / 2 + i || i == count2-i ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
             System.out.println();

        }


        int count3 = 10;
        for (int i = 0; i < count3; i++) {
            for (int j = 0; j < count3; j++) {
                if (j == 0 || j == count3 - 1 || i == 0 || i == count3 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        int count4 = 11;
        for (int i = 0; i < count4; i++) {
            for (int j = 0; j < count4; j++) {
                if (j == 0 || j == count4 - 1 || j == i || i == (count4 - j) - 1 || i == 0 || i == count4 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

        int count5 = 11;
        for (int i = 0; i < count5; i++) {
            for (int j = 0; j < count5; j++) {
                if (j == i || i == (count5 - j) - 1 || i == 0 || i == count5 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        }
    }
