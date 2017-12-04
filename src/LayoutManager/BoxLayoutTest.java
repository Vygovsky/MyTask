package LayoutManager;

import javax.swing.*;

/**
 * Created by Roman_v on 04.12.2017.
 */
public class BoxLayoutTest extends JFrame{
    public BoxLayoutTest(){
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        for (int i = 0; i <12 ; i++) {
            getContentPane().add(new JButton(" "+i));
            setBounds(100,100,400,300);

        }
    }

    public static void main(String[] args) {
        BoxLayoutTest blt=new BoxLayoutTest();
        blt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        blt.setVisible(true);
    }
}
