package examples.JFrame;

import examples.page8.AbstractShape;

import javax.swing.*;
import java.awt.*;

public class Triangle extends AbstractShape {
    @Override
    protected void paintShape(Graphics g) {
        g.drawLine(5, getHeight() - 10, getWidth() / 2 - 5, 5);
        g.drawLine(getWidth() / 2 - 5, 5, getWidth() - 10, getHeight() - 5);
        g.drawLine(getWidth() - 10, getHeight() - 10, 5, getHeight() - 10);
    }
}
