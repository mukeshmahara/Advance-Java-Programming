<%-- 
    Document   : Q7login
    Created on : Mar 30, 2020, 9:56:16 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title> Login</title>
    </head>
    <body>
        <form method="POST" action="Login">
            <table>
                <tr>
                    <td>Username</td>
                    <td><input type="text" placeholder="USERNAME" name="username"/></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td>
                        <input type="password" placeholder="PASSWORD" name="password"/>
                
                    </td>
                </tr>
                
                
                
            </table>
            <input type="submit" value="login"/>
        </form>
    </body>
</html>
