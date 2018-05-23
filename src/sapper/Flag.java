package sapper;

/**
 * Created by Roman_v on 23.05.2018.
 */
public class Flag {
    private Matrix flagMap;

    void start() {
        flagMap = new Matrix(Box.CLOSED);
        Coord coord = new Coord(5, 5);
        flagMap.set(coord,Box.OPENED);
        for (Coord around : Ranges.getCoordsAround(coord)) {
            flagMap.set(around, Box.OPENED);
        }
    }


    Box get(Coord coord) {
        return flagMap.get(coord);
    }
}
