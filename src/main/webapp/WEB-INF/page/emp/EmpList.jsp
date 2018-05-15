<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <table>
        <tr>
            <th>ID</th>
            <th>姓名</th>
            <th>性别</th>
            <th>邮箱</th>
            <th>所在部门</th>
        </tr>
        <c:forEach items="${list}" var="emp" varStatus="vs">
            <tr>
                <td align = "center">${emp.id}</td>
                <td align = "center">${emp.name}</td>
                <td align = "center">${emp.gender}</td>
                <td align = "center">${emp.email}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
