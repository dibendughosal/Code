import java.awt.*;
import java.awt.event.*;

public class WindowCloseEvent extends Frame {
    public WindowCloseEvent() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.out.println("Window Closed");
                dispose();
            }
        });
        setSize(300, 300);   
        setVisible(true);
    }

    public static void main(String[] args) {
        new WindowCloseEvent();
    }
}