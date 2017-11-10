package examples.JFrame;

import examples.page8.AbstractShape;

import javax.swing.*;
import java.awt.*;

public class Oval extends AbstractShape {
    @Override
    protected void paintShape(Graphics g) {
        g.drawOval(5, 5, 50, 50);
    }
}
