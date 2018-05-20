package sapper;

import javax.swing.*;
import java.awt.*;


public class Sapper extends JFrame {
    private JPanel panel;
    private int IMAGE_SIZE = 50;
    private int COLS = 15;
    private int ROWS = 1;

    public static void main(String[] args) {
        new Sapper();
    }

    private Sapper() {
        setImage();
        initPanel();
        initFrame();
    }

    private void initFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sapper");
        setVisible(true);
        setResizable(false);
        pack();
        setLocationRelativeTo(null);
    }

    private void initPanel() {

        panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                for (Box box : Box.values()) {
                    g.drawImage((Image) box.image, box.ordinal() * IMAGE_SIZE, 0, this);
                }

            }
        };
        panel.setPreferredSize(new Dimension(COLS * IMAGE_SIZE, ROWS * IMAGE_SIZE));
        add(panel);
    }

    public void setImage() {
        for (Box box : Box.values()) {
            box.image = getImage(box.name().toLowerCase());
        }
    }

    public Image getImage(String name) {
        String fileName="res\\img\\" + name + ".png";
        ImageIcon icon = new ImageIcon(getClass().getResource(fileName));
        return icon.getImage();
    }
}
