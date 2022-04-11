<%--
  Created by IntelliJ IDEA.
  User: artmaster
  Date: 2022/3/28
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.6.0.min.js"></script>
<link type="text/css"  rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
<script type="text/javascript">
    $(function () {
        $("#btn-stu").on("click",function () {
            $(window).attr("location","${pageContext.request.contextPath}/jsp/loginStudent.jsp")
        })
        $("#btn-teach").on("click",function () {
            $(window).attr("location","${pageContext.request.contextPath}/jsp/loginTeacher.jsp")
        })
    })
</script>
<body>
<div class="container d-flex  justify-content-center">
    <div class="w-25  p-4">
        <div class="d-flex justify-content-center m-3">
            <button type="button" class="btn btn-primary" id="btn-stu">我是学生</button>
        </div>
        <div class="d-flex justify-content-center">
            <button type="button" class="btn btn-primary" id="btn-teach">我是老师</button>
        </div>
    </div>
</div>
</body>
</html>
