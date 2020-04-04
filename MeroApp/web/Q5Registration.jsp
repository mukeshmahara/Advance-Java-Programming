<%-- 
    Document   : Q5Registration
    Created on : Mar 28, 2020, 4:46:25 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>registration</title>
    </head>
    <body>
        <form action="Q5Registration" method="POST">

            <h1>Registration Form</h1>

            <table>
                <tr>
                    <td>first Name</td>
                    <td>:</td>
                    <td><input type="text" name="fname"/></td>
                </tr>
                <tr>
                    <td>last Name</td>
                    <td>:</td>
                    <td><input type="text" name="lname"/></td>
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
