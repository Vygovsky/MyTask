package xo.model;

/**
 * Created by Roman_v on 28.02.2018.
 */
public class Player {
    private String name;
    private String figure;


    public Player(String name, String figure) {
        this.name = name;
        this.figure=figure;
    }

    public String getName() {
        return name;
    }

    public String getFigure() {
        return figure;
    }
}
