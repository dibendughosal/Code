import java.awt.*;
import java.awt.event.*;

public class MouseClickEvent extends Frame implements MouseListener {
    public MouseClickEvent() {
        addMouseListener(this);
        setSize(300, 300);
        setVisible(true);
    }

    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked at: " + e.getX() + ", " + e.getY());
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public static void main(String[] args) {
        new MouseClickEvent();
    }
}