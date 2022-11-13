package GUI;

import javax.swing.*;
import java.awt.*;

public class SwingGUI extends JFrame {
    Container container = this.getContentPane();
    JButton button = new JButton("Кнопка");

    SwingGUI() {
        this.setBounds(600, 200, 0, 0);
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        container.add(button);
    }
}

class Runner {
    public static void main(String[] args) {
        SwingGUI swingGUI = new SwingGUI();
    }
}