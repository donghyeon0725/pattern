package com.design.pattern.objectStructure.composite.example;

import javax.swing.*;

public class SwingExample {
    public static void main(String[] args) {
        // 두가지 모듈이 결국 Component 인터페이스를 구현하게 된다.
        JFrame frame = new JFrame();

        JTextField textField = new JTextField();
        textField.setBounds(200, 200, 200, 40);
        frame.add(textField);


        JButton button = new JButton("click");
        button.setBounds(200, 100, 60, 40);
        button.addActionListener(e -> {
            textField.setText("Hello Swing");
        });
        frame.add(button);

        frame.setSize(600, 400);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
