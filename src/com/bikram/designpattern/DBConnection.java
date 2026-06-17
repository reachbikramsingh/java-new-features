package com.bikram.designpattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public enum DBConnection {

    INSTANCE; // single instance

    private Connection connection;

    // Constructor (called only once)
    DBConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            String username = "root";
            String password = "password";

            connection = DriverManager.getConnection(url, username, password);

        } catch (SQLException e) {
            throw new RuntimeException("Failed to create DB connection", e);
        }
    }

    public Connection getConnection() {
        return connection;
    }
}