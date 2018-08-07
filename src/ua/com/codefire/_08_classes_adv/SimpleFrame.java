package ua.com.codefire._08_classes_adv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleFrame extends JFrame {

    public SimpleFrame() throws HeadlessException {
        this.setBounds(0, 0, 450, 300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        FlowLayout layout = new FlowLayout();
        this.setLayout(layout);

        Container container = this.getContentPane();
        SimpleFrame frame = this;

        JButton redButton = new JButton("RED");
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                container.setBackground(Color.RED);
            }
        });

        container.add(redButton);

        JButton greenButton = new JButton("GREEN");
        greenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                container.setBackground(Color.GREEN);
            }
        });

        container.add(greenButton);

        JButton blueButton = new JButton("BLUE");
        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                container.setBackground(Color.BLUE);
            }
        });

        container.add(blueButton);
    }

    public static void main(String[] args) {
        SimpleFrame frame = new SimpleFrame();
        frame.setVisible(true);
    }
}
