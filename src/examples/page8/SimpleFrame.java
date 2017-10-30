package examples.page8;

import javax.swing.JFrame;

public class SimpleFrame {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf.setTitle("First window");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setBounds(100, 100, 400, 200);
        jf.setVisible(true);
    }
}
