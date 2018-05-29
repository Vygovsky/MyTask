package sapper;

/**
 * Created by Roman_v on 23.05.2018.
 */
class Flag {
    private Matrix flagMap;
    private int totalFlaged;
    private int totalClosed;

    void start() {
        flagMap = new Matrix(Box.CLOSED);
        totalFlaged = 0;
        totalClosed = Ranges.getSquare();
      /*  Coord coord = new Coord(5, 5);       //open Box at Matrix
        flagMap.set(coord, Box.OPENED);
        for (Coord around : Ranges.getCoordsAround(coord)) {
            flagMap.set(around, Box.OPENED);
        }*/
    }


    Box get(Coord coord) {
        return flagMap.get(coord);
    }

    void setOpenedToBox(Coord coord) {
        flagMap.set(coord, Box.OPENED);
        totalClosed--;
    }

    void toggleFlagedToBox(Coord coord) {

        switch (flagMap.get(coord)) {
            case FLAGED:
                setCloseToBox(coord);
                break;
            case CLOSED:
                setFlagedToBox(coord);
                break;
        }
    }

    private void setCloseToBox(Coord coord) {
        flagMap.set(coord, Box.CLOSED);
        totalFlaged--;
    }

    private void setFlagedToBox(Coord coord) {
        flagMap.set(coord, Box.FLAGED);
        totalFlaged++;
    }

    public int getTotalFlaged() {
        return totalFlaged;
    }

    public int getTotalClosed() {
        return totalClosed;
    }

    public void setFlagetToLastClosedBox() {
        for (Coord coord : Ranges.getAllCoords()) {
            if (Box.CLOSED == flagMap.get(coord)) {
                setFlagedToBox(coord);
            }
        }
    }

    public void setBombedToBox(Coord coord) {
        flagMap.set(coord, Box.BOMBED);
    }

    void setOpenedToCosedBox(Coord coord) {
        if (Box.CLOSED == flagMap.get(coord)) {
            flagMap.set(coord, Box.OPENED);
        }
    }

    void setNobombsToFlaggedBox(Coord coord) {
        if (Box.FLAGED == flagMap.get(coord)) {
            flagMap.set(coord, Box.NOBOMB);
        }
    }

     int getCountFlaggetBoxAruond(Coord coord) {
        int count = 0;
        for (Coord around : Ranges.getCoordsAround(coord))
            if (flagMap.get(around) == Box.FLAGED) {
                count++;
            }
        return count;
    }
}
