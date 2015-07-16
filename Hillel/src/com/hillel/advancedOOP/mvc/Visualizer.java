package com.hillel.advancedOOP.mvc;

import javax.swing.*;
import java.awt.*;

/**
 * Created by ANikitiuk on 16.07.2015.
 */
public class Visualizer extends JFrame implements BeatObserver{
    private JProgressBar progressBar;
    private JPanel panel;

    public Visualizer(){
        setContentPane(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
        initProgressBar();
    }

    private void initProgressBar() {
        progressBar.setMaximum(10);
    }

    @Override
    public void beat(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                progressBar.setValue(7);
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e){}
                progressBar.setValue(10);
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e){}
                progressBar.setValue(3);
                try {
                    Thread.currentThread().sleep(100);
                } catch (InterruptedException e){}
                progressBar.setValue(0);
            }
        }).start();

    }
}
