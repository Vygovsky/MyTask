package task5;

/**
 * Created by Roman_v on 04.12.2017.
 */
public class Robot {
    private Move mMove;

    public Robot(Move move) {
        mMove = move;
    }
    public void doMOve(){
        mMove.action();
    }
}
