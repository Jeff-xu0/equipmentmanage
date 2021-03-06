<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/17/017
  Time: 16:15
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
    <title></title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <script src="${APP_PATH}/static/js/jquery-3.5.1.min.js"></script>
    <script type="text/javascript">
    </script>
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
    </style>
</head>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="${APP_PATH}/#" class="navbar-brand">????????????</a></h1>
            <ul class="navbar-list clearfix">
                <c:if test="${ident==true}">
                    <li><a class="on" href="${APP_PATH}/homePagemanageTrue">??????</a></li>
                </c:if>
                <c:if test="${ident==false}">
                    <li><a class="on" href="${APP_PATH}/homePagemanageFalse">??????</a></li>
                </c:if>
                <%--                <li><a href="#" target="_blank">????????????</a></li>--%>
            </ul>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
                <li><a href="#">${sessionScope.loginuser.uername}</a></li>
                <li><a href="#">????????????</a></li>
                <li><a href="${APP_PATH}/exitManage">??????</a></li>
            </ul>
        </div>
    </div>
</div>
<div class="container clearfix">
    <div class="sidebar-wrap">
        <div class="sidebar-title">
            <h1>??????</h1>
        </div>
        <div class="sidebar-content">
            <ul class="sidebar-list">
                <li>
                    <a href="#"><i class="icon-font">&#xe003;</i>????????????</a>
                    <ul class="sub-menu">
                        <c:if test="${ident==true}">
                            <li><a href="${APP_PATH}/userList"><i class="icon-font">&#xe008;</i>???????????? </a></li>
                            <li><a href="${APP_PATH}/homePagemanageTrue"><i class="icon-font">&#xe004;</i>????????????</a></li>
                            <li><a href="${APP_PATH}/homePagemanageTrue"><i class="icon-font">&#xe006;</i>????????????</a></li>
                        </c:if>
                        <c:if test="${ident==true}">
                            <li><a href="${APP_PATH}/homePagemanageTrue"><i class="icon-font">&#xe005;</i>????????????</a></li>
                            <li><a href="${APP_PATH}/forget/updatePass"><i class="icon-font">&#xe052;</i>????????????</a></li>
                            <li><a href="${APP_PATH}/workmanage"><i class="icon-font">&#xe033;</i>????????????</a></li>
                        </c:if>
                        <c:if test="${ident==false}">
                            <li><a href="${APP_PATH}/homePagemanageFalse"><i class="icon-font">&#xe005;</i>????????????</a></li>
                            <li><a href="${APP_PATH}/forget/updatePass"><i class="icon-font">&#xe052;</i>????????????</a></li>
                            <li><a href="${APP_PATH}/workmanage"><i class="icon-font">&#xe033;</i>??????</a></li>
                        </c:if>
                    </ul>
                </li>
                <li>
                    <c:if test="${ident==true}">
                        <a href="#"><i class="icon-font">&#xe018;</i>????????????</a>
                        <ul class="sub-menu">
                            <li><a href="${APP_PATH}/systemSettingsTrue"><i class="icon-font">&#xe017;</i>????????????</a></li>
                            <li><a href="${APP_PATH}/systemSettingsTrue"><i class="icon-font">&#xe037;</i>????????????</a></li>
                            <li><a href="${APP_PATH}/systemSettingsTrue"><i class="icon-font">&#xe046;</i>????????????</a></li>
                            <li><a href="${APP_PATH}/systemSettingsTrue"><i class="icon-font">&#xe045;</i>????????????</a></li>
                        </ul>
                    </c:if>
                </li>
            </ul>
        </div>
    </div>

    <!--/sidebar-->
    <div class="main-wrap">
        <div class="crumb-wrap">
            <div class="crumb-list"><i class="icon-font">&#xe06b;</i><span>?????????????????????????????????????????????????????????????????????</span></div>
        </div>
        <div class="search-wrap">
            <div class="search-content">
                <c:if test="${ident==true}">
                    <form action="${APP_PATH}/selectBookTrue" method="post">
                        <table class="search-tab">
                            <tr>
                                <th width="120">????????????:</th>
                                <td>
                                    <select name="bookselective" id="">
                                        <option value="${bookselect}">??????</option>
                                        <option value="bookname" >????????????</option>
                                        <option value="bookdescrib">????????????</option>
                                    </select>
                                </td>
                                <th width="70">?????????:</th>
                                <td><input class="common-text" placeholder="?????????" name="keywords" value="${keybords}" type="text">
                                </td>
                                <td><input class="btn btn-primary btn2" name="sub" value="??????" type="submit"></td>
                            </tr>
                        </table>
                    </form>
                </c:if>
                <c:if test="${ident==false}">
                    <form action="${APP_PATH}/selectBookFalse" method="post">
                        <table class="search-tab">
                            <tr>
                                <th width="120">????????????:</th>
                                <td>
                                    <select name="bookselective" id="">
                                        <option value="${bookselect}">??????</option>
                                        <option value="bookname" >????????????</option>
                                        <option value="bookdescrib">????????????</option>
                                    </select>
                                </td>
                                <th width="70">?????????:</th>
                                <td><input class="common-text" placeholder="?????????" name="keywords" value="${keybords}" type="text">
                                </td>
                                <td><input class="btn btn-primary btn2" name="sub" value="??????" type="submit"></td>
                            </tr>
                        </table>
                    </form>
                </c:if>
            </div>
        </div>
        <div class="result-wrap">
            <div class="result-title">
                <h1>????????????</h1>
            </div>
            <div class="result-content">
                <div class="short-wrap">
                    <c:if test="${ident==true}">
                        <a href="${APP_PATH}/insertmanageTrue"><i class="icon-font">&#xe001;</i>????????????</a>
                        <a href="${APP_PATH}/insertmanageTrue"><i class="icon-font">&#xe005;</i>????????????</a>
                    </c:if>
                    <%--                    <a href="insert.html"><i class="icon-font">&#xe048;</i>??????????????????</a>--%>
                    <%--                    <a href="insert.html"><i class="icon-font">&#xe041;</i>??????????????????</a>--%>
                    <a href="#"><i class="icon-font">&#xe01e;</i>????????????</a>
                </div>
            </div>
        </div>
        <div class="result-wrap">
            <div class="result-title">
                <h1>??????????????????</h1>
            </div>
            <div class="result-content">
                <table class="result-tab" width="100%">
                    <thead>
                    <tr>
                        <th class="tc" width="5%"><input class="allChoose" name="" type="checkbox"></th>
                        <th>????????????</th>
                        <th>????????????</th>
                        <th>????????????</th>
                        <th>????????????</th>
                        <th>????????????</th>
                        <th>????????????</th>
                        <th>????????????</th>
                        <th>????????????</th>
                        <th>??????</th>
                    </tr>
                    </thead>
                    <tbody>

                    <c:forEach items="${pageInfo.list}" var="book">
                        <tr>
                            <td class="tc"><input name="id[]" value="59" type="checkbox"></td>
                                <%--                            <td>--%>
                                <%--                                <input name="ids[]" value="59" type="hidden">--%>
                                <%--                                <input class="common-input sort-input" name="ord[]" value="0" type="text">--%>
                                <%--                            </td>--%>
                            <td>${book.bookid}</td>
                            <td title="${book.bookname}"><a target="_blank" href="#" title="${book.bookname}">${book.bookname}</a>
                            </td>
                            <td>${book.bookamount}</td>
                            <td>${book.bookdescrib}</td>
                            <td>${book.bookouttime}</td>
                            <td>${book.bookoutamount}</td>
                            <td>${book.bookbacktime}</td>
                            <td>${book.bookbackamount}</td>
                            <td>
                                <c:if test="${ident==true}">
                                    <button class="btn btn-primary btn-sm edit_btn" >
                                        <span class="glyphicon glyphicon-pencil"><a style="color: whitesmoke" href="${APP_PATH}/toeditbookmanage/${book.bookid}" >??????</a></span>
                                    </button>&nbsp;&nbsp;
                                    <button class="btn btn-danger btn-sm delete_btn">
                                        <span class="glyphicon glyphicon-trash"><a style="color: whitesmoke" href="${APP_PATH}/deleteBook1/${book.bookid}">??????</a></span>
                                    </button>
                                </c:if>
                                <c:if test="${ident==false}">
                                    <button class="btn btn-primary btn-sm edit_rent" >
                                        <span class="glyphicon glyphicon-pencil"><a style="color: whitesmoke" href="${APP_PATH}/toeditbookmanage/${book.bookid}" >??????</a></span>
                                    </button>&nbsp;&nbsp;
                                    <button class="btn btn-danger btn-sm delete_return">
                                        <span class="glyphicon glyphicon-trash"><a style="color: whitesmoke" href="${APP_PATH}/deleteBook1/${book.bookid}">??????</a></span>
                                    </button>
                                </c:if>

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
                                ??????${pageInfo.pageNum}????????????${pageInfo.pages}?????????${pageInfo.total}?????????
                            </div>
                        </th>
                        <th>
                            <div class="col-md-6">
                                <nav aria-label="Page navigation">
                                    <ul class="pagination">
                                        <c:if test="${ident==true}">
                                            <li class="active">
                                                <a href="${pageContext.request.contextPath}/selectBookTrue?pn=${pageInfo.firstPage}&bookselective=${bookselect}">??????</a>
                                            </li>
                                            <c:if test="${pageInfo.hasPreviousPage}">
                                                <li>
                                                    <a href="${pageContext.request.contextPath}/selectBookTrue?pn=${pageInfo.pageNum-1}&bookselective=${bookselect}" aria-label="Previous">
                                                        <span aria-hidden="true">&laquo;</span>
                                                    </a>
                                                </li>
                                            </c:if>
                                            <c:forEach items="${pageInfo.navigatepageNums}" var="num">
                                                <c:if test="${num == pageInfo.pageNum}">
                                                    <li class="active"><a href="#">${num}</a></li>
                                                </c:if>
                                                <c:if test="${num != pageInfo.pageNum}">
                                                    <li><a href="${pageContext.request.contextPath}/selectBookTrue?pn=${num}&bookselective=${bookselect}">${num}</a></li>
                                                </c:if>
                                            </c:forEach>
                                            <c:if test="${pageInfo.hasNextPage}">
                                                <li>
                                                    <a href="${pageContext.request.contextPath}/selectBookTrue?pn=${pageInfo.pageNum+1}&bookselective=${bookselect}" aria-label="Next">
                                                        <span aria-hidden="true">&raquo;</span>
                                                    </a>
                                                </li>
                                            </c:if>
                                            <li class="active">
                                                <a href="${pageContext.request.contextPath}/selectBookTrue?pn=${pageInfo.lastPage}&bookselective=${bookselect}">??????</a>
                                            </li>
                                        </c:if>

                                        <c:if test="${ident==false}">
                                            <li class="active">
                                                <a href="${pageContext.request.contextPath}/selectBookFalse?pn=${pageInfo.firstPage}&bookselective=${bookselect}">??????</a>
                                            </li>

                                            <c:if test="${pageInfo.hasPreviousPage}">
                                                <li>
                                                    <a href="${pageContext.request.contextPath}/selectBookFalse?pn=${pageInfo.pageNum-1}&bookselective=${bookselect}" aria-label="Previous">
                                                        <span aria-hidden="true">&laquo;</span>
                                                    </a>
                                                </li>
                                            </c:if>

                                            <c:forEach items="${pageInfo.navigatepageNums}" var="num">

                                                <c:if test="${num == pageInfo.pageNum}">
                                                    <li class="active"><a href="#">${num}</a></li>
                                                </c:if>

                                                <c:if test="${num != pageInfo.pageNum}">
                                                    <li><a href="${pageContext.request.contextPath}/selectBookFalse?pn=${num}&bookselective=${bookselect}">${num}</a></li>
                                                </c:if>

                                            </c:forEach>

                                            <c:if test="${pageInfo.hasNextPage}">
                                                <li>
                                                    <a href="${pageContext.request.contextPath}/selectBookFalse?pn=${pageInfo.pageNum+1}&bookselective=${bookselect}" aria-label="Next">
                                                        <span aria-hidden="true">&raquo;</span>
                                                    </a>
                                                </li>
                                            </c:if>
                                            <li class="active">
                                                <a href="${pageContext.request.contextPath}/selectBookFalse?pn=${pageInfo.lastPage}&bookselective=${bookselect}">??????</a>
                                            </li>
                                        </c:if>
                                    </ul>
                                </nav>
                            </div>
                        </th>
                    </tr>
                </table>
            </div>
        </div>

        <div class="result-wrap">
            <div class="result-title">
                <h1>????????????</h1>
            </div>
            <div class="result-content">
                <ul class="sys-info-list">
                    <li>
                        <label class="res-lab">???????????????</label><span class="res-info"><a href="http://www.baidu.com/"
                                                                                      target="_blank">??????</a></span>
                    </li>
                </ul>
            </div>
        </div>
    </div>
    <!--/main-->
</div>
</body>

</html>