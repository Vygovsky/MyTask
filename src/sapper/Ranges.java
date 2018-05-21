package sapper;

import java.util.ArrayList;

public class Ranges {
    private static Coord size;
    private static ArrayList<Coord> coords;


    public static void setSize(Coord size) {
        Ranges.size = size;
        coords = new ArrayList<>();
        for (int x = 0; x < size.x; x++) {
            for (int y = 0; y < size.y; y++) {
                coords.add(new Coord(x, y));
            }
        }
    }

    public static Coord getSize() {
        return size;
    }


    public static ArrayList<Coord> getCoords() {
        return coords;
    }
}
