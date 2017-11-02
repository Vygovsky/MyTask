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
        for (RobotLine r1 : robot.getLine()) {
            int x1 = (int) Math.round(r1.getX1());
            int y1 = (int) Math.round(r1.getY1());
            int x2 = (int) Math.round(r1.getX2());
            int y2 = (int) Math.round(r1.getY2());
            g.drawLine(x1, y1, x2, y2);


        }
    }
}
