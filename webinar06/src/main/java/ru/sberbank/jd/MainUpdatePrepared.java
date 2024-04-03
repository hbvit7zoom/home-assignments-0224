package ru.sberbank.jd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainUpdatePrepared {

    public static void main(String[] args) {

        Connection connection = ConnectionUtils.getConnection();

        long id = 6;
        String firstname = "Чехов";
        String lastname = "Антон";
        try (PreparedStatement statement = connection.prepareStatement("UPDATE author\n" +
                "SET firstname=? where id = 6;")) {
            statement.setString(1, "Иван");

            boolean executed = statement.execute();
            System.out.println(executed);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
