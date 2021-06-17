<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>『图书』后台管理</title>
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

        .glyphicon-user:before {
            content: "\e008";
        }

        .glyphicon-list:before {
            content: "\e056";
        }
    </style>
</head>
<body>
<div class="topbar-wrap white">
    <div class="topbar-inner clearfix">
        <div class="topbar-logo-wrap clearfix">
            <h1 class="topbar-logo none"><a href="${APP_PATH}/#" class="navbar-brand">后台管理</a></h1>
            <ul class="navbar-list clearfix">
                <li><a class="on" href="${APP_PATH}/homeForward">首页</a></li>
                <%--                <li><a href="#" target="_blank">网站首页</a></li>--%>
            </ul>
        </div>
        <div class="top-info-wrap">
            <ul class="top-info-list clearfix">
                <li><a href="#">${sessionScope.login.username}</a></li>
                <li><a href="#">修改密码</a></li>
                <li><a href="${APP_PATH}/exitForward">退出</a></li>
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
                        <c:if test="${sessionScope.login.departid==1}">
                            <li><a href="${APP_PATH}/userForward"><i class="icon-font">&#xe005;</i>用户管理 </a></li>
                            <li><a href="${APP_PATH}/homeForward"><i class="icon-font">&#xe052;</i>器材管理</a></li>
                            <li><a href="${APP_PATH}/homeForward"><i class="icon-font">&#xe033;</i>分类管理</a></li>
                        </c:if>
                        <li><a href="${APP_PATH}/homeForward"><i class="icon-font">&#xe005;</i>器材借用</a></li>
                        <li><a href="${APP_PATH}/forgetForward"><i class="icon-font">&#xe052;</i>修改密码</a></li>
                        <li><a href="${APP_PATH}/messageForward"><i class="icon-font">&#xe033;</i>留 言</a></li>
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
    </div>