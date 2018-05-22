package sapper;

public class Game {
    Bomb bomb;

    public Game(int x, int y, int bombs) {
        Ranges.setSize(new Coord(x, y));
        bomb = new Bomb(bombs);
    }

    public void start() {
        bomb.start();
    }

    Box getBox(Coord coord) {
        return bomb.get(coord);
    }
}
