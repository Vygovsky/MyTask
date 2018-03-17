package dobroe.lesson2;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    public static int factorial(int number) {
        int result = 0;
        if (number == 1)
            return 1;
            result = factorial(number - 1) * number;


        return result;
    }
}
