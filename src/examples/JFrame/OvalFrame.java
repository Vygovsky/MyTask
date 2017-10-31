package examples.JFrame;

import javax.swing.*;

public class OvalFrame extends JFrame {
    public OvalFrame(){
       Oval oc=new Oval();
       add(oc);
       setBounds(200,200,50,50);
    }
}
