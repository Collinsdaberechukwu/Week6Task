package com.example_collinsromeo.weeksixtask.Databasee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection;

    public static Connection getConnection()throws ClassNotFoundException, SQLException {
        if ( connection == null || connection.isClosed()) {

            try {
                System.out.println("connection being initialized");
                Class.forName("com.mysql.cj.jdbc.Driver");

                connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/?user=facebook_data","root","@Dabrechi20");
                System.out.println("Successfully Connected DataBase. ");

            }catch (SQLException e){
                e.printStackTrace();
                throw new SQLException("Failed to connect.:: Drive not found.");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
            throw new SQLException("failed to connect");
            }
        }
        return connection;
    }

    public static void closeConnection() throws SQLException {
        if (connection != null && !connection.isClosed()){
            connection.close();
            System.out.println("The database connection is now closed......");
        }
    }
}
