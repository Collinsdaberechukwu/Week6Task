<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>FaceBook Clone</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
<div class="login-container">
    <h1>Login</h1>
    <form action="#" method="post">
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required>
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <button type="submit"><a href="FaceBook_Homepage.jsp">Login</a>Login</button>


    <%
        // Perform login authentication logic here
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean isAuthenticated = request.isAsyncSupported(); // Replace this with your actual authentication logic

        if (isAuthenticated) {
            // If login is successful, redirect to the welcome.html page
            response.sendRedirect("FaceBook_Homepage.jsp");
        } else {
            // If login fails, show an error message or redirect back to the login page
//            response.sendRedirect("SignUp.jsp");
        }
    %>
    <p>Don't have an account? <a href="SignUp.jsp">Sign Up</a></p>
    </form>
</div>
</body>
</html>


<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<%@ page import="java.io.*" %>--%>
<%--<%@ page import="java.util.*" %>--%>
<%--<%@ page import="javax.servlet.*" %>--%>
<%--<%@ page import="javax.servlet.http.*" %>--%>

<%--<%--%>
<%--    // Perform login authentication logic here--%>
<%--    String username = request.getParameter("username");--%>
<%--    String password = request.getParameter("password");--%>
<%--    boolean isAuthenticated = performLoginAuthentication(username, password); // Replace this with your actual authentication logic--%>

<%--    if (isAuthenticated) {--%>
<%--        // If login is successful, redirect to the welcome.html page--%>
<%--        response.sendRedirect("welcome.html");--%>
<%--    } else {--%>
<%--        // If login fails, show an error message or redirect back to the login page--%>
<%--        response.sendRedirect("login.jsp?error=1");--%>
<%--    }--%>
<%--%>--%>
