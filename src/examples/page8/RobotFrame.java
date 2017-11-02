package examples.page8;

import javax.swing.*;

/**
 * Created by Roman_v on 02.11.2017.
 */
public class RobotFrame extends JFrame {
    public RobotFrame(Robot robot){
        setTitle("Robot Frame");
        add(new RobotPathComponent(robot));
        setBounds(100,100,500,500);
    }
}
