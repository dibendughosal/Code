import java.awt.*;
import java.awt.event.*;

public class KeyPressEvent extends Frame implements KeyListener {
    public KeyPressEvent() {
        addKeyListener(this);
        setSize(300, 300);
        setVisible(true);
    }

    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + e.getKeyChar());
    }

    public void keyReleased(KeyEvent e) {
    }

    public void keyTyped(KeyEvent e) {
    }

    public static void main(String[] args) {
        new KeyPressEvent();
    }
}