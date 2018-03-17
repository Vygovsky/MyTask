package dobroe.lesson2;

public class SumPositiveNumber {
    public static void main(String[] args) {
        System.out.println(countPositiveNumbersSum(new int[]{-2, 83, 5}));

    }

    public static int countPositiveNumbersSum(int[] number) {
        int sumPositiveNumbers = 0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] > 0) sumPositiveNumbers += number[i];
        }
        return sumPositiveNumbers;
    }

}

