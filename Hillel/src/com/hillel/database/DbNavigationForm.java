package com.hillel.database;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

/**
 * Created by ANikitiuk on 02.07.2015.
 */
public class DbNavigationForm extends  JFrame{
    private JTextField nameField;
    private JTextField categoryField;
    private JTextField priceField;
    private JButton nextButton;
    private JPanel panel;
    private final ResultSet resultSet;

    public DbNavigationForm() throws SQLException {
        System.setProperty("jdbc.drivers", "org.postgresql.Driver");

        String connectionString = "jdbc:postgresql://localhost:5432/postgres";

        Connection connection = DriverManager.getConnection(connectionString, "postgres", "1993xxxx");
        String sql = "SELECT name, category, price FROM store";

        Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
        resultSet = statement.executeQuery(sql);

    }
}
