package com.hillel.NotCourses;

import javax.swing.*;
import javax.swing.text.StringContent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alexey on 024 24.06.15.
 */
public class MatrixDisplay implements ActionListener {

    private final JTextArea outputTextArea;
    private final double[][] array;

    public MatrixDisplay(JTextArea outputTextArea, double[][] array) {
        this.outputTextArea = outputTextArea;
        this.array = array;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (k != i) {
                    outputTextArea.append("\n");
                }
                k = i;
                if (j > 0) {
                    outputTextArea.append(";    ");
                }
                outputTextArea.append(String.valueOf(array[i][j]));
            }
        }
    }
}
