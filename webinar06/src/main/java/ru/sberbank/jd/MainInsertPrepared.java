package ru.sberbank.jd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class MainInsertPrepared {

    public static void main(String[] args) {

        Connection connection = ConnectionUtils.getConnection();

        long id = 6;
        String firstname = "Чехов";
        String lastname = "Антон";
        try (PreparedStatement statement = connection.prepareStatement("INSERT INTO author\n" +
                "(id, firstname, lastname)\n" +
                "VALUES(?, ?, ?);")) {
            statement.setLong(1, id);
            statement.setString(2, firstname);
            statement.setString(3, lastname);

            boolean executed = statement.execute();
            System.out.println(executed);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
