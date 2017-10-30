package examples.page8;

public class RobotExt extends Robot {

    public RobotExt(double x, double y, double course) {
        super(x, y);
        this.course = course;
    }

    public void moveBack(int distance) {
        forward(-distance);
    }
}
