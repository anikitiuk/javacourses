package com.hillel.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ANikitiuk on 21.05.2015.
 */
public class Printer implements ActionListener {

    private final JTextField textField;
    private final JTextField outputTextField;

    public Printer(JTextField textField, JTextField outputTextField) {
        this.textField = textField;
        this.outputTextField = outputTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        outputTextField.setText(textField.getText());
        textField.setText("");
    }
}
