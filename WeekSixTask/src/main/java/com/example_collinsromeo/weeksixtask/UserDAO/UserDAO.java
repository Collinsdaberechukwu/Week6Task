package com.example_collinsromeo.weeksixtask.UserDAO;

import com.example_collinsromeo.weeksixtask.Enum.Gender;
import com.example_collinsromeo.weeksixtask.Model.User;

import java.sql.*;

public class UserDAO {

    private Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }
    public boolean userRegistration(User user) throws SQLException {
        String query = "INSERT INTO Users(first_name,last_name,birth_date,email,password,gender,phoneNumber)" +
                " VALUES(?,?,?,?,?,?,?)";
        try(
            PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setString(1,user.getFirst_name());
            preparedStatement.setString(2, user.getLast_name());
            preparedStatement.setString(3, String.valueOf(Date.valueOf( user.getBirth_date())));
            preparedStatement.setString(4, user.getEmail());
            preparedStatement.setString(5,user.getPassword());
            preparedStatement.setString(6, String.valueOf(user.getGender()));
            preparedStatement.setString(7,user.getPhone_number());

            var statementResult = preparedStatement.executeUpdate();
            System.out.println(statementResult);
            return statementResult > 0;
        }catch (SQLException e){
            e.printStackTrace();
            throw new SQLException("Failed to connect the Registered user " + e.getMessage());
        }
    }

    public boolean checkEmailExist(String email)throws SQLException{
        String query = "SELECT EMAIL FROM Users where = ?";
        try(PreparedStatement preparedStatement = connection.prepareStatement(query)){
            preparedStatement.setString(1,email);
            try(ResultSet resultSet = preparedStatement.executeQuery()){
                return resultSet.next();
            }
        }catch (SQLException e){
            e.printStackTrace();
            throw new SQLException("Unsuccessful to connect....." + e.getMessage());
        }
    }

    public User userLogin(String email, String password)throws SQLException {
        User user = null;
        String query = "SELECT * FROM Users WHERE email = ? AND password";
        try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    user = new User();
                    user.setFirst_name(resultSet.getString("first_name"));
                    user.setLast_name(resultSet.getString("last_name"));
                    user.setEmail(resultSet.getString("email"));
                    user.setPassword(resultSet.getString("password"));
                    user.setId(resultSet.getInt("id"));
                }
            } catch (SQLException e) {
                e.printStackTrace();
                throw new SQLException("failed to login in please check your login details " + e.getMessage());
            }
            return user;
        }
    }
        public void closeResources()throws SQLException{
            if (connection != null){
                connection.close();
            }
        }
    }

