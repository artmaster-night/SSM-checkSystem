<%--
  Created by IntelliJ IDEA.
  User: artmaster
  Date: 2022/3/30
  Time: 20:29
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
    $(function (events, handler) {
        flush();
        $("#flushBtn").on("click",flush);
    })
    function flush() {
        $.post("${pageContext.request.contextPath}/tcheck/getCheckList",{checkId:${requestScope.get("checkId")}},function (dataList) {
            $("#checkList>tbody").empty();
            $.each(dataList,function (i,data) {
                const id = $("<th></th>").append(data.id).attr("scope","row");
                const name = $("<td></td>").append(data.name);
                const ifCheck = $("<td></td>").append(data.ifCheck);
                $("#checkList>tbody").append($("<tr></tr>").append(id,name,ifCheck));
            })
        },"json")
    }
</script>
<%--<tr>--%>
<%--    <th scope="row">1</th>--%>
<%--    <td>Mark</td>--%>
<%--    <td>已签到</td>--%>
<%--</tr>--%>
<style>
    a{
        text-decoration: none;
        color: mediumpurple;
    }
</style>
<body>
<div class="container">
    <nav aria-label="breadcrumb" class="mt-3">
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="${pageContext.request.contextPath}/jsp/teacherIndex.jsp">Home</a></li>
            <li class="breadcrumb-item active" aria-current="page">CheckList</li>
        </ol>
    </nav>
    <button type="button" class="btn btn-primary" id="flushBtn">刷新</button>
    <div class="w-75">
        <table class="table table-hover" id="checkList">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">姓名</th>
                <th scope="col">是否签到</th>
            </tr>
            </thead>
            <tbody>

            </tbody>
        </table>
    </div>
</div>
</body>
</html>
