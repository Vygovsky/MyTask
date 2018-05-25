package sapper;

/**
 * Created by Roman_v on 23.05.2018.
 */
class Flag {
    private Matrix flagMap;

    void start() {
        flagMap = new Matrix(Box.CLOSED);
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
    }

    void setFlagedToBox(Coord coord) {
        flagMap.set(coord, Box.FLAGED);
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
    }
}
