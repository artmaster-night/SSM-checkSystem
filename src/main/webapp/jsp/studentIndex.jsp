<%--
  Created by IntelliJ IDEA.
  User: artmaster
  Date: 2022/3/30
  Time: 15:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<link rel="stylesheet" href="../css/bootstrap.min.css">
<script type="text/javascript" src="../js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
    $(function () {
        $("#btn_submit").on("click",function () {
            $("#btn_close").click()
        })
    })
</script>
<style>
    .bodyDiv {
        background-color: #e6dbb9;
        padding-bottom: 40px;
    }
    .checkItem{
        background-color: burlywood;
        margin-top: 30px;
        height: 80px;
        width: 65%;
    }
    .checkItem>span{
        margin-left: 30px;
    }
    a{
        text-decoration: none;
        color: mediumpurple;
    }
</style>
<body>
<div class="container">

    <nav aria-label="breadcrumb" class="mt-3">
        <ol class="breadcrumb">
            <li class="breadcrumb-item">Home</li>
        </ol>
        <span>欢迎您！${sessionScope.student.name}</span><span class="ms-2"><a href="${pageContext.request.contextPath}/scheck/logout">[退出登录]</a></span>
    </nav>
    <div class="p-2  mt-4">
        <button type="button" class="btn btn-primary ms-3" id="refresh ">刷新</button>
    </div>
    <div class="bodyDiv rounded">

        <div class="lookCheck mx-4 pt-2">
            <div class="checkItem p-4 rounded">
                <span class="checkSubject">数学</span>
                <span class="checkTeacher">刘华</span>
                <span class="checkTime">2020.2.3/13.48</span>
                <span class="checkTime">2020.2.3/13.48</span>
                <button type="button" class="btn btn-secondary ms-4" disabled>已签到</button>
            </div>
            <div class="checkItem p-4 rounded">
                <span class="checkSubject">数学</span>
                <span class="checkTeacher">刘华</span>
                <span class="checkTime">2020.2.3/13.48</span>
                <button type="button" class="btn btn-primary ms-4" data-bs-toggle="modal" data-bs-target="#exampleModal">签到</button>
            </div>
        </div>

    </div>
    <!-- Modal -->
    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">请输入签到密码</h5>
                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                </div>
                <div class="modal-body">
                    <input type="password" class="form-control" name="password" id="password" placeholder="密码...">
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary " id="btn_close" data-bs-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary " id="btn_submit">提交</button>
                </div>
            </div>
        </div>
    </div>

</div>

</body>
</html>
