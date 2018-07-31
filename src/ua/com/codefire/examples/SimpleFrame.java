package ua.com.codefire.examples;

import javax.swing.*;
import java.awt.*;

public class SimpleFrame extends JFrame {

    public SimpleFrame() {
        this.setBounds(0, 0, 450, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);

        JButton button = new JButton();
        button.setText("Click me!");

        this.getContentPane().add(button);

        this.getContentPane().add(new JButton("Button #1"));
        this.getContentPane().add(new JButton("Button #2"));
        this.getContentPane().add(new JButton("Button #3"));
        this.getContentPane().add(new JButton("Button #4"));
        this.getContentPane().add(new JButton("Button #5"));
        this.getContentPane().add(new JButton("Button #6"));
    }

    public static void main(String[] args) {
        SimpleFrame frame = new SimpleFrame();
        frame.setVisible(true);
    }
}
