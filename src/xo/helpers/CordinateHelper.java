package xo.helpers;

public class CordinateHelper {
    private static int min_coordinat = 0;
    private static int max_coordinat = 2;

    public static boolean checkCoodinat(int coordinat) {
        if (coordinat < min_coordinat || coordinat > max_coordinat) return false;
        return true;
    }
}

