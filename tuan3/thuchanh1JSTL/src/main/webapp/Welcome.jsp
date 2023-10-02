<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: dang
  Date: 26/09/2023
  Time: 13:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
</head>
<body>
<%
String name =request.getParameter("uname");
PrintWriter printWriter=response.getWriter();
printWriter.print("welcome"+name);
session.setAttribute("user",name);
%>
<a href="second.jsp">Display the value</a>
</body>
</html>
