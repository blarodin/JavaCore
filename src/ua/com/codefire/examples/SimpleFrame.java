package ua.com.codefire.examples;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleFrame extends JFrame {

    public SimpleFrame() {
        this.setBounds(0, 0, 450, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);

        JButton button = new JButton();
        button.setText("Click me!");
        /*
        // 'Contract' for Button's Action
        ActionHandler handler = new ActionHandler();
        button.addActionListener(handler);
        */

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println("Action for Button!");
            }
        });

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

class ActionHandler implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        // print to Console
        System.out.println("Action for Button!");
        // Show message :)
        JOptionPane.showMessageDialog(null, "Hello Swing Framework!", "My Title",JOptionPane.INFORMATION_MESSAGE);
    }
}
