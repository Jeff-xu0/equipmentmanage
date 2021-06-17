<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/17/017
  Time: 16:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <title>用户编辑</title>
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/main.css"/>
    <style type="text/css">
        .dropdown {

            position: relative;

            display: inline-block;

        }

        .dropdown-content {

            display: none;

            position: absolute;

            background-color: rgba(0,0,0,0.3);

            min-width: 10px;

            z-index: 1;
            border-radius: 5px;

            box-shadow: 4px 4px 10px #909090;

            text-align: center;
        }

        .dropdown-content a {

            color: black;

            padding: 1px 1px;

            text-decoration: none;

            /*display: block;*/
            border-radius: 5px;
            font-size: 15px;
        }

        .dropdown-content a:hover {
            background-color: white;
        }

        .dropdown:hover .dropdown-content {
            display: block;
        }
    </style>
</head>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="index.html" class="navbar-brand">后台管理</a></h1>
            <ul class="navbar-list clearfix">
                <li><a class="on" href="${APP_PATH}/forward/homeForward" >首页</a></li>

                <%--                <li><a href="#" target="_blank">网站首页</a></li>--%>
            </ul>
        </div>
        <div class=" top-info-wrap dropdown">
            <ul class="top-info-list clearfix">
                <li><a  class="dropbtn">${sessionScope.login.username}</a></li>
            </ul>
            <div class="dropdown-content">
                <ul>
                    <li><a href="${APP_PATH}/forward/tomainabout">个人主页</a></li>
                    <li><a href="${APP_PATH}/forward/forgetForward">修改密码</a></li>
                    <li><a href="${APP_PATH}/forward/exitForward" class="outbtn">退出</a></li>
                </ul>
            </div>
        </div>
    </div>
</div>
<div class="container clearfix">
    <div class="sidebar-wrap">
        <div class="sidebar-title">
            <h1>菜单</h1>
        </div>
        <div class="sidebar-content">
            <ul class="sidebar-list">
                <li>
                    <a href="#"><i class="icon-font">&#xe003;</i>常用操作</a>
                    <ul class="sidebar-list">
                        <li>
                            <a href="#"><i class="icon-font">&#xe003;</i>常用操作</a>
                            <ul class="sub-menu">
                                <c:if test="${sessionScope.login.departid==1}">
                                    <li><a href="${APP_PATH}/forward/userForward"><i class="icon-font">&#xe005;</i>用户管理 </a>
                                    </li>
                                    <li><a href="${APP_PATH}/forward/homeForward"><i class="icon-font">&#xe052;</i>器材管理</a></li>
                                    <li><a href="${APP_PATH}/forward/toRentman"><i class="icon-font">&#xe052;</i>转借管理</a></li>
                                </c:if>
                                <li><a href="${APP_PATH}/forward/homeForward"><i class="icon-font">&#xe005;</i>器材借用</a></li>
                                <li><a href="${APP_PATH}/forward/toRepair"><i class="icon-font">&#xe005;</i>设备修理</a></li>
                                <li><a href="${APP_PATH}/forward/toDamage"><i class="icon-font">&#xe005;</i>报废设备</a></li>
                                <li><a href="${APP_PATH}/forward/forgetForward"><i class="icon-font">&#xe052;</i>修改密码</a></li>
                            </ul>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
        <div style="margin-top: 598px;"></div>
    </div>

    <!--/sidebar-->
    <div class="main-wrap" style="background-image: url('/static/images/20.jpg');height: auto;width: auto;">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="${APP_PATH}/forward/homeForward">首页</a><span class="crumb-step">&gt;</span><a
                    class="crumb-name" href="${APP_PATH}/forward/homeForward">器材管理</a><span class="crumb-step">&gt;</span><span>器材编辑</span>
            </div>
        </div>
        <div class="result-wrap">
            <div class="result-title">
                <h1>快捷操作</h1>
            </div>
            <div class="result-content">
                <div class="short-wrap">
                    <c:if test="${sessionScope.login.departid==1}">
<%--                        <a href="${APP_PATH}/forward/adduserForward"><i class="icon-font"></i>新增用户</a>--%>
                    </c:if>
                    <%--                    <a href="insert.html"><i class="icon-font">&#xe048;</i>新增作品分类</a>--%>
                    <%--                    <a href="insert.html"><i class="icon-font">&#xe041;</i>新增博客分类</a>--%>
<%--                    <a href="#"><i class="glyphicon glyphicon-cloud"></i>作品评论</a>--%>
                </div>
            </div>
        </div>
        <div class="result-wrap" style="margin-top: 100px">
            <div class="result-content">
                <form action="${APP_PATH}/service/updateuser" method="post" name="myform">
                    <table class="insert-tab" width="100%">
                        <tbody>
                        <tr>
                            <th width="120"><i class="require-red">*</i>编号：</th>
                            <td>
                                <input class="common-text required" type="text" name="userid" size="30"
                                       value="${user.userid}" readonly="readonly"/>
                            </td>
                        </tr>
                        <tr>
                            <th width="120"><i class="require-red">*</i>名字：</th>
                            <td>
                                <input class="common-text required" type="text" name="username" size="30"
                                       value="${user.username}"/>
                            </td>
                        </tr>
                        <tr>
                            <th><i class="require-red">*</i>密码：</th>
                            <td>
                                <input class="common-text required" name="password" size="30"
                                       value="${user.password}" type="text"/>
                            </td>
                        </tr>
                        <tr>
                            <th><i class="require-red">*</i>电话：</th>
                            <td><input type="text" class="common-text required" name="phonenum" size="30"
                                       value="${user.phonenum}"/></td>
                        </tr>
                        <tr>
                            <th><i class="require-red">*</i>邮箱</th>
                            <td>
                                <input type="text" class="common-text required" name="email" size="30" value="${user.email}">
                            </td>
                        </tr>
                        <tr>
                            <th><i class="require-red">*</i>部门</th>
                            <td>
                                <input type="text" class="common-text required"  value="${user.departid==1?"管理部":"其他部"}" readonly="readonly">
                                <select name="departid">
<%--                                    <option name="departid" value="${user.departid}">${user.departid==1?"管理部":"其他部"}</option>--%>
                                    <option name="departid" value="1">管理部</option>
                                    <option name="departid" value="2">其他部</option>
                                </select>
<%--                                <label><input type="radio" name="departid" value="1">管理部</label>--%>
<%--                                <label><input type="radio" name="departid" value="2">其他部</label>--%>
                            </td>
                        </tr>
                        <tr>
                            <th><i class="require-red">*</i>所借器材编号</th>
                            <td>
                                <input type="text" class="common-text required" name="equid" size="30" value="${user.equid}">
                            </td>
                        </tr>
<%--                        <tr>--%>
<%--                            <th><i class="require-red">*</i>归还时间</th>--%>
<%--                            <td>--%>
<%--                                <input type="text" class="common-text required" name="prebacktime" size="30" value="${user.prebacktime}">--%>
<%--                            </td>--%>
<%--                        </tr>--%>
                        <tr>
                            <th></th>
                            <td>
                                <input class="btn btn-primary btn6 mr10" value="提交" type="submit">

                                <input class="btn btn6" onClick="history.go(-1)" value="返回" type="button">
                                <c:if test="${flag==true}">
                                    <label class="require-red">修改失败，请返回或重试！</label>
                                </c:if>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </form>
            </div>
        </div>

    </div>
    <!--/main-->
</div>
</body>
</html>
