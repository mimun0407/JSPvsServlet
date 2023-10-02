<%@ page import="com.example.thuchanh2jstl.Product" %><%--
  Created by IntelliJ IDEA.
  User: dang
  Date: 26/09/2023
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <style >
        .table{
            table-layout: fixed;
            width: 100%;
        }
        .equal-table th {
            width: calc(100% / 3)
        }
        .image-container {
            text-align: center;
        }

        .image-container img {
            display: block;
            margin: 0 auto;
        }

        .caption {
            margin-top: 10px;
        }
        .near{
            margin-right: 10px;
        }
    </style>
    <title>Title</title>
</head>
<body>
<div style="position:absolute;right: 80px; top:20px;">

<form action="${pageContext.request.contextPath}/logout">
   <input type="submit" value="Logout">
</form>
    <form action="${pageContext.request.contextPath}/them">
        <input type="submit" value="GioHang">
    </form>
</div>
<div style="position: absolute; left:20px; top:80px">
    <c:forEach items="${sessionScope.product}" var="out">
    <form method="post" action="${pageContext.request.contextPath}/add">
<table class="table">


<tr>
        <th>
            <div class="image-container">
                <input type="image"  src="${out.prPicture}"  alt="Bức ảnh">
                <input type="hidden" name="ig" value="${out.prPicture}">
                <br>
                <label class="caption" >${out.prName}</label>
                <input type="hidden" name="Name" value="${out.prName}">
                <br>
                <label class="near" >${out.prCost}</label>
                <input type="hidden" name="Cost" value="${out.prCost}">
                <br>
                <input type="submit" value="mua">
            </div>
        </th>
</tr>
</table>
</form>
    </c:forEach>
</div>
</body>
</html>
