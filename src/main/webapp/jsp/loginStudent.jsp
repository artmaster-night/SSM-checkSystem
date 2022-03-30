<%--
  Created by IntelliJ IDEA.
  User: artmaster
  Date: 2022/3/30
  Time: 15:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<link rel="stylesheet" href="../css/bootstrap.min.css"/>
<script type="text/javascript" src="../js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("#btn-register").on("click",function () {
            const account=$("#account").val();
            const password=$("#Password").val();
            $.post("${pageContext.request.contextPath}/stu/register",{account:account,password:password},registerSucceed,"json")
        })
        $("#btn-login").on("click",function () {
            const account=$("#account").val();
            const password=$("#Password").val();
            $.post("${pageContext.request.contextPath}/stu/login",{account:account,password:password},loginSucceed,"json")
        })
    })
    function registerSucceed(data) {
        alert(data.message);
    }
    function loginSucceed({flag, message}) {
        alert(message);
        if (flag){
            $(window).attr("location","studentIndex.jsp")
        }
    }
</script>
<body>
<div class="container d-flex justify-content-center">
    <div class="mt-4 w-50 justify-content-center d-flex">
        <form class="w-50">
            <div class="form-group mb-3">
                <input class="form-control" id="account" placeholder="用户名" type="text">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" id="Password" placeholder="密码">
            </div>
            <button type="button" class="btn btn-primary ms-5 mt-2" id="btn-login">登录</button>
            <button type="button" class="btn btn-primary ms-5 mt-2" id="btn-register">注册</button>
        </form>
    </div>
</div>
</body>
</html>
