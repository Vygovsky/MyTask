package LayoutManager;

import javax.swing.*;
import java.awt.*;

public class GridBagLayoutTest extends JFrame {
    public GridBagLayoutTest() {
        GridBagLayout gridBag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        getContentPane().setLayout(gridBag);
        c.fill = GridBagConstraints.BOTH;

        c.weightx = 1.0;
        makeButton("Button1", gridBag, c);
        makeButton("Button2", gridBag, c);
        makeButton("Button3", gridBag, c);

        c.gridwidth = GridBagConstraints.REMAINDER;
        makeButton("Button4", gridBag, c);
        c.weightx = 0.0;
        makeButton("Button5", gridBag, c);
        c.weightx = GridBagConstraints.RELATIVE;
        makeButton("Button6", gridBag, c);
        c.weightx = GridBagConstraints.RELATIVE;
        makeButton("Button7", gridBag, c);

        c.gridwidth = 1;
        c.gridheight = 2;
        c.weighty = 1.0;
        makeButton("Button8", gridBag, c);
        c.weighty = 0.0;
        c.gridwidth = GridBagConstraints.REMAINDER;
        c.gridheight = 1;
        makeButton("Button9", gridBag, c);
        makeButton("Button10", gridBag, c);

        setBounds(100, 100, 400, 300);

    }

    protected void makeButton(String name, GridBagLayout gridBag, GridBagConstraints c) {
        Button button = new Button(name);
        gridBag.setConstraints(button, c);
        getContentPane().add(button);

    }

    public static void main(String[] args) {
        GridBagLayoutTest gbt = new GridBagLayoutTest();
        gbt.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gbt.setVisible(true);
    }
}
