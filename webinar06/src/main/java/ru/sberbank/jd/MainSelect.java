package ru.sberbank.jd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainSelect {

    public static void main(String[] args) {
        Connection connection = ConnectionUtils.getConnection();

        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("select * from author;");

            while (resultSet.next()) {
                long idByIndex = resultSet.getLong(1);
                long idByName = resultSet.getLong("id");
//                System.out.println(idByIndex);
//                System.out.println(idByName);

                String firstname = resultSet.getString("firstname");
                String lastname = resultSet.getString("lastname");

                System.out.println(new Author(idByName, firstname, lastname));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
