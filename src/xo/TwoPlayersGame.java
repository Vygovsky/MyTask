package xo;

/**
 * Created by Roman_v on 15.02.2018.
 */
public class TwoPlayersGame {
    private String onePlayer;
    private String twoPlayer;

    public TwoPlayersGame(String onePlayer, String twoPlayer) {
        this.onePlayer = onePlayer;
        this.twoPlayer = twoPlayer;
    }
    public void printOnePlayerName(){
        System.out.println(onePlayer);
    }
    public void printTwoPlayerName(){
        System.out.println(twoPlayer);
    }
}
