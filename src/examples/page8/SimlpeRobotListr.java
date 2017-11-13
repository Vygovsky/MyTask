package examples.page8;

public class SimlpeRobotListr implements RobotListener {
    @Override
    public void moveStart(double x, double y) {
        System.out.println("Робот начал движение " + x + "," + y);
    }

    @Override
    public void moveEnd(double x, double y) {
        System.out.println("Робот закончил движение " + x + "," + y);
    }
}
