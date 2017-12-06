package LayoutManager;

import java.awt.*;

public class DiagLayout implements LayoutManager {

    @Override
    public void addLayoutComponent(String name, Component comp) {

    }

    @Override
    public void removeLayoutComponent(Component comp) {

    }

    @Override
    public Dimension preferredLayoutSize(Container parent) {
        return computLayoutSize(parent);
    }

    @Override
    public Dimension minimumLayoutSize(Container parent) {
        return computLayoutSize(parent);
    }

    private Dimension computLayoutSize(Container parent) {
        int prefWidth = 0;
        int prefHeight = 0;
        Component[] component = parent.getComponents();
        for (int i = 0; i < component.length; i++) {
            /*prefWidth += component[i].getWidth();
            prefHeight += component[i].getHeight();*/
            int width = (int)(component[i].getPreferredSize().getWidth());
            int height = (int)(component[i].getPreferredSize().getHeight());
        }
        return new Dimension(prefWidth, prefHeight);
    }

    @Override
    public void layoutContainer(Container parent) {
        Component[] component = parent.getComponents();
        int row = 0;
        int col = 0;
        int width = parent.getWidth() / component.length;
        int height = parent.getHeight() / component.length;
        for (int i = 0; i < component.length; i++) {
            Rectangle r = new Rectangle(col, row, width, height);
            component[i].setBounds(r);

            col += width;
            row += height;
        }
    }
}
