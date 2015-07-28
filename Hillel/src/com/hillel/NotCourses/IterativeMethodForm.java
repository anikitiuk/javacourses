package com.hillel.NotCourses;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * Created by Alexey on 024 24.06.15.
 */
public class IterativeMethodForm extends JFrame {
    private JButton jacobyButton;
    private JTextArea mainMatrix;
    private JTextArea jacobySolution;
    private JTextArea seidelSolution;
    private JButton seidelButton;
    private JPanel panel1;
    private JButton exitButton;
    private JButton showMatrix;
    private JTextArea vectorMain;
    private JButton showVectorButton;

    public IterativeMethodForm() throws IOException, InterruptedException {
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        int N = 4;
        double[][] A = new double[N][N];
        double[] B = new double[N];
        BufferedReader inputStream = new BufferedReader(new FileReader(new File("C:\\Users\\Alexey\\Desktop\\Matrix.txt")));
        BufferedReader inputStream2 = new BufferedReader(new FileReader(new File("C:\\Users\\Alexey\\Desktop\\Vector.txt")));
        String line;
        int i = 0;
        while ((line = inputStream.readLine()) != null) {
            String[] strs = line.split(" ");
            int k = 0;
            for (String str : strs) {
                A[i][k] = Double.parseDouble(str);
                k++;
            }
            i++;
        }
        while ((line = inputStream2.readLine()) != null) {
            String[] strs = line.split(" ");
            int k = 0;
            for (String str : strs) {
                B[k] = Double.parseDouble(str);
                k++;
            }
        }
        System.out.println(A.toString());

        MatrixDisplay matrixDisplay = new MatrixDisplay(mainMatrix, A);
        VectorDisplay vectorDisplay = new VectorDisplay(vectorMain, B);
        showMatrix.addActionListener(matrixDisplay);
        showVectorButton.addActionListener(vectorDisplay);

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

    public static void main(String[] args) throws IOException, InterruptedException {
        new IterativeMethodForm();
    }
}
