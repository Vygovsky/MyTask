package sapper;

public class Bomb {
    private Matrix bombMap;
    private int totalBombs;

    public Bomb(int totalBombs) {
        this.totalBombs = totalBombs;
        fixNumberBombs();
    }

    public void start() {
        bombMap = new Matrix(Box.ZERO);
        for (int i = 0; i < totalBombs; i++) {
            placeBomb();
        }
    }

    public int getTotalBombs() {
        return totalBombs;
    }

    Box get(Coord coord) {
        return bombMap.get(coord);
    }

    private void placeBomb() {
        while (true) {
            Coord coord = Ranges.getRandomCoords();
            if (Box.BOMB == bombMap.get(coord))
                continue;
            bombMap.set(coord, Box.BOMB);
            incNumdersAroundBomb(coord);
            break;
        }
    }

    private void fixNumberBombs() {
        int numberBombs = Ranges.getSize().x * Ranges.getSize().y / 2;
        if (totalBombs > numberBombs) {
            totalBombs = numberBombs;
        }
    }

    private void incNumdersAroundBomb(Coord coord) {
        for (Coord around : Ranges.getCoordsAround(coord))
            if (Box.BOMB != bombMap.get(around))
                bombMap.set(around, bombMap.get(around).getNumberBox());
    }
}
