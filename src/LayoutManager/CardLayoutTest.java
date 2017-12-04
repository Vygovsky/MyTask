package LayoutManager;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Roman_v on 04.12.2017.
 */
public class CardLayoutTest extends JFrame implements ActionListener {
    JPanel panel = new JPanel();
    JButton first = new JButton("First");
    JButton last = new JButton("Last");
    JButton next = new JButton("Next");
    JButton prev = new JButton("Prev");
    JButton show = new JButton("Show");


    public CardLayoutTest() {
        panel.setLayout(new CardLayout(10, 10));
        for (int i = 0; i < 12; i++) {
            panel.add(" " + i, new JLabel(" " + i, JLabel.CENTER));
        }
        JPanel button = new JPanel();
        button.setLayout(new FlowLayout(FlowLayout.CENTER));
        button.add(first);
        first.addActionListener(this);
        button.add(last);
        last.addActionListener(this);
        button.add(next);
        last.addActionListener(this);
        button.add(prev);
        last.addActionListener(this);
        button.add(show);
        last.addActionListener(this);

        getContentPane().add("Center", panel);
        getContentPane().add("South", button);
    }

    public static void main(String[] args) {
        CardLayoutTest clt = new CardLayoutTest();
        clt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clt.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == first) {
            ((CardLayout) panel.getLayout()).first(panel);
        }
        if (e.getSource() == last) {
            ((CardLayout) panel.getLayout()).last(panel);
        }
        if (e.getSource() == next) {
            ((CardLayout) panel.getLayout()).next(panel);
        }
        if (e.getSource() == prev) {
            ((CardLayout) panel.getLayout()).previous(panel);
        }
        if (e.getSource() == show) {
            String answer = JOptionPane.showInputDialog("Input number: 0-11");
            if (answer != null) {
                ((CardLayout) panel.getLayout()).show(panel, answer);
            }
        }
    }
}
