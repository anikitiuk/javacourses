package com.hillel.carSerialization;

import com.hillel.serialization.Car;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

/**
 * Created by ANikitiuk on 11.06.2015.
 */
public class CarSerialization extends JFrame {
    private JPanel panel;
    private JButton addButton;
    private JTextField textField1;
    private JList list;
    private DefaultListModel listModel;

    public static void main(String[] args) {
        new CarSerialization();
    }

    public CarSerialization() {
        setContentPane(panel);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        init();
        pack();
        setVisible(true);
    }

    private void init() {
        listModel = new DefaultListModel();
        list.setModel(listModel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String carManufacturer = textField1.getText();

                Car car = new Car(carManufacturer);

                listModel.add(listModel.size(), car); //ctrl+q, ctrl+p

                textField1.setText("");

            }
        });

        initMenuBar();
    }

    private void initMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        setJMenuBar(menuBar);

        JMenu menuFile = new JMenu("File");

        menuBar.add(menuFile);

        JMenuItem saveItem = new JMenuItem("Save");

        menuFile.add(saveItem);

        saveItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("hillel/serializedCarList.dat"))) {
                    Object[] cars = listModel.toArray();
                    outputStream.writeObject(cars);
                } catch (IOException e1) {
                    JOptionPane.showMessageDialog(null, "Save error", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JMenuItem loadItem = new JMenuItem("Load");
        menuFile.add(loadItem);
        loadItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("hillel/serializedCarList.dat"))) {
                    Object[] cars = (Object[]) inputStream.readObject();

                    listModel.clear();
                    for (Object car : cars) {
                        listModel.add(listModel.size(), car);
                    }
                } catch (IOException | ClassNotFoundException e1) {
                    JOptionPane.showMessageDialog(null, "Load error", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
}
