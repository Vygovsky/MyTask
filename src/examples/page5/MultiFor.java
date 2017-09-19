package examples.page5;

public class MultiFor {
    public static void main(String[] args) {


        for (int x = 0; x < 4; x++) {
            for (int i = 4; i > 2; i--) {
                System.out.println(x + " " + i);
            }
            if (x == 1) {
                x++;
            }
        }
    }
}
