package ru.sberbank.jd;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class MainInsert {

    public static void main(String[] args) {

        Connection connection = ConnectionUtils.getConnection();

        long id = 5;
        String firstname = "Чехов";
        String lastname = "Антон";
        try (Statement statement = connection.createStatement()) {
            boolean executed = statement.execute("INSERT INTO author\n" +
                    "(id, firstname, lastname)\n" +
                    "VALUES(" + id + ", '" + firstname + "', '" + lastname + "');");
            System.out.println(executed);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
