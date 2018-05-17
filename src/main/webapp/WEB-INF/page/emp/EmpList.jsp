<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% String path = request.getContextPath(); %>

<html>
<head>
    <title>Title</title>
</head>
<script type="text/javascript"
        src="${path }/res/js/jquery-1.12.4.min.js"></script>
<link
        href="${path }/res/bootstrap-3.3.7-dist/css/bootstrap.min.css"
        rel="stylesheet">
<script
        src="${path }/res/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<body>


    <div class="panel panel-default">
        <!-- Default panel contents -->
        <div class="panel-heading">员工信息</div>

        <!-- Table -->
        <table class="table">
            <tr>
                <td align = "center">ID</td>
                <td align = "center">姓名</td>
                <td align = "center">性别</td>
                <td align = "center">邮箱</td>
                <td align = "center">所在部门</td>
                <td align = "center">操作</td>
            </tr>
            <c:forEach items="${list}" var="emp" varStatus="vs">
                <tr>
                    <td align = "center">${emp.id}</td>
                    <td align = "center">${emp.name}</td>
                    <td align = "center">${emp.gender}</td>
                    <td align = "center">${emp.email}</td>
                    <td align = "center">
                        <div class="btn-group" role="group" aria-label="...">
                            <button type="button" class="btn btn-warning dropdown-toggle ">修改</button>
                            <button type="button" class="btn  btn-danger">删除</button>
                            <button type="button" class="btn btn-info dropdown-toggle">详情</button>
                        </div>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
