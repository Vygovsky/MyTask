package examples.page8;

public class ManagerRobot {
    public static void main(String[] args) {
      RobotExt robot = new RobotExt(0,0,0);

      Robot robot1=new RobotTotal(0,0);


      robot1.forward(20);
      robot1.setCourse(90);
      robot1.forward(45);
      robot1.setCourse(50);
      robot1.forward(10);
      robot1.getCoordinate();


        /*robot.forward(20);
        robot.getCoordinate();

        robot.setCourse(90);
        robot.forward(20);
        robot.getCoordinate();

        robot.setCourse(45);
        robot.forward(20);
        robot.getCoordinate();

        robot.moveBack(10);
        robot.getCoordinate();*/
    }
}
