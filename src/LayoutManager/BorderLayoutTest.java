package LayoutManager;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JFrame {
    public BorderLayoutTest(){
        getContentPane().setLayout( new BorderLayout());
        getContentPane().add(new JButton("North"),BorderLayout.NORTH);
        getContentPane().add(new JButton("South"),BorderLayout.SOUTH);
        getContentPane().add(new JButton("West"),BorderLayout.WEST);
        getContentPane().add(new JButton("East"),BorderLayout.EAST);
        getContentPane().add(new JButton("Centre"),BorderLayout.CENTER);
        setBounds(100,100,400,300);

    }

    public static void main(String[] args) {
        BorderLayoutTest blt=new BorderLayoutTest();
        blt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        blt.setVisible(true);
    }

}
