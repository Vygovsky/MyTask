package JFrame.task3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window2 extends JFrame {
    private JTextField text1;
    private JTextField text2;
    private JTextField text3;
    private JPasswordField jPasswordField;

    public Window2() {
        super("Window_2");
        setLayout(new FlowLayout());
        text1 = new JTextField(10);
        add(text1);
        text2 = new JTextField("Field write");
        add(text2);
        text3 = new JTextField("Neredaktiruemoe pole", 20);
        text3.setEditable(false);
        add(text3);
        jPasswordField = new JPasswordField("My Password");
        add(jPasswordField);
        Obrabotchik obrabotka = new Obrabotchik();
        text1.addActionListener(obrabotka);
        text2.addActionListener(obrabotka);
        text3.addActionListener(obrabotka);
        jPasswordField.addActionListener(obrabotka);
    }

    private class Obrabotchik implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String s = "";
            if (e.getSource() == text1) {
                s = String.format("Text 1 : %s", e.getActionCommand());
            } else if (e.getSource() == text2) {
                s = String.format("Text 2 : %s", e.getActionCommand());
            } else if (e.getSource() == text3) {
                s = String.format("Text 3 : %s", e.getActionCommand());
            } else if (e.getSource() == jPasswordField) {
                s = String.format("Password :) : %s", e.getActionCommand());
            }
            JOptionPane.showMessageDialog(null,s);
        }
    }

}


