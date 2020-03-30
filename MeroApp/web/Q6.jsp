<%-- 
    Document   : Q6
    Created on : Mar 28, 2020, 5:33:45 PM
    Author     : Dell
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>MYSQL and JDBC</title>
    </head>
    
    <body>
        <form method="POST" action="Q6Servlet">
            <h1>MYSQL Database Connection Using JDBC</h1>
            <input type="number" name="roll_no" placeholder="Roll_number"/>
            <input type="text" name="uname" placeholder="username"/>
            <input type="text" name="address" placeholder="address"/>
            <input type="email" name="email" placeholder="Email"/>
            <input type="text" name="faculty" placeholder="Faculty"/>
            <input type="date" name="doa" placeholder="Date of admission"/>
            </br></br>
            <input type="submit" value="submit"/>
        </form>

    </body>
</html>
