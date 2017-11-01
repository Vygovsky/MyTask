package examples.page8;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Roman_v on 01.11.2017.
 */
public class RobotPathComponent extends JComponent {
    private Robot robot;

    public RobotPathComponent(Robot robot) {
        this.robot = robot;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (RobotLine r1 : robot.line) {


        }
    }
}
