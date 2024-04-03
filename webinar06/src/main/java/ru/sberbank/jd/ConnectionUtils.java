package ru.sberbank.jd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtils {

    public static final String POSTGRES_URL = "jdbc:postgresql://localhost:5433/postgres";
    public static final String USERNAME = "postgres";
    public static final String PASSWORD = "password";

    public static Connection getConnection() {
        Connection connection;
        try {
            connection = DriverManager.getConnection(POSTGRES_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    public static Connection getConnection(String jdbcUrl, String username, String password) {
        Connection connection;
        try {
            connection = DriverManager.getConnection(jdbcUrl, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
