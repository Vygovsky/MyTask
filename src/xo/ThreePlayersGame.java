package xo;

/**
 * Created by Roman_v on 26.02.2018.
 */
public class ThreePlayersGame extends TwoPlayersGame {
    private String threePlayer;

    public ThreePlayersGame(String onePlayer, String twoPlayer, String threePlayer) {
        super(onePlayer, twoPlayer);
        this.threePlayer = threePlayer;
    }
    public void printThreePlayersGame(){
        System.out.println(threePlayer);
    }
}
