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
            <c:forEach items="${list}" var="emp" >
                <tr>
                    <td align = "center">${emp.id}</td>
                    <td align = "center">${emp.name}</td>
                    <td align = "center">${emp.gender}</td>
                    <td align = "center">${emp.email}</td>
                    <td align = "center">
                        <div class="btn-group" role="group" aria-label="...">
                            <button type="button" class="btn btn-warning dropdown-toggle " onclick="updateById(${emp.id})">修改</button>
                            <button type="button" class="btn  btn-danger" onclick="deleteById(${emp.id})">删除</button>
                            <button type="button" class="btn btn-info dropdown-toggle" onclick="showById(${emp.id})">详情</button>
                        </div>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>

    <!-- 模态框 -->
    <div id="myModal" class="modal fade" tabindex="-1" role="dialog">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                    <h4 class="modal-title">员工详情</h4>
                </div>
                <div id="modal-body" class="modal-body">

                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary">保存</button>
                </div>
            </div><!-- /.modal-content -->
        </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->

    <script>
        $(function(){
            $('#myModal').modal('hide');
        });
        function updateById(id) {

        }

        function showById(id) {
            $("#myModal").modal("show");
            $.ajax({
                url:"${path}/emp/showById",
                data:{"id":id},
                type:"post",
                success:function (data) {
                    console.log(${path});
                }
            });
        }

        function deleteById(id) {
            $.ajax({
                url:"${path}/emp/deleteById",
                data:{"id":id},//{"id":id}改
                type:"post",
                success:function (data) {
                    if(data==true){
                        alert("删除成功");
                        window.location.reload();
                    }else {
                        alert("删除失败")
                    }
                }
            });
        }
    </script>
</body>
</html>
