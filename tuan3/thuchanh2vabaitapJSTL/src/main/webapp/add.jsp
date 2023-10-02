<%--
  Created by IntelliJ IDEA.
  User: dang
  Date: 28/09/2023
  Time: 16:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Buy list</title>
</head>
<body>
<h1>gio hang</h1>
<table>
    <c:forEach items="${sessionScope.products}" var="product">
        <tr>
            <td><img src="${product.getPrPicture()}" alt="picture"></td>
            <td>${product.getPrName()}</td>
            <td>${product.getPrCost()}</td>

        </tr>

    </c:forEach>
</table>
</body>
</html>
