package sapper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.nio.file.Paths;

import static sapper.GameState.BOMBER;
import static sapper.GameState.PLAYED;
import static sapper.GameState.WINNER;

public class Sapper extends JFrame {
    public Game game;
    private JPanel panel;
    private JLabel label;
    private int IMAGE_SIZE = 50;
    private int BOMBS = 10;
    private int COLS = 9;
    private int ROWS = 9;

    public static void main(String[] args) {
        new Sapper();
    }

    private Sapper() {
        game = new Game(COLS, ROWS, BOMBS);
        game.start();
        setImage();
        initLabel();
        initPanel();
        initFrame();
    }


    private void initFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sapper");

        setResizable(false);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void initLabel() {
        label = new JLabel(getMessage());
        Font font = new Font("Tahoma", Font.BOLD, 15);
        label.setFont(font);
        add(label, BorderLayout.SOUTH);

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
        //за нажатие мышки
        panel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                int x = e.getX() / IMAGE_SIZE;
                int y = e.getY() / IMAGE_SIZE;
                Coord coord = new Coord(x, y);
                switch (e.getButton()) {
                    case MouseEvent.BUTTON1:
                        game.pressLeftButton(coord);
                        break;
                    case MouseEvent.BUTTON3:
                        game.pressRightButton(coord);
                        break;
                    case MouseEvent.BUTTON2:
                        game.start();
                        break;
                }
                label.setText(getMessage());
                repaint();
            }
        });

        panel.setPreferredSize(new Dimension(Ranges.getSize().x * IMAGE_SIZE, Ranges.getSize().y * IMAGE_SIZE));
        add(panel);
    }

    private String getMessage() {
        switch (game.getState()) {
            case BOMBER:
                return ("BOOM. Your loser");
            case WINNER:
                return ("Congratulation");
            case PLAYED:
            default:
                return ("Welcome");
        }
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
