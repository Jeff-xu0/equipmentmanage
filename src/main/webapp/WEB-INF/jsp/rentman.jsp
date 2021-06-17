<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/17/017
  Time: 16:17
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>用户管理后台</title>
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/common.css"/>
    <link rel="stylesheet" type="text/css" href="${APP_PATH}/static/css/main.css"/>
    <style type="text/css">
        .row {
            margin-right: -15px;
            margin-left: -15px;
        }

        .table {
            width: 100%;
            max-width: 100%;
            margin-bottom: 20px;
        }

        .col-md-6 {
            width: 50%;
        }

        .pagination {
            display: inline-block;
            padding-left: 0;
            margin: 20px 0;
            border-radius: 4px;
        }

        .pagination > li {
            display: inline;
        }

        .pagination > li > a,
        .pagination > li > span {
            position: relative;
            float: left;
            padding: 6px 12px;
            margin-left: -1px;
            line-height: 1.42857143;
            color: #337ab7;
            text-decoration: none;
            background-color: #fff;
            border: 1px solid #ddd;
        }

        .pagination > li:first-child > a,
        .pagination > li:first-child > span {
            margin-left: 0;
            border-top-left-radius: 4px;
            border-bottom-left-radius: 4px;
        }

        .pagination > li:last-child > a,
        .pagination > li:last-child > span {
            border-top-right-radius: 4px;
            border-bottom-right-radius: 4px;
        }

        .pagination > li > a:hover,
        .pagination > li > span:hover,
        .pagination > li > a:focus,
        .pagination > li > span:focus {
            z-index: 2;
            color: #23527c;
            background-color: #eee;
            border-color: #ddd;
        }

        .pagination > .active > a,
        .pagination > .active > span,
        .pagination > .active > a:hover,
        .pagination > .active > span:hover,
        .pagination > .active > a:focus,
        .pagination > .active > span:focus {
            z-index: 3;
            color: #fff;
            cursor: default;
            background-color: #337ab7;
            border-color: #337ab7;
        }

        .pagination > .disabled > span,
        .pagination > .disabled > span:hover,
        .pagination > .disabled > span:focus,
        .pagination > .disabled > a,
        .pagination > .disabled > a:hover,
        .pagination > .disabled > a:focus {
            color: #777;
            cursor: not-allowed;
            background-color: #fff;
            border-color: #ddd;
        }

        .btn .label {
            position: relative;
            top: -1px;
        }

        .btn-primary {
            color: #fff;
            background-color: #337ab7;
            border-color: #2e6da4;
        }

        .btn-sm,
        .btn-group-sm > .btn {
            padding: 5px 10px;
            font-size: 12px;
            line-height: 1.5;
            border-radius: 3px;
        }

        .glyphicon {
            position: relative;
            top: 1px;
            display: inline-block;
            font-family: 'Glyphicons Halflings';
            font-style: normal;
            font-weight: normal;
            line-height: 1;

            -webkit-font-smoothing: antialiased;
            -moz-osx-font-smoothing: grayscale;
        }

        .btn-danger {
            color: #fff;
            background-color: #d9534f;
            border-color: #d43f3a;
        }

        .glyphicon-trash:before {
            content: "\e020";
        }

        .glyphicon-pencil:before {
            content: "\270f";
        }

        .dropdown {

            position: relative;

            display: inline-block;

        }

        .dropdown-content {

            display: none;

            position: absolute;

            background-color: rgba(0, 0, 0, 0.3);

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
                <li><a class="on" href="${APP_PATH}/forward/homeForward">首页</a></li>
                <%--                <li><a href="#" target="_blank">网站首页</a></li>--%>
            </ul>
        </div>
        <div class=" top-info-wrap dropdown">
            <ul class="top-info-list clearfix">
                <li><a class="dropbtn">${sessionScope.login.username}</a></li>
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
        </div>
        <div style="margin-top: 598px;"></div>
    </div>

    <!--/sidebar-->
    <div class="main-wrap" style="background-image: url('/static/images/20.jpg');height: auto;width: auto;">

        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font"></i><a href="${APP_PATH}/forward/homeForward">首页</a><span
                    class="crumb-step">&gt;</span><span
                    class="crumb-name">用户管理</span></div>
        </div>
        <div class="search-wrap">
            <div class="search-content">
                <form action="${APP_PATH}/service/selectiverent" method="post">
                    <table class="search-tab">
                        <tr>
                            <th width="120">选择分类:</th>
                            <td>
                                <select name="selective" id="">
                                    <option value="rentdepartid">部门编号</option>
                                    <option value="rentmanid">经手人员</option>
                                </select>
                            </td>
                            <th width="70">关键字:</th>
                            <td><input class="common-text" placeholder="请输入完整关键字" name="keywords" value="" type="text">
                            </td>
                            <td><input class="btn btn-primary btn2" name="sub" value="查询" type="submit"></td>
                        </tr>
                    </table>
                </form>
            </div>
        </div>
        <div class="result-wrap">
            <div class="result-title">
                <h1>快捷操作</h1>
            </div>
            <div class="result-content">
                <div class="short-wrap">
                    <c:if test="${sessionScope.login.departid==1}">
                        <a href="${APP_PATH}/forward/adduserForward"><i class="icon-font"></i>新增用户</a>
                    </c:if>
                    <%--                    <a href="insert.html"><i class="icon-font">&#xe048;</i>新增作品分类</a>--%>
                    <%--                    <a href="insert.html"><i class="icon-font">&#xe041;</i>新增博客分类</a>--%>
<%--                    <a href="#"><i class="glyphicon glyphicon-cloud"></i>作品评论</a>--%>
                </div>
            </div>
        </div>
        <div class="result-wrap">
            <form name="myform" id="myform" method="get">
                <div class="result-content">
                    <table class="result-tab" width="100%">
                        <thead>
                        <tr>
                            <%--                            <th class="tc" width="5%"><input class="allChoose" name="" type="checkbox"></th>--%>
                            <th>部门编号</th>
                            <th>经手人员</th>
                            <th>用途</th>
                            <th>归还时间</th>
                            <th>操作</th>
                        </tr>
                        </thead>
                        <tbody>

                        <c:forEach items="${pageInfo.list}" var="rent">
                            <tr>
                                    <%--<td class="tc"><input name="id[]" value="59" type="checkbox"></td>--%>
                                    <%--                            <td>--%>
                                    <%--                                <input name="ids[]" value="59" type="hidden">--%>
                                    <%--                                <input class="common-input sort-input" name="ord[]" value="0" type="text">--%>
                                    <%--                            </td>--%>
                                <td>${rent.rentdepid==1?"管理部":"其他部"}</td>
                                <td title="${rent.rentmanid}">
                                    <label><a target="_blank" href="${APP_PATH}/service/usermanage/${rent.rentmanid}"
                                              title="${rent.rentmanid}">[--${rent.rentmanid}--]</a></label>
                                </td>
                                <td>${rent.rentuse}</td>
                                <td>
                                    <fmt:formatDate value="${rent.returntime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                                <td>

                                    <button class="btn btn-primary btn-sm edit_btn">
                                        <span class="glyphicon glyphicon-pencil"><a style="color: whitesmoke"
                                                                                    href="${APP_PATH}/forward/toEdituserForward/${rent.rentdepid}">编辑</a></span>
                                    </button>&nbsp;&nbsp;
                                    <button class="btn btn-danger btn-sm delete_btn">
                                        <span class="glyphicon glyphicon-trash"><a class="deleteuser"
                                                                                   style="color: whitesmoke"
                                                                                   href="${APP_PATH}/service/deleteUser/${rent.rentdepid}"
                                                                                   onclick="return isdelete();">删除</a></span>
                                    </button>

                                </td>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                </div>
            </form>
            <div class="row">
                <table class="table">
                    <tr>
                        <th>
                            <div class="col-md-6">
                                当前${pageInfo.pageNum}页，总共${pageInfo.pages}页，共${pageInfo.total}条记录
                            </div>
                        </th>
                        <th>
                            <div class="col-md-offset-2">
                                <span style="color: red;">${error}</span>
                            </div>
                        </th>
                        <th>
                            <div class="col-md-6">
                                <nav aria-label="Page navigation">
                                    <ul class="pagination">
                                        <li class="active">
                                            <a href="${pageContext.request.contextPath}/service/rentPageJump?pn=${pageInfo.firstPage}">首页</a>
                                        </li>
                                        <c:if test="${pageInfo.hasPreviousPage}">
                                            <li>
                                                <a href="${pageContext.request.contextPath}/service/rentPageJump?pn=${pageInfo.pageNum-1}"
                                                   aria-label="Previous">
                                                    <span aria-hidden="true">&laquo;</span>
                                                </a>
                                            </li>
                                        </c:if>
                                        <c:forEach items="${pageInfo.navigatepageNums}" var="num">
                                            <c:if test="${num == pageInfo.pageNum}">
                                                <li class="active"><a href="#">${num}</a></li>
                                            </c:if>
                                            <c:if test="${num != pageInfo.pageNum}">
                                                <li>
                                                    <a href="${pageContext.request.contextPath}/service/rentPageJump?pn=${num}">${num}</a>
                                                </li>
                                            </c:if>
                                        </c:forEach>
                                        <c:if test="${pageInfo.hasNextPage}">
                                            <li>
                                                <a href="${pageContext.request.contextPath}/service/rentPageJump?pn=${pageInfo.pageNum+1}"
                                                   aria-label="Next">
                                                    <span aria-hidden="true">&raquo;</span>
                                                </a>
                                            </li>
                                        </c:if>
                                        <li class="active">
                                            <a href="${pageContext.request.contextPath}/service/rentPageJump?pn=${pageInfo.lastPage}">末页</a>
                                        </li>

                                    </ul>
                                </nav>
                            </div>
                        </th>
                    </tr>
                </table>
            </div>
            <div class="result-wrap" style="margin-top: 480px;">
                <div class="result-title">
                    <h1>使用帮助</h1>
                </div>
                <div class="result-content">
                    <ul class="sys-info-list">
                        <li>
                            <label class="res-lab">更多信息：</label><span class="res-info"><a href="http://www.baidu.com/"
                                                                                          target="_blank">关于</a></span>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

    </div>
    <!--/main-->
</div>
<script type="text/javascript">
    function isdelete() {
        //prompt函数点击返回按钮返回的是null
        if (window.confirm("删除是不可逆的，确定删除吗？")) {
            //点击的是“确定”
            return true;
        } else {
            //点击的是“取消”
            return false;
        }
    }
</script>
</body>
</html>
