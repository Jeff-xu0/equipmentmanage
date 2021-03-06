<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/17/017
  Time: 16:19
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
    <title>系统后台</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/main.css"/>
</head>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="index.html" class="navbar-brand">后台管理</a></h1>
            <ul class="navbar-list clearfix">
                <c:if test="${ident==true}">
                    <li><a class="on" href="${APP_PATH}/homePagemanageTrue">首页</a></li>
                </c:if>
                <c:if test="${ident==false}">
                    <li><a class="on" href="${APP_PATH}/homePagemanageFalse">首页</a></li>
                </c:if>
                <%--                <li><a href="#" target="_blank">网站首页</a></li>--%>
            </ul>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
                <li><a href="#">${sessionScope.loginuser.uername}</a></li>
                <li><a href="#">修改密码</a></li>
                <li><a href="${APP_PATH}/exitManage">退出</a></li>
            </ul>
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
                    <ul class="sub-menu">
                        <c:if test="${ident==true}">
                            <li><a href="${APP_PATH}/userList"><i class="icon-font">&#xe008;</i>用户管理 </a></li>
                            <li><a href="${APP_PATH}/homePagemanageTrue"><i class="icon-font">&#xe004;</i>资料管理</a></li>
                            <li><a href="${APP_PATH}/homePagemanageTrue"><i class="icon-font">&#xe006;</i>分类管理</a></li>
                        </c:if>
                        <c:if test="${ident==true}">
                            <li><a href="${APP_PATH}/homePagemanageTrue"><i class="icon-font">&#xe005;</i>图书借阅</a></li>
                            <li><a href="${APP_PATH}/forget/updatePass"><i class="icon-font">&#xe052;</i>修改密码</a></li>
                            <li><a href="${APP_PATH}/workmanage"><i class="icon-font">&#xe033;</i>广告管理</a></li>
                        </c:if>
                        <c:if test="${ident==false}">
                            <li><a href="${APP_PATH}/homePagemanageFalse"><i class="icon-font">&#xe005;</i>图书借阅</a></li>
                            <li><a href="${APP_PATH}/forget/updatePass"><i class="icon-font">&#xe052;</i>修改密码</a></li>
                            <li><a href="${APP_PATH}/workmanage"><i class="icon-font">&#xe033;</i>广告</a></li>
                        </c:if>
                    </ul>
                </li>
                <li>
                    <c:if test="${ident==true}">
                        <a href="#"><i class="icon-font">&#xe018;</i>系统管理</a>
                        <ul class="sub-menu">
                            <li><a href="${APP_PATH}/systemSettingsTrue"><i class="icon-font">&#xe017;</i>系统设置</a></li>
                            <li><a href="${APP_PATH}/systemSettingsTrue"><i class="icon-font">&#xe037;</i>清理缓存</a></li>
                            <li><a href="${APP_PATH}/systemSettingsTrue"><i class="icon-font">&#xe046;</i>数据备份</a></li>
                            <li><a href="${APP_PATH}/systemSettingsTrue"><i class="icon-font">&#xe045;</i>数据还原</a></li>
                        </ul>
                    </c:if>
                </li>
            </ul>
        </div>
    </div>

    <!--/sidebar-->
    <div class="main-wrap">
        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="homePagemanage">首页</a><span class="crumb-step">&gt;</span><span
                    class="crumb-name">系统设置</span></div>
        </div>
        <div class="result-wrap">
            <form action="#" method="post" id="myform" name="myform">
                <div class="config-items">
                    <div class="config-title">
                        <h1><i class="icon-font">&#xe00a;</i>网站信息设置</h1>
                    </div>
                    <div class="result-content">
                        <table width="100%" class="insert-tab">
                            <tbody>
                            <tr>
                                <th width="15%"><i class="require-red">*</i>域名：</th>
                                <td><input type="text" value="#" size="85" name="keywords" class="common-text"></td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>站点标题：</th>
                                <td><input type="text" value="『前端迷』-专注于前端领域的探索与实践" size="85" name="title"
                                           class="common-text"></td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>关键字：</th>
                                <td><input type="text"
                                           value="前端, 前端设计, 前端开发, 设计, 开发, 前端资源, CSS, JavaScript, Ajax, Html5" size="85"
                                           name="keywords" class="common-text"></td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>描述：</th>
                                <td><input type="text" value="『前端迷』，分享前端设计资源和前端开发技术的专业博客！" size="85" name="description"
                                           class="common-text"></td>
                            </tr>
                            <tr>
                                <th></th>
                                <td>
                                    <input type="submit" value="提交" class="btn btn-primary btn6 mr10">
                                    <input type="button" value="返回" onClick="history.go(-1)" class="btn btn6">
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
                <div class="config-items">
                    <div class="config-title">
                        <h1><i class="icon-font">&#xe014;</i>站长信息设置</h1>
                    </div>
                    <div class="result-content">
                        <table width="100%" class="insert-tab">
                            <tr>
                                <th width="15%"><i class="require-red">*</i>网站联系邮箱：</th>
                                <td><input type="text" value="monkey@lmonkey.com" size="85" name="email"
                                           class="common-text"></td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>联系人：</th>
                                <td><input type="text" value="学习猿地" size="85" name="contact" class="common-text"></td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>联系电话：</th>
                                <td><input type="text" value="123456" size="85" name="phone" class="common-text"></td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>备案ICP：</th>
                                <td><input type="text" value="哥在北京" size="85" name="icp" class="common-text"></td>
                            </tr>
                            <tr>
                                <th><i class="require-red">*</i>地址：</th>
                                <td><input type="text" value="中国 • 北京" size="85" name="address" class="common-text">
                                </td>
                            </tr>
                            <tr>
                                <th></th>
                                <td>
                                    <input type="hidden" value="siteConf.inc.php" name="file">
                                    <input type="submit" value="提交" class="btn btn-primary btn6 mr10">
                                    <input type="button" value="返回" onClick="history.go(-1)" class="btn btn6">
                                </td>
                            </tr>
                        </table>
                    </div>
                </div>
            </form>
        </div>
    </div>
    <!--/main-->
</div>
</body>
</html>