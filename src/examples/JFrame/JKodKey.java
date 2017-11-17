package examples.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class JKodKey extends JFrame {
    public JKodKey() {
        super("Оперделение нажатой клавиши");
        JLabel label = new JLabel();
        label.setFont(new Font("Calibre", Font.PLAIN, 40));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setLayout(new BorderLayout());
        label.setFocusable(true);
        label.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                label.setText("Код клавиши " + e.getKeyCode());
            }
        });
        add(label);
        setBounds(100, 100, 400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        JKodKey lab = new JKodKey();
    }
}
