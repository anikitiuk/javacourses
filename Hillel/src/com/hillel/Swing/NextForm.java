package com.hillel.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NextForm extends JFrame {
    private JButton exitButton;
    private JPanel panel1;
    private JList list1;
    private JButton addButton;
    private JScrollPane scrollPane;


    public NextForm() {
        setContentPane(panel1);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);

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

        DefaultListModel listModel = new DefaultListModel();
        list1.setModel(listModel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                listModel.add(listModel.getSize(), "asd");
            }
        });

    }

    public static void main(String[] args) {
        new NextForm();
    }
}