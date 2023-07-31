package com.example_collinsromeo.weeksixtask.Controller;

import java.io.*;
import java.sql.Connection;
import java.sql.SQLException;

import com.example_collinsromeo.weeksixtask.Databasee.DatabaseConnection;
import com.example_collinsromeo.weeksixtask.Model.User;
import com.example_collinsromeo.weeksixtask.UserDAO.UserDAO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    RequestDispatcher dispatcher = null;
    User user;

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        dispatcher = request.getRequestDispatcher("SignUp.jsp");

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String phoneNumber = request.getParameter("number");
        int age = Integer.parseInt(request.getParameter("numberage"));
        String country = request.getParameter("country");

        user = new User(email, password, phoneNumber, age, country);

        try {
            UserDAO userDAO = new UserDAO(new DatabaseConnection().getConnection());
            boolean status = userDAO.userRegistration(user);

            if (status) {
                request.setAttribute("sign_in", "success");
            } else {
                request.setAttribute("sign_in", "failed");
            }
            dispatcher.forward(request, response);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
