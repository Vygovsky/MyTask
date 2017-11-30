package examples.JFrame;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.PropertyResourceBundle;

/**
 * Created by Roman_v on 30.11.2017.
 */
public class PropertiesExample extends JFrame {
/*
    public PropertiesExample() {
        super("Button 2");

        PropertyResourceBundle prb = (PropertyResourceBundle)
                PropertyResourceBundle.getBundle("examples.JFrame");

        String upText = prb.getString("up.button.title");
        String downText = prb.getString("down.button.title");
        JButton up = new JButton(upText);
        JButton down = new JButton(downText);

        add(up, BorderLayout.NORTH);
        add(down, BorderLayout.SOUTH);


        setBounds(200, 200, 400, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }
*/


    public static void main(String[] args) {
        PropertiesExample pe = new PropertiesExample();
        System.out.println(Locale.getDefault().toString());
    }
}


/* public PropertiesExample() {
        super("Button1");
        JButton up = new JButton("UP");
        JButton down = new JButton("DOWN");

        add(up, BorderLayout.NORTH);
        add(down, BorderLayout.SOUTH);

        setBounds(200, 200, 400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }*/


/*    public PropertiesExample() {
        super("Button 2");
        try {
            Properties ps = new Properties();
            ps.load(new FileReader("E:\\uits\\MyTask\\src\\examples\\JFrame\\simple.properties"));

            String upText = ps.getProperty("up.button.title");
            String downText = ps.getProperty("down.button.title");
            JButton up = new JButton(upText);
            JButton down = new JButton(downText);

            add(up, BorderLayout.NORTH);
            add(down, BorderLayout.SOUTH);

        } catch (IOException e) {
            e.printStackTrace(System.out);

        }


        setBounds(200, 200, 400, 200);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);
    }*/