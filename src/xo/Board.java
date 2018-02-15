package xo;

/**
 * Created by Roman_v on 15.02.2018.
 */
public class Board {
    final static String NAME_GAME = "Krestiki and Zero";
    private Figure figure10 = new Figure(" ");
    private Figure figure11 = new Figure(" ");
    private Figure figure12 = new Figure(" ");
    private Figure figure20 = new Figure(" ");
    private Figure figure21 = new Figure(" ");
    private Figure figure22 = new Figure(" ");
    private Figure figure30 = new Figure(" ");
    private Figure figure31 = new Figure(" ");
    private Figure figure32 = new Figure(" ");

   /* public static void printGameName() {
        System.out.println(Board.NAME_GAME);
    }*/

    public void printBoard() {
        System.out.printf("Game : %s\n", NAME_GAME);
        System.out.printf("%s|%s|%s\n", figure10.getO(), figure11.getO(), figure12.getO());
        System.out.println("--------");
        System.out.printf("%s|%s|%s\n", figure20.getO(), figure21.getO(), figure22.getO());
        System.out.println("--------");
        System.out.printf("%s|%s|%s", figure30.getO(), figure31.getO(), figure32.getO());
    }

}
