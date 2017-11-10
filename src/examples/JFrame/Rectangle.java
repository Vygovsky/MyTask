package examples.JFrame;

import examples.page8.AbstractShape;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends AbstractShape {
    @Override
    protected void paintShape(Graphics g) {
        g.drawRect(5, 5, 100, 100);
    }
}
