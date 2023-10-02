<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1>Login</h1>
<form action="/hello-servlet" method="get">
    <table>
        <tr>
            <th>Username</th>
            <th><input type="text" name="username" placeholder="Nhap username" value="a"></th>
        </tr>
        <tr>
            <th>Password</th>
            <th><input type="password" name="password" placeholder="nhap password" value="1"></th>
        </tr>
        <tr>
            <th></th>
            <th><input type="submit" value="Login"></th>
        </tr>
    </table>
</form>

</body>
</html>