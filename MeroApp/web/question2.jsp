<%-- 
    Document   : question2
    Created on : Mar 28, 2020, 7:45:38 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Question 2</title>

        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    </head>
    <body>
        
        <div class="container ">
            <h1>Question 2</h1>
            <div class="card">

                <form method="GET" action="Question_2_Servlet" class="form-group">
                    <div class="p-3">
                        <label for="user">User</label>
                        <input type="text" id="user" name="user" class="form-control " placeholder="User name here"/>

                        <div class="mt-3">
                            <label >Gender :</label>
                            <input type="radio" id="Male" value="Male" name="Gender" class=""/>
                            <label for="Male" >Male</label>

                            <input type="radio" id="Female" value="Female" name="Gender" class=""/>
                            <label for="Female">Female</label>

                            <input type="radio" id="Other" value="Other" name="Gender" class=""/>
                            <label for="Other">Other</label>

                        </div>

                        <div class="mt-3">
                            <input type="checkbox" id="cond" name="condition" value="Agreed" class="" placeholder="User name here"/>
                            <label for="cond">Agree Term And Condition</label>
                        </div>

                        <label for="option">Subject</label>
                        <select id="option" name="option">
                            <option>HTML</option>
                            <option>JSP</option>
                            <option>PHP</option>
                        </select>

                        <input type="submit" value="send" class="btn btn-primary mt-3"/>
                    </div>
                </form>
            </div>
        </div>
    </body>
</html>
