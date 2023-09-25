<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>bai tap thuc hanh siu cap vip pro</title>
</head>
<body>
<table  border="thick" style="margin:0 auto" >
<tr>
    <th width="100">ten</th>
    <th width="100">ngay sinh</th>
    <th width="100">dia chi</th>
    <th width="100">anh</th>*
</tr>
    <c:forEach items="${cust}" var="out">
    <tr>
            <th>${out.name} </th>
            <th>${out.birthdate}</th>
            <th>${out.address}</th>
            <th><img width="100" src="${out.imageUrl}" alt="anh"> </th>
    </tr>

    </c:forEach>

</table>

</body>
</html>
