package examples.JFrame;

import javax.swing.*;
import java.awt.*;

public class Oval extends JComponent{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawOval(5 ,5,50,50);
    }
}