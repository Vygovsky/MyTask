package sapper;

public class Game {
    private Bomb bomb;
    private Flag flag;


    public Game(int x, int y, int bombs) {
        Ranges.setSize(new Coord(x, y));
        bomb = new Bomb(bombs);
        flag = new Flag();
    }

    public void start() {
        bomb.start();
        flag.start();
    }

    Box getBox(Coord coord) {
        if (Box.OPENED == flag.get(coord)) {
            return bomb.get(coord);
        } else {
            return flag.get(coord);
        }
    }

    void pressLeftButton(Coord coord) {
        flag.setOpenToBox(coord);
    }

    public void pressRightButton(Coord coord) {
        flag.setFlagedToBox(coord);
    }
}
