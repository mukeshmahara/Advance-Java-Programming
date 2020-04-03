<%-- 
    Document   : login
    Created on : Apr 2, 2020, 2:38:16 PM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <title>login Portal</title>
    </head>
    <body>

    <body>
        <div class="d-flex justify-content-center ">
            <strong class=" mt-4"> Login Portal</strong>
        </div>
        <form method="POST" action="login">
            <div class="d-flex justify-content-center mt-2">

                <div class="bg-light p-4 mt-4" >

                    <table>

                        <tr>

                            <td><input type="text" placeholder="USERNAME" class="form-control" name="username"/></td>
                        </tr>
                        <tr>

                            <td>
                                <input type="password" placeholder="PASSWORD" class="form-control mt-3 " name="password"/>

                            </td>
                        </tr>


                    </table>
                    <div>
                        <input type="submit" class="btn btn-primary col-md-12 mt-3" value="login"/>
                    </div>
                </div>
            </div>
        </form>
    </body>


</body>
</html>
