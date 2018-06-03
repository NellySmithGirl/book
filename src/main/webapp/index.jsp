<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath(); %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <script type="text/javascript" src="${path}/res/js/jquery-1.12.4.min.js"></script>
    <form action="#" >
        <label for="account">账号</label>
        <input type="text" name="account" id="account"  >
        <label for="passWord">账号</label>
        <input type="password" name="passWord" id="passWord"  >
        <button onclick="submitLoing()">登录</button>
    </form>
<script>
    function submitLoing() {
        var account=$('#account').val();
        var passWord=$('#passWord').val();
        $.ajax({
            url:'${path}/user/login',
            type: 'POST',  // 请求类型
            data: {'account':account,'passWord':passWord},  // post时请求体
            dataType: 'json',  // 返回请求的类型，有text/json两种
            contentType: 'application/x-www-form-urlencoded',
            success: function (data) {
                window.console.log(data);
            },  // 请求成功回调函数
            fail: function (err) {

            }// 请求失败回调
        });
    }
</script>
</body>
</html>