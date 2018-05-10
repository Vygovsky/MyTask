package xo.model;

import java.util.Arrays;

public class Board {
    final static String NAME_GAME = "X and Zero";
    private final int SIZE_FIELD = 3;
    private Figure[][] figure;

    public Figure[][] getFigure() {
        return figure;
    }

    public Board(Figure[][] figure) {
        this.figure = new Figure[SIZE_FIELD][SIZE_FIELD];
    }

    public void printFigure() {
        System.out.println(Arrays.deepToString(figure));
    }

    public int getFigure(int x, int y) {
        return 0;
    }
}