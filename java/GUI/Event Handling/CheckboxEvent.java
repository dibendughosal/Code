import java.awt.*;
import java.awt.event.*;

public class CheckboxEvent extends Frame implements ItemListener {
    Checkbox checkbox;

    public CheckboxEvent() {
        checkbox = new Checkbox("Check Me");
        checkbox.setBounds(100, 100, 80, 30);
        checkbox.addItemListener(this);
        add(checkbox);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        System.out.println("Checkbox State Changed: " + checkbox.getState());
    }

    public static void main(String[] args) {
        new CheckboxEvent();
    }
}