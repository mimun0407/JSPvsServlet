<%--
  Created by IntelliJ IDEA.
  User: dang
  Date: 18/09/2023
  Time: 08:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

</head>

<body>
<%
    int rate = Integer.parseInt(request.getParameter("rate"));
    int usd= Integer.parseInt(request.getParameter("usd"));
    int vnd= rate*usd;
%>

<label>
    Rate: <%=rate%>
</label>
<label>
    usd: <%=usd%>
</label>
<label>
    vnd: <%=vnd%>
</label>

</body>
</body>
</html>
