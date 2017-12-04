package LayoutManager;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Roman_v on 04.12.2017.
 */
public class FlowLayoutTest extends JFrame {

    public FlowLayoutTest(){
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER,0,0));
        for (int i = 0; i <20; i++) {
            getContentPane().add(new JButton(" "+i));
            setBounds(100,100,400,300);
        }
    }

    public static void main(String[] args) {
        FlowLayoutTest flt=new FlowLayoutTest();
        flt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        flt.setVisible(true);
    }
}
