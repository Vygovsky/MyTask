package LayoutManager;

import javax.swing.*;

public class DiagLayoutTest extends JFrame {
    public DiagLayoutTest() {
        getContentPane().setLayout(new DiagLayout());
        for (int i = 0; i < 5; i++) {
            getContentPane().add(new JButton(" " + i));
        }
        for (int i = 0; i < 5; i++) {
            getContentPane().add(new JLabel(" " + i, JLabel.CENTER));
        }
        setBounds(100, 100, 400, 300);
    }

    public static void main(String[] args) {
        DiagLayoutTest dlt = new DiagLayoutTest();
        dlt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dlt.setVisible(true);
    }
}
