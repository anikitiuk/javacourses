package com.hillel.NotCourses;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alexey on 009 09.07.15.
 */
public class VectorDisplay implements ActionListener {
    private final JTextArea outputTextArea;
    private final double[] array;

    public VectorDisplay(JTextArea outputTextArea, double[] array) {
        this.outputTextArea = outputTextArea;
        this.array = array;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (k != i) {
                outputTextArea.append("\n");
            }
            k = i;
            outputTextArea.append(String.valueOf(array[i]));

        }
    }
}

