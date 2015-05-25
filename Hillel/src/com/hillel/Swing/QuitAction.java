package com.hillel.Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by ANikitiuk on 21.05.2015.
 */
public class QuitAction implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
