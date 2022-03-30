<%--
  Created by IntelliJ IDEA.
  User: artmaster
  Date: 2022/3/30
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<link href="../css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="../js/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
    $(function () {
        updateClassList()
        $("#btn-add").on("click",function () {
            $(".lookCheck").hide()
            $(".addCheck").show()

        })
        $("#btn-look").on("click",function () {
            $(".lookCheck").show()
            $(".addCheck").hide()
        })
    })
    function updateClassList() {
        $.post("${pageContext.request.contextPath}/tcheck/updateCourseList",{tId:${sessionScope.teacher.id}},function (courseList) {
            $("#courseList").empty()
            $.each(courseList,function (i,course) {
                $("#courseList").append("<option>"+course.name+"</option>")
            })
        },"json")
    }
    function x() {
        
    }
</script>
<style>
    .bodyDiv {
        background-color: #e6dbb9;
        padding-bottom: 40px;
    }
    .lookCheck{
        display: none;
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
        <span>欢迎您！${sessionScope.teacher.name}</span><span class="ms-2"><a href="index.jsp">[退出登录]</a></span>
    </nav>
    <div class="p-2  mt-4">
        <button type="button" class="btn btn-primary ms-3" id="btn-add">发布签到</button>
        <button type="button" class="btn btn-primary ms-2" id="btn-look">查看签到</button>
    </div>
    <div class="bodyDiv rounded">
        <div class="row mx-4 pt-3 addCheck">
            <div class="col-2">
                <label for="courseList">课程</label>
                <select class="form-control" id="courseList">
                    <option>语文</option>
                    <option>数学</option>
                    <option>C++</option>
                </select>
            </div>
            <div class="col-2">
                <label for="password">密码</label>
                <input type="password" class="form-control" placeholder="签到密码" id="password">
            </div>
            <div class="col-2">
                <label for="rePassword">确认密码</label>
                <input type="password" class="form-control" placeholder="请确认..." id="rePassword">
            </div>
            <div class="col-2 offset-2">
                <button type="button" class="btn btn-primary mt-4">发布</button>
            </div>
        </div>
        <div class="lookCheck mx-4 pt-2">
            <div class="checkItem p-4 rounded">
                <span class="checkSubject">数学</span>
                <span class="checkTime">2020.2.3/13.48</span>
                <span>56/89</span>
                <span><a href="checkList.jsp" class="look">查看详情</a></span>
                <span><a href="#" class="delete">删除签到</a></span>
            </div>
            <div class="checkItem p-4 rounded">
                <span class="checkSubject">数学</span>
                <span class="checkTime">2020.2.3/13.48</span>
                <span>56/89</span>
                <span><a href="checkList.jsp" class="look">查看详情</a></span>
                <span><a href="#" class="delete">删除签到</a></span>
            </div>
        </div>

    </div>
</div>
</body>
</html>