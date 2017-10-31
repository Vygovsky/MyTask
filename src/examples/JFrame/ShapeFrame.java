package examples.JFrame;

import javax.swing.*;
import java.awt.*;


public class ShapeFrame extends JFrame {
    public ShapeFrame() {
        setLayout(new GridLayout(2,3));
        add(new Oval());
        add(new Rectangle());
        add(new Triangle());
        add(new Oval());
        add(new Rectangle());
        add(new Triangle());
        setBounds(200, 200, 450, 350);
    }
}
