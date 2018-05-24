package sapper;

/**
 * Created by Roman_v on 23.05.2018.
 */
public class Flag {
    private Matrix flagMap;

    void start() {
        flagMap = new Matrix(Box.CLOSED);
        Coord coord = new Coord(5, 6);

    }

    Box get(Coord coord) {
        return flagMap.get(coord);
    }

    public void setOpenToBox(Coord coord) {
        flagMap.set(coord, Box.OPENED);
    }

    public void setFlagedToBox(Coord coord) {
        flagMap.set(coord, Box.FLAGED);
    }
}
