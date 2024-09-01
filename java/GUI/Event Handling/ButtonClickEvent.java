import java.awt.*;
import java.awt.event.*;

public class ButtonClickEvent extends Frame implements ActionListener {
    Button btn;

    public ButtonClickEvent() {
        btn = new Button("Click Me");
        btn.setBounds(100, 100, 80, 30);
        btn.addActionListener(this);
        add(btn);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked");
    }

    public static void main(String[] args) {
        new ButtonClickEvent();
    }
}