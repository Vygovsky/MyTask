package sapper;

import javax.swing.*;
import java.awt.*;
import java.nio.file.Paths;

public class Sapper extends JFrame {
    private Game game;
    private JPanel panel;
    private int IMAGE_SIZE = 50;
    private int BOMBS = 1000;
    private int COLS = 9;
    private int ROWS = 9;

    public static void main(String[] args) {
        new Sapper();
    }

    private Sapper() {
        game = new Game(COLS, ROWS, BOMBS);
        game.start();
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
                for (Coord coord : Ranges.getAllCoords()) {
                    g.drawImage((Image) game.getBox(coord).image,
                            coord.x * IMAGE_SIZE, coord.y * IMAGE_SIZE, this);
                }
            }
        };
        panel.setPreferredSize(new Dimension(Ranges.getSize().x * IMAGE_SIZE, Ranges.getSize().y * IMAGE_SIZE));
        add(panel);
    }

    public void setImage() {
        for (Box box : Box.values()) {
            box.image = getImage(box.name().toLowerCase());
            setIconImage(getImage("icon"));
        }
    }

    public Image getImage(String name) {
        String fileName = "res/img/" + name + ".png";
        ImageIcon icon = new ImageIcon(Paths.get(fileName).toString());
        return icon.getImage();
    }
}
