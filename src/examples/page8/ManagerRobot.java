package examples.page8;

import javax.swing.*;

public class ManagerRobot {
    public static void main(String[] args) {
       /* RobotExt robot = new RobotExt(0, 0, 0);

        Robot robot1 = new RobotTotal(0, 0);


        robot1.forward(20);
        robot1.setCourse(90);
        robot1.forward(45);
        robot1.setCourse(50);
        robot1.forward(10);
        robot1.getCoordinate();

        robot.moveBack(10);
        robot.getCoordinate();*/
        final int COUNT = 10;
        final int SIDE = 100;
        Robot robot=new Robot(200,50);
        for (int i = 0; i <COUNT ; i++) {
            robot.forward(SIDE);
            robot.setCourse(robot.getCourse()+360/COUNT);
            RobotFrame rf=new RobotFrame(robot);
            rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            rf.setVisible(true);
        }
    }
}
