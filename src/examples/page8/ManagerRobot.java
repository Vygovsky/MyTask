package examples.page8;

public class ManagerRobot {
    public static void main(String[] args) {
        RobotExt robot = new RobotExt(0,0,0);




        robot.forward(20);
        robot.getCoordinate();

        robot.setCourse(90);
        robot.forward(20);
        robot.getCoordinate();

        robot.setCourse(45);
        robot.forward(20);
        robot.getCoordinate();

        robot.moveBack(10);
        robot.getCoordinate();


    }

}
