package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        try {
            String url = "jdbc:postgresql://localhost/test?user=postgres&password=postgre";
            Connection connection = DriverManager.getConnection(url);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from users");
            while (resultSet.next())
            {
                System.out.println(resultSet.getString(2));
            }

            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}