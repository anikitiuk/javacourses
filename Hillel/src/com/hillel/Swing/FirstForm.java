package com.hillel.Swing;

import javax.swing.*;

/**
 * Created by ANikitiuk on 21.05.2015.
 */
public class FirstForm extends JFrame{
    private JPanel panel;
    private JButton exitButton;
    private JTextField textField;
    private JButton printButton;
    private JTextField outputTextField;

    public FirstForm(){
        setContentPane(panel);
        //setSize(300, 100);
        setTitle("First Form");
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        QuitAction quitAction = new QuitAction();
        exitButton.addActionListener(quitAction);

        Printer printer = new Printer(textField, outputTextField);
        printButton.addActionListener(printer);
    }

    public static void main(String[] args) {
        new FirstForm();
    }
}
