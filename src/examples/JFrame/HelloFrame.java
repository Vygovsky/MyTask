package examples.JFrame;

import javax.swing.*;
import java.awt.*;

public class HelloFrame extends JFrame {
    public HelloFrame() {
        JButton jbt = new JButton("Say 'Hello'");
        jbt.addActionListener(e -> System.out.println("Hello guys!!"));
        add(jbt, BorderLayout.NORTH);
        setBounds(100, 100, 400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        HelloFrame helloFrame=new HelloFrame();
    }
}
