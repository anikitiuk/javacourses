package com.hillel.NotCourses;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Alexey on 024 24.06.15.
 */
public class IterativeMethodForm extends JFrame{
    private JButton jacobyButton;
    private JTextArea mainMatrix;
    private JTextArea jacobySolution;
    private JTextArea seidelSolution;
    private JButton seidelButton;
    private JPanel panel1;
    private JButton exitButton;
    private JButton showMatrix;

    public IterativeMethodForm(){
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        double[][] B = {
                {0, 0.22, -0.11, 0.31},
                {0.38, 0, -0.12, 0.22},
                {0.11, 0.23, 0, -0.51},
                {0.17, -0.21, 0.31, 0}
        };


        MatrixDisplay matrixDisplay = new MatrixDisplay(mainMatrix, B);
        showMatrix.addActionListener(matrixDisplay);

        exitButton.addActionListener(new ActionListener() {
            private int exitCode = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                int result = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.OK_OPTION) {
                    exit();
                }
            }

            public void exit() {
                System.exit(exitCode);
            }
        });
    }

    public static void main(String[] args) {
        new IterativeMethodForm();
    }
}
