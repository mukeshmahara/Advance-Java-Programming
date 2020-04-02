<%-- 
    Document   : Register
    Created on : Apr 2, 2020, 2:40:26 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
       
        <title>Register</title>
        <%--<%@include file="../Web-Content/bootstrap-4.4.1-dist/css/bootstrap.min.css" %>--%>
    </head>
    <body>
        <form action="Register_Servlet" method="POST">

            <h1 class="bg-dark">Register</h1>

            <table>
                <tr>
                    <td> Username</td>
                    <td>:</td>
                    <td><input type="text" name="username"/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>:</td>
                    <td><input type="password" name="password"/></td>
                </tr>
                <tr>
                    <td>Confirm Password</td>
                    <td>:</td>
                    <td><input type="password" name="confirm_password"/></td>
                </tr>
                <tr> 
                    <td>Email</td>
                    <td>:</td>
                    <td><input type="email" name="email"/></td>
                </tr>

            </table>
            <input type="submit" value="Register"/>
        </form>
    </body>
</html>
