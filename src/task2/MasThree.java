package task2;

public class MasThree {
    public static void main(String[] args) {
        int[] array3 = new int[15];
        int countOfOddElement = 0;
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (int) Math.round(Math.random() * 9);
            System.out.print(array3[i] + " ");
            if (array3[i] % 2 != 0) {
                countOfOddElement++;
            }
        }
        System.out.print("\nCount of odd elements: " + countOfOddElement);
    }
}
