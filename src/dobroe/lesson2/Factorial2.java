package dobroe.lesson2;


public class Factorial2 {
    public static void main(String[] args) {
        System.out.println(findFactorial(-3));
    }

    public static int findFactorial(int number) {
        int resultFactorial = 0;
        if (number < 0) {
            negativeFactorial(number);
        } else {
            for (int i = 2; i <= number; i++) {
                resultFactorial *= i;
            }
        }
        return resultFactorial;
    }

    public static void negativeFactorial(int number) {
        if (number < 0) {
            System.out.println("Ошибка! number не может быть < 0");
        }
    }
}