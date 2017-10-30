package examples.page8;

public class ManagerRobot {
    public static void main(String[] args) {
        Robot robot = new Robot();
        ManagerRobot mr = new ManagerRobot();

        robot.setCourse(90);
        robot.forward(20);
        System.out.println(robot.getCourse());

        robot.setCourse(45);
        robot.forward(20);
        System.out.println(robot.getCourse());

       /* mr.changeCourse(robot);
        robot.getCoordinate(robot.getCourse());
*/
    }

    public void changeCourse(Robot robot) {
        robot.setCourse(180);
    }
}
