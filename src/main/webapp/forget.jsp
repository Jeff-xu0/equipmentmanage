<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>找回密码</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <script src="static/js/jquery-3.5.1.min.js"></script>

    <script src="./static/js/public.js" type="text/javascript" charset="utf-8"></script>
    <script src="./static/js/pro.js" type="text/javascript" charset="utf-8"></script>
    <script src="${APP_PATH}/static/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="${APP_PATH}/static/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="./static/css/forget.css"/>
    <style type="text/css">
        #top1{
            height: 200px;
        }

    </style>
</head>
<body>
<div id="top1"></div>
<div class="container" align="center"><!-----------------logo------------------->

    <form class="form-inline" action="${APP_PATH}/ident/findpass" method="post">
        <div class="row">
            <div class="col-md-4"></div>
            <div class="page-header">
            <h1><small> Find your password</small></h1>
            </div>
        </div>
<%--        <div class="row">--%>
<%--            <div class="col-md-3"></div>--%>
<%--            <div class="col-md-4"></div>--%>
<%--&lt;%&ndash;            <div class="col-md-2"></div>&ndash;%&gt;--%>
<%--        </div>--%>
        <div class="row">
            <div class="col-md-4"></div>
            <div class="form-group col-md-4">
                <label class="sr-only" for="exampleInputEmail3">Email address</label>
                <input type="text" class="form-control" id="exampleInputEmail3" name="uername" placeholder="Email\phonenumber\username">
            </div>
            <div class="col-md-4"></div>
        </div><br>
        <div class="row">
            <div class="col-md-4"></div>
            <div class="form-group col-md-4">
                <label class="sr-only" for="exampleInputPassword3">Password</label>
                <input type="password" class="form-control" id="exampleInputPassword3" name="uerpassword" placeholder="Password">
            </div>
            <div class="col-md-4"></div>
        </div><br>
        <div class="row">
            <div class="col-md-4"></div>
            <div class="form-group col-md-4">
                <label class="sr-only" for="exampleInputPassword3">Password</label>
                <input type="password" class="form-control" id="passagain" placeholder="PasswordAgain">
            </div>
            <div class="col-md-4"></div>
        </div><br><br>

       <button type="submit" class="btn btn-default btn-sm active " onclick="return isempty();">确 定</button>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<%--        <%String rec = request.getHeader("REFERER");%>--%>

<%--        <input type="button" οnclick="javascript:window.location='<%=rec%>'">--%>
        <button type="button" class="btn btn-default btn-sm active " onclick="history.back(-1)">返 回</button>
    </form>

</div>
<script>
    function isempty() {
        if ($("#exampleInputEmail3").val()==null||$("#exampleInputPassword3").val()==""||$("#passagain").val()==null){
            alert("请输入完整信息！");
            return false;
        }
        if ($("#exampleInputPassword3").val()!=$("#passagain").val()){
            $("#exampleInputPassword3").val("");
            $("#passagain").val("");
            $("#exampleInputPassword3").attr("placeholder","两次密码不一致");
            $("#passagain").attr("placeholder","两次密码不一致");
            return false;
        }
        return true;
    }
</script>
</body>
</html>
