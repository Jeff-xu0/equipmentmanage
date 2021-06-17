<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/15/015
  Time: 22:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
             pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <script src="${APP_PATH}/static/js/jquery-3.5.1.min.js" ></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>登录</title>
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/public.css"/>
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/login.css"/>
    <style type="text/css">
        .login {
            width: 100%;
            height: 100%;
            background: url("${APP_PATH}/static/images/19.jpg") no-repeat;
            background-size: 100% 100%;
        }
    </style>
</head>
<body>
<div class="login" >
    <form action="${APP_PATH}/ident/login" method="post"><h2><a href="index.jsp"><img src="${APP_PATH}/static/images/logo.jpg"></a></h2>
        <p></p>
        <div class="msg-warn hide"><b></b>Automatic login is not recommended in public places to prevent account loss</div>
        <p><input class="username" type="text" name="username" value="" placeholder="Username/Phone/Email"></p>
        <p><input class="userpass" type="text" name="password" value="" placeholder="Password"></p>
        <p><input type="submit" name="" value="Sign in" onclick="return isempty();"></p>
        <p class="txt"><a class="" href="reg.jsp">Sign up for free</a><a href="forget.jsp">Find your password</a></p></form>
</div>
<script>
    function isempty() {
        if ($(".username").val()==""||$(".userpass").val()==""){
            alert("请输入完整信息！");
            return false;
        }
        if ($(".userpass").val().length<5){
            $(".userpass").val("");
            $(".userpass").attr("placeholder","密码长度不能小于5");
            return false;
        }
        return true;
    }
</script>
</body>
</html>
