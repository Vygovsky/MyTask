package examples.page8;

import javax.swing.*;
import java.awt.*;


public class MoveSquareFrame extends JFrame {
    public static final String UP = "UP";
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
        add(btnDown,BorderLayout.SOUTH);
        setBounds(100,100,450,400);
    }
}
