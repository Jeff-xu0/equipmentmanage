<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/17/017
  Time: 16:15
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
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>主页</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <script src="${APP_PATH}/static/js/jquery-3.5.1.min.js"></script>
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

        .glyphicon-cloud:before {
            content: "\2601";
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

        .tck {
            position: absolute;
            background: rgba(255, 255, 255, 1);
            float: left;
            height: 200px;
            width: 200px;
            text-align: center;
            margin-top: 10%;
            margin-left: 40%;
            border-radius: 5px;
            box-shadow: 4px 4px 10px #909090;
        }

        .tck input[type="text"] {
            border-radius: 5px;
        }

        /*.tck input[type="button"]{*/
        /*    border-radius: 5px;*/
        /*}*/
    </style>
</head>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="${APP_PATH}/#" class="navbar-brand">后台管理</a></h1>
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
                <%--                <li>--%>
                <%--                    <c:if test="${sessionScope.login.departid==1}">--%>
                <%--                        <a href="#"><i class="icon-font">&#xe018;</i>系统管理</a>--%>
                <%--                        <ul class="sub-menu">--%>
                <%--                            <li><a href="${APP_PATH}/systemSettingsTrue"><i class="icon-font">&#xe017;</i>系统设置</a></li>--%>
                <%--                            <li><a href="${APP_PATH}/systemSettingsTrue"><i class="icon-font">&#xe037;</i>清理缓存</a></li>--%>
                <%--                            <li><a href="${APP_PATH}/systemSettingsTrue"><i class="icon-font">&#xe046;</i>数据备份</a></li>--%>
                <%--                            <li><a href="${APP_PATH}/systemSettingsTrue"><i class="icon-font">&#xe045;</i>数据还原</a></li>--%>
                <%--                        </ul>--%>
                <%--                    </c:if>--%>
                <%--                </li>--%>
            </ul>
        </div>
        <div style="margin-top: 598px;"></div>
    </div>

    <div class="tck">
        <div style="margin-top: 30%;">
            <form action="${APP_PATH}/service/addrepair" method="get">
                <label><span>请输入设备编号：</span><br>
                    <input type="text" id="btnid" name="equid" pattern="[0-9]{1,6}" placeholder="请输入1-6个数字"></label><br>
                <label><span>请输入报修原因:</span><br>
                    <input type="text" id="btnreson" name="reson" placeholder="请说明设备问题"></label><br>
                <label>
<%--                    <button class="btn-info"> onclick="sub()">提交</button>--%>
                    <input type="submit" class="btn-info" value="提交" onclick="return isempty();">
                </label>
                <label>
                    <input type="button" class="btn-info" onclick="tckhide()" value="取消" />
                </label>
            </form>
        </div>
    </div>

    <!--/sidebar-->
    <div class="main-wrap" style="background-image: url('/static/images/20.jpg');height: auto;width: auto;">
        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font">&#xe06b;</i><span>欢迎使用『土匪设备』管理程序，设备管理的首选站点。</span></div>
        </div>
        <div class="search-wrap">
            <div class="search-content">
                <form action="${APP_PATH}/service/selectequ" method="get">
                    <table class="search-tab">
                        <tr>
                            <th width="120">选择分类:</th>
                            <td>
                                <select name="selective" id="">
                                    <option value="equid">器材编号</option>
                                    <option value="euqname">器材名称</option>
                                </select>
                            </td>
                            <th width="70">关键字:</th>
                            <td>
                                <input class="common-text" placeholder="请输入完整的关键词" name="keywords" type="text">
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
                        <a href="${APP_PATH}/forward/addequbForward"><i class="icon-font">&#xe001;</i>新增器材</a>
                        <a href="${APP_PATH}/forward/adduserForward"><i class="icon-font">&#xe005;</i>新增用户</a>
                    </c:if>
                    <%--                    <a href="insert.html"><i class="icon-font">&#xe048;</i>新增作品分类</a>--%>
                    <%--                    <a href="insert.html"><i class="icon-font">&#xe041;</i>新增博客分类</a>--%>
                </div>
            </div>
        </div>


        <div class="result-wrap">
            <div class="result-title">
                <h1>系统基本信息</h1>
            </div>
            <div class="result-content">
                <table class="result-tab" width="100%">
                    <thead>
                    <tr>
                        <th class="tc" width="5%"><input class="allChoose" name="" type="checkbox"></th>
                        <th>设备编号</th>
                        <th>设备名称</th>
                        <th>设备种类</th>
                        <th>设备型号</th>
                        <th>入库时间</th>
                        <th>所属部门</th>
                        <th>存放位置</th>
                        <th>设备状态</th>
                        <th>操作</th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:forEach items="${pageInfo.list}" var="equbuyList">
                        <tr>
                            <td class="tc"><input name="id[]" value="59" type="checkbox"></td>
                                <%--                            <td>--%>
                                <%--                                <input name="ids[]" value="59" type="hidden">--%>
                                <%--                                <input class="common-input sort-input" name="ord[]" value="0" type="text">--%>
                                <%--                            </td>--%>
                            <td>${equbuyList.equid}</td>
                            <td title="${equbuyList.euqname}"><a target="_blank" href="#"
                                                                 title="${equbuyList.euqname}">${equbuyList.euqname}</a>
                            </td>
                            <td>${equbuyList.equkind}</td>
                            <td>${equbuyList.type}</td>
                            <td><fmt:formatDate value="${equbuyList.buytime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
                            <td>${equbuyList.departmentid}</td>
                            <td>${equbuyList.position}</td>
                            <td>
                                    <c:if test="${equbuyList.amount>0}">
                                        <button><span style="color: green;">可借用</span></button>
                                    </c:if>
                                <c:if test="${equbuyList.amount==0}">
                                        <button><span style="color: red;">借出/维修</span></button>
                                    </c:if>
                            </td>
                            <td>
                                <c:if test="${sessionScope.login.departid==1}">
                                    <button class="btn btn-primary btn-sm edit_btn ">
                                        <span class="glyphicon glyphicon-pencil"><a style="color: whitesmoke"
                                                                                    href="${APP_PATH}/forward/toeditequb/${equbuyList.equid}">编辑</a></span>
                                    </button>
                                    &nbsp;&nbsp;
                                    <button class="btn btn-danger btn-sm delete_btn">
                                        <span class="glyphicon glyphicon-trash"><a style="color: whitesmoke"
                                                                                   href="${APP_PATH}/service/deletequip/${equbuyList.equid}"
                                                                                   onclick="return isdelete();">删除</a></span>
                                    </button>
                                </c:if>
                                <button class="btn btn-success btn-sm edit_rent">
                                        <span class="glyphicon glyphicon-pencil"><a style="color: whitesmoke"
                                                                                    href="${APP_PATH}/service/rentEquip/${equbuyList.equid}"
                                                                                    onclick="return rent();">借用</a></span>
                                </button>
                                &nbsp;&nbsp;
                                <button class="btn btn-info btn-sm delete_return">
                                        <span class="glyphicon glyphicon-trash"><a style="color: whitesmoke"
                                                                                   href="${APP_PATH}/service/returnEquip/${equbuyList.equid}">归还</a></span>
                                </button>

                                <button class="btn btn-info btn-sm delete_return">
                                    <span class="glyphicon glyphicon-trash"><a onclick="tckshow()">报修</a></span>
                                </button>


                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
            <div class="row">
                <table class="table">
                    <tr>
                        <th>
                            <div class="col-md-6">
                                当前${pageInfo.pageNum}页，总共${pageInfo.pages}页，共${pageInfo.total}条记录
                            </div>
                        </th>
                        <th>
                            <div class="col-md-6">
                                <c:if test="${flag}">
                                    <label style="color: red">删除失败！！！</label>
                                </c:if>
                            </div>
                        </th>
                        <th>
                            <div class="col-md-6">
                                <label style="color: red">${error}</label>
                            </div>
                        </th>
                        <th>
                            <div class="col-md-6">
                                <nav aria-label="Page navigation">
                                    <ul class="pagination">

                                        <li class="active">
                                            <a href="${pageContext.request.contextPath}/service/equPagejump?pn=${pageInfo.firstPage}">首页</a>
                                        </li>
                                        <c:if test="${pageInfo.hasPreviousPage}">
                                            <li>
                                                <a href="${pageContext.request.contextPath}/service/equPagejump?pn=${pageInfo.pageNum-1}"
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
                                                    <a href="${pageContext.request.contextPath}/service/equPagejump?pn=${num}">${num}</a>
                                                </li>
                                            </c:if>
                                        </c:forEach>
                                        <c:if test="${pageInfo.hasNextPage}">
                                            <li>
                                                <a href="${pageContext.request.contextPath}/service/equPagejump?pn=${pageInfo.pageNum+1}"
                                                   aria-label="Next">
                                                    <span aria-hidden="true">&raquo;</span>
                                                </a>
                                            </li>
                                        </c:if>
                                        <li class="active">
                                            <a href="${pageContext.request.contextPath}/service/equPagejump?pn=${pageInfo.lastPage}">末页</a>
                                        </li>

                                    </ul>
                                </nav>
                            </div>
                        </th>
                    </tr>
                </table>
            </div>
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
    <!--/main-->
</div>
</body>
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

    function rent() {
        if (window.confirm("十天后归还，是否借阅？")) {
            //点击的是“确定”
            return true;
        } else {
            //点击的是“取消”
            return false;
        }
    }

    function tckshow() {
        $(".tck").css('display','block');
        return false;
    }

    function tckhide() {
        $(".tck").css('display','none');
        return false;
    }

    $(function () {
        $(".tck").css('display','none');
    })

    function sub() {
        var equid = $("#btnid").val();
        var reson = $("#btnreson").val();
        var url = "${APP_PATH}/addrepair?equid=" + equid + "&reson=" + reson;
        window.location = url;
    }

    function isempty() {
        if($("#btnreson").val()===""){
            $("#btnreson").attr("placeholder","原因不能为空!");
            return false;
        }
    }
</script>
</html>