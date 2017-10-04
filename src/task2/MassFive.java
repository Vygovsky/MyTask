package task2;

public class MassFive {
    public static void main(String[] args) {
        int[] array5 = new int[4];
        for (int i = 0; i < array5.length; i++) {
            array5[i] = (int) Math.round(Math.random() * 90)+10;
            System.out.println(array5[i]+" ");
        }
    }
}