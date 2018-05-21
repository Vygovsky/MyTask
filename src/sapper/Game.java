package sapper;

public class Game {
    public Game(int x, int y) {
        Ranges.setSize(new Coord(x, y));
    }


    public Box getBox(Coord coord) {
        return Box.values()[(coord.x + coord.y) % Box.values().length];
    }
}
