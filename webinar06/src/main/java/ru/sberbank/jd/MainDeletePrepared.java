package ru.sberbank.jd;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MainDeletePrepared {

    public static void main(String[] args) {

        Connection connection = ConnectionUtils.getConnection();

        try (PreparedStatement statement = connection.prepareStatement("DELETE FROM author\n" +
                "where id = ?;")) {
            statement.setLong(1, 6L);

            boolean executed = statement.execute();
            System.out.println(executed);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
