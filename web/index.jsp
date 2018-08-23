<%-- 
    Document   : index
    Created on : Aug 22, 2018, 7:59:50 PM
    Author     : safev
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>

    <body>
        <div id="login">
            <h1>LOGIN</h1>
            <c:if test="${text != null}">
                <b style="color: red;">${text}</b><br><br>
            </c:if>
            <form name="login_from" action="Login" method="POST">
                <table>
                    <tbody>
                        <tr>
                            <td class="txt">
                                <h3>Username</h3>
                            </td>
                            <td><input type="text" class="form-control input-lg" name="name" value="" /></td>
                        </tr>
                        <tr>
                            <td class="txt ">
                                <h3>Password</h3>
                            </td>
                            <td><input type="password" class="form-control input-lg" name="pass" value="" /></td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input id="submit" type="submit" value="เข้าสู่ระบบ" /></td>
                        </tr>
                    </tbody>
                </table>

<!--                <div class="form-group col-xs-4">
                    <h3><label for="username">Name:</label></h3>
                    <input type="text" class="form-control input-lg"  name="pass" value=""/>
                    <h3><label for="password:">Password:</label></h3>
                    <input type="password" class="form-control input-lg"  name="pass" value=""/>
                    <br>
                    <button id="submit" type="submit" class="btn btn-info">Login</button>
                </div>
            </form>-->
        </div>
    </body>
</html>

