package examples.page8;

import javax.swing.*;
import java.awt.*;


public class MoveSquareFrame extends JFrame {
    public static final String UP = "UP";
    public static final String RIGHT = "RIGHT";
    public static final String LEFT = "LEFT";
    public static final String DOWN = "DOWN";


    public MoveSquareFrame() {
        SquareComponent sc = new SquareComponent();
        add(sc);
        JButton jbtUP = new JButton(UP);
        jbtUP.setActionCommand(UP);
        jbtUP.addActionListener(sc);
        add(jbtUP, BorderLayout.NORTH);

        JButton btnDown = new JButton(DOWN);
        btnDown.setActionCommand(DOWN);
        btnDown.addActionListener(sc);
        add(btnDown, BorderLayout.SOUTH);

        JButton btnLeft = new JButton(LEFT);
        btnLeft.setActionCommand(LEFT);
        btnLeft.addActionListener(sc);
        add(btnLeft, BorderLayout.WEST);

        JButton btnRight = new JButton(RIGHT);
        btnRight.setActionCommand(RIGHT);
        btnRight.addActionListener(sc);
        add(btnRight, BorderLayout.EAST);

        setBounds(100, 100, 400, 400);
    }
}
