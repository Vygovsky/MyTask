package sapper;

public class Bomb {
    private Matrix bombMap;
    private int totalBombs;

    private Bomb(int totalBombs) {
        this.totalBombs = totalBombs;
    }

    public void start() {
        bombMap = new Matrix(Box.ZERO);
        for (int i = 0; i <totalBombs ; i++) {
            placeBomb();
        }

    }

    Box get(Coord coord) {
        return bombMap.get(coord);
    }

    private void placeBomb() {
        bombMap.set(Ranges.getRandomCoords(), Box.BOMB);

    }
}
