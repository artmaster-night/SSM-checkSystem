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
<script type="text/javascript" src="../js/bootstrap.min.js"></script>
<script type="text/javascript">
    $(function () {
        flush();
        $("#btn_submit").on("click",function () {
            const checkId=$(this).attr("checkId");
            const password=$("#password").val();
            const sId=${sessionScope.student.id};
            console.log("cId"+checkId+"     password"+password+"    sID"+sId);
            $.post("${pageContext.request.contextPath}/scheck/addCheck",{checkId:checkId,password:password,sId:sId},function (data) {
                $("#btn_close").click();
                alert(data.message);
                flush();
            })
        })
        $("#refresh").on("click",flush)
    })
    function flush() {
        $.post("${pageContext.request.contextPath}/scheck/refreshCheckList",{sId:${sessionScope.student.id}},function (dataList) {
            $("#checkList").empty();
            $.each(dataList,function (i,data) {
                var checkDiv = $("<div></div>").addClass("checkItem").addClass("p-4").addClass("rounded");
                var courseName = $("<span></span>").append(data.courseName);
                var teacherName = $("<span></span>").append(data.teacherName);
                var startTime = $("<span></span>").append(getMyDate(data.startTime));
                var endTime = $("<span></span>");
                var btn = $("<button></button>").addClass("btn").addClass("btn-primary").addClass("ms-4").attr("type","button");
                if (data.ifCheck){
                    endTime.append(getMyDate(data.endTime));
                    btn.append("已签到").attr("disabled",true);
                }else {
                    btn.attr("data-bs-toggle","modal")
                    btn.attr("data-bs-target","#exampleModal")
                    btn.attr("checkId",data.checkId);
                    btn.addClass("checkBtn")
                    btn.append("签到")
                }
                $("#checkList").append(checkDiv.append(courseName,teacherName,startTime,endTime,btn))
            })
            $(".checkBtn").on("click",function () {
                const checkId=$(this).attr("checkId");
                $("#btn_submit").attr("checkId",checkId);
            })
        },"json")
    }

    function getMyDate(str){
        const oDate = new Date(str),
            oYear = oDate.getFullYear(),
            oMonth = oDate.getMonth() + 1,
            oDay = oDate.getDate(),
            oHour = oDate.getHours(),
            oMin = oDate.getMinutes(),
            oSen = oDate.getSeconds();//最后拼接时间
        return oYear + '-' + getzf(oMonth) + '-' + getzf(oDay) + ' ' + getzf(oHour) + ':' + getzf(oMin) + ':' + getzf(oSen);
    }
    //补0操作
    function getzf(num){
        if(parseInt(num) < 10){
            num = '0'+num;
        }
        return num;
    }
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
        width: 75%;
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
        <button type="button" class="btn btn-primary ms-3" id="refresh">刷新</button>
    </div>
    <div class="bodyDiv rounded">

        <div class="lookCheck mx-4 pt-2" id="checkList">

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
                    <button type="button" class="btn btn-primary" id="btn_submit">提交</button>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>
