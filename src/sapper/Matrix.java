package sapper;

public class Matrix {
    private Box[][] matrix;

    public Matrix(Box box) {
        matrix = new Box[Ranges.getSize().x][Ranges.getSize().y];
        for (Coord coord : Ranges.getAllCoords()) {
            matrix[coord.x][coord.y] = box;
        }
    }

    public Box get(Coord coord) {
        if (Ranges.isRanges(coord))
            return matrix[coord.x][coord.y];
        return null;
    }

    void set(Coord coord, Box box) {
        if (Ranges.isRanges(coord))
            matrix[coord.x][coord.y] = box;
    }
}
