package examples.JFrame;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(5,5,100,100);
    }
}
