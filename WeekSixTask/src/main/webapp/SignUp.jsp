<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <link rel="stylesheet" href="signUp.css">
</head>
<body>
<div class="Sign_up">
<%--    <h1>Register FaceBook</h1>--%>
    <div class="parent">
        <div class="writeupp">
            <h1 style="color: #3b5998">FaceBook App Clone</h1>
            <h3 style="color: #333333">Facebook helps you connect and share<br> with the people in your life.</h3>
        </div>
        <div class="bb">
            <form action="#" method="post">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required>
                <label for="password">Password:</label>
                <input type="password" id="password" name="password" required>
                <label for="number">Phone Number:</label>
                <input type="number" id="number" name="number" required>
                <label for="numberage">Age:</label>
                <input type="number" id="numberage" name="numberage" required>
                <label for="country"> Country:</label>
                <input type="text" id="country" name="country" required>
                <button type="submit"><a href="FaceBook_Homepage.jsp">Register</a>Register</button>
            </form>
        </div>
    </div>
    <p>Already have an account? <a href="index.jsp"><h1 style="text-align: center">Login</h1></a></p>
</div>
</body>
</html>
