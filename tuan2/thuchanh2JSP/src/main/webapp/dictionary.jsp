<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: dang
  Date: 19/09/2023
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title></head>
<body>
<%! Map<String,String> map=new HashMap<>();
%>
<%
map.put("hello","xin chao");
map.put("goodbye","tam biet");
map.put("notebook","quyen vo");
    String search = request.getParameter("search");
    String result = map.get(search);
    PrintWriter printWriter=new PrintWriter(response.getWriter());
    if (result != null) {
        printWriter.print("Word: " + search);
        printWriter.print("Result: " + result);

    } else {
        printWriter.print("Not found");

    }
%>
</body>
</html>
