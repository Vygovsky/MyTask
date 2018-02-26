package xo;

/**
 * Created by Roman_v on 15.02.2018.
 */
public class Test {
    public static void main(String[] args) {
        Game game=new Game();
        game.printGame();
        TwoPlayersGame game1=new TwoPlayersGame("Roman","Max");
        game1.printOnePlayerName();
        game1.printTwoPlayerName();
        game1.printGame();

        ThreePlayersGame game2=new ThreePlayersGame("Roman","Max","Mike");

        game2.printOnePlayerName();
        game2.printTwoPlayerName();
        game2.printThreePlayersGame();
        game2.printGame();


    }

    private static void printGameAndBoard(Board board,Game game) {

        game.printGame();
        board.printBoard();
    }
}
