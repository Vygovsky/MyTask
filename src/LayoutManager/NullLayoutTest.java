package LayoutManager;

import javax.swing.*;

public class NullLayoutTest extends JFrame {
    public NullLayoutTest(){
        getContentPane().setLayout(null);
        for (int i = 0; i <12 ; i++) {
            JButton tmp=new JButton(" "+i);
            tmp.setBounds(10,i*30,50,25);
            getContentPane().add(tmp);
            setBounds(100,100,400,300);
        }
    }

    public static void main(String[] args) {
        NullLayoutTest nlt=new NullLayoutTest();
        nlt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nlt.setVisible(true);
    }
}
