package dobroe.lesson2;

public class TwoMassiv {
    public static void main(String[] args) {
        int[][] array = new int[10][10];
        greatTwoMassiv(array);
    }

    public static void greatTwoMassiv(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = count++;
            }
        }
        for (int j = 0; j < array.length; j++) {
            for (int k = 0; k < array.length; k++) {
                System.out.print(array[j][k] + " ");
            }
            System.out.println();
        }
    }
}

