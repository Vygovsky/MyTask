package examples.page8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SquareComponent extends JComponent implements ActionListener {
    private static final int SQUARE_SIZE = 30;
    private static final int STEP = 10;
    private int x = 10;
    private int y = 10;

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton jbt = (JButton) e.getSource();
            if (MoveSquareFrame.UP.equals(jbt.getActionCommand())) {
            y-=STEP;
            }
            if(MoveSquareFrame.DOWN.equals(jbt.getActionCommand())){
                y+=STEP;
            }
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(x,y,SQUARE_SIZE,SQUARE_SIZE);
    }
}
