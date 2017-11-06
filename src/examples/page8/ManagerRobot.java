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
      /*  final int COUNT = 10;
        final int SIDE = 120;*/
      int COUNT =3;
      final int STEP = 30;
        final int SiDE = 400;
        int current=20;



        Robot robot = new Robot(200, 200);
        for (int i = 0; i < current; i++){
            robot.forward(SiDE-i*10);
            robot.setCourse(robot.getCourse()+300/COUNT);
        }

      /*  for (int i = 0; i < COUNT; i++) {
            robot.setCourse(robot.getCourse() + 360 / (COUNT / 2));
            robot.forward(SIDE);
            robot.setCourse(robot.getCourse() + 180 - 360 / COUNT);
*/
            RobotFrame rf = new RobotFrame(robot);
            rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            rf.setVisible(true);
        }

    }

/* final int STEP = 30;
        final int SiDE = 450;
        int current = SiDE;*/
 /*robot.forward(current);
         robot.setCourse(robot.getCourse()+90);
         while (current > 0) {
         robot.forward(current);
         robot.setCourse(robot.getCourse()+90);
         robot.forward(current);
         robot.setCourse(robot.getCourse()+90);
         current-=STEP;

         }
         RobotFrame rf=new RobotFrame(robot);
         rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         rf.setVisible(true);
*/