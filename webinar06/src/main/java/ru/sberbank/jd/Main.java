package ru.sberbank.jd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static final String POSTGRES_URL = "jdbc:postgresql://localhost:5433/postgres";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "password";

    public static void main(String[] args) {
        Connection connection;
        try {
            connection = DriverManager.getConnection(POSTGRES_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }



        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}