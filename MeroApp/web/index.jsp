<%-- 
    Document   : index
    Created on : Mar 27, 2020, 10:40:59 AM
    Author     : Dell
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <form method="GET" action="MeroServlet">
            <h1>User Name</h1>
            <div>
                <label for="username" name="uname">Username</label>
                <input type="text" name="uname" placeholder="username" />


                <input type="submit" value="send"/>
            </div>
        </form>
    </body>
</html>
