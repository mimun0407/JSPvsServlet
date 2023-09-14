<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title >

    </title>
    <style type="text/css">
        .login {
            height:180px; width:530px;
            margin:0;
            padding:10px;
            border:1px #CCC solid;
        }
        .login input {
            padding:5px; margin:5px
        }
    </style>
</head>
<body>
<form action="login" method="post">
    <div class="login">
        <h2>Login</h2>
        <label>
            <input type="text" name="username" size="30" placeholder="username" />
        </label>
        <label>
            <input type="password" name="password" size="30" placeholder="password" />
        </label>
        <a href="${pageContext.request.contextPath}/login"></a>
        <input type="submit" value="submit">
    </div>
    </form>
</body>
</html>