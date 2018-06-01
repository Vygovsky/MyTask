package JFrame.task2;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    JLabel text;

    public Window() {
        super("Glavnoe okno");
        setLayout(new FlowLayout());
        text = new JLabel("Vnutr okno");
        text.setToolTipText("Vspl okno");
        add(text);

    }
}
