package com.hillel.advancedOOP.mvc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ANikitiuk on 16.07.2015.
 */
public class DjPanel extends JFrame implements BpmObserver {
    private JButton increaseButton;
    private JButton decreaseButton;
    private JPanel panel;
    private JLabel label;
    private Controller controller;
    private Model model;

    public DjPanel(Controller controller, Model model) {
        this.controller = controller;
        this.model = model;
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setContentPane(panel);
        pack();
        setVisible(true);
        initDexBtn();
        initIncBtn();
        updateBpm();
    }

    private void updateBpm() {
        label.setText(String.valueOf(model.getBpm()));
    }

    private void initIncBtn() {
        increaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.increaseBtnPressed();
            }
        });
    }

    private void initDexBtn() {
        decreaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.decreaseBtnPressed();
            }
        });
    }

    @Override
    public void bpmChanged() {
        updateBpm();
    }

    public void decreaseBtnEnabled(boolean enabled) {
        decreaseButton.setEnabled(enabled);
    }

    public void increaseBtnEnabled(boolean enabled) {
        increaseButton.setEnabled(enabled);
    }
}
