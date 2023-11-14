package com.greenyhat;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataBaseConnection {
    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";  //*****!!!!!!!Cambia esto según tu configuración
    private static final String USER = "User";
    private static final String PASSWORD = "User01";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

