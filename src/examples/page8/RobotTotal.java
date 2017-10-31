package examples.page8;

public class RobotTotal extends Robot {
    private double totalDistance;

    public RobotTotal(double x, double y) {
        super(x, y);

    }

    @Override
    public void forward(int distance) {
        super.forward(distance);
        totalDistance += distance;
        System.out.println("TotalRobot");
    }

    public double getTotalDistance() {
        return totalDistance;
    }
}
