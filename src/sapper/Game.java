package sapper;

public class Game {
    private Bomb bomb;
    private Flag flag;
    private GameState state;


    public Game(int x, int y, int bombs) {
        Ranges.setSize(new Coord(x, y));
        bomb = new Bomb(bombs);
        flag = new Flag();
    }

    public void start() {
        bomb.start();
        flag.start();
        state = GameState.PLAYED;
    }

    Box getBox(Coord coord) {
        if (Box.OPENED == flag.get(coord)) {
            return bomb.get(coord);
        } else {
            return flag.get(coord);
        }
    }

    public void pressLeftButton(Coord coord) {
        flag.setOpenToBox(coord);
        state=GameState.BOMBER;
    }

    public void pressRightButton(Coord coord) {
        flag.toggleFlagedToBox(coord);
        state=GameState.WINNER;
    }

    public GameState getState() {
        return state;
    }
}
