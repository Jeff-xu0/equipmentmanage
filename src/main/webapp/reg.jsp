<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2021/4/16/016
  Time: 14:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>注册设备管理账户</title>
    <%
        pageContext.setAttribute("APP_PATH", request.getContextPath());
    %>
    <script type="text/javascript" src="static/js/jquery-3.5.1.min.js"></script>
    <script src="${APP_PATH}/static/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="${APP_PATH}/static/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <link rel="stylesheet" type="text/css" href="./static/css/public.css"/>
    <link rel="stylesheet" type="text/css" href="./static/css/login.css"/>
    <style type="text/css">
        #canvas{
            cursor:pointer;
        }

        .login {
            width: 280px;
            background: #C10000;
            font-size: 20px;
            border: none;
            color: #fff;
        }
    </style>
</head>
<body>

<div class="reg">
    <form action="${APP_PATH}/ident/regist" method="post"><h1><a href="index.jsp"><img src="static/images/logo.jpg"></a></h1>
        <p><input class="emailtext" type="text" name="username" value="" placeholder="username"></p>
        <p><input class="passwordtext" type="text" name="password" value="" placeholder="Password"></p>
        <p><input class="passwordagain" type="text" name="" value="" placeholder="PasswordAgain"></p>
        <p><input type="text" class="verifytext"  name="verifyInput" placeholder="Verification code"></p>

        <div>
            <canvas id="canvas" width="150px" height="50px"></canvas>
        </div>
        <p><input class="submitclass" type="submit" name="" value="${sessionScope.flag==false?"User exits/Reset":"Sign in"}" onclick="return isempty();"></p>
<%--        <p><a href="#"><img src="./static/images/login.jpg" ></a></p>--%>
        <p class="txtL txt">完成此注册，即表明您同意了我们的
            <a href="#">
                &lt;使用条款和隐私策略&gt;
            </a></p>
        <p class="txt"><a href="login.jsp"><span><a href="login.jsp">已有账号登录</a></span></a></p>
        <!--<a href="#" class="off"><img src="img/temp/off.png"></a>--></form>
</div>

<script type="text/javascript">
    //生成随机数
    function randomNum(min,max){
        return Math.floor(Math.random()*(max-min)+min);
    }
    //生成随机颜色RGB分量
    function randomColor(min,max){
        var _r = randomNum(min,max);
        var _g = randomNum(min,max);
        var _b = randomNum(min,max);
        return "rgb("+_r+","+_g+","+_b+")";
    }
    //先阻止画布默认点击发生的行为再执行drawPic()方法
    document.getElementById("canvas").onclick = function(e){
        e.preventDefault();
        drawPic();
    };
    function drawPic(){
        //获取到元素canvas
        var $canvas = document.getElementById("canvas");
        var _str = "0123456789";//设置随机数库
        var _picTxt = "";//随机数
        var _num = 4;//4个随机数字
        var _width = $canvas.width;
        var _height = $canvas.height;
        var ctx = $canvas.getContext("2d");//获取 context 对象
        ctx.textBaseline = "bottom";//文字上下对齐方式--底部对齐
        ctx.fillStyle = randomColor(180,240);//填充画布颜色
        ctx.fillRect(0,0,_width,_height);//填充矩形--画画
        for(var i=0; i<_num; i++){
            var x = (_width-10)/_num*i+10;
            var y = randomNum(_height/2,_height);
            var deg = randomNum(-45,45);
            var txt = _str[randomNum(0,_str.length)];
            _picTxt += txt;//获取一个随机数
            ctx.fillStyle = randomColor(10,100);//填充随机颜色
            ctx.font = randomNum(16,40)+"px SimHei";//设置随机数大小，字体为SimHei
            ctx.translate(x,y);//将当前xy坐标作为原始坐标
            ctx.rotate(deg*Math.PI/180);//旋转随机角度
            ctx.fillText(txt, 0,0);//绘制填色的文本
            ctx.rotate(-deg*Math.PI/180);
            ctx.translate(-x,-y);
        }
        for(var i=0; i<_num; i++){
            //定义笔触颜色
            ctx.strokeStyle = randomColor(90,180);
            ctx.beginPath();
            //随机划线--4条路径
            ctx.moveTo(randomNum(0,_width), randomNum(0,_height));
            ctx.lineTo(randomNum(0,_width), randomNum(0,_height));
            ctx.stroke();
        }
        for(var i=0; i<_num*10; i++){
            ctx.fillStyle = randomColor(0,255);
            ctx.beginPath();
            //随机画原，填充颜色
            ctx.arc(randomNum(0,_width),randomNum(0,_height), 1, 0, 2*Math.PI);
            ctx.fill();
        }
        return _picTxt;//返回随机数字符串
    }
    var verfi = drawPic();

    function isempty() {
        //if($(".emailtext").value()==""||$(".passwordtext").value()==""||$(".passwordagain").value()==""||$(".verifytext").value()==""){
         // alert($(".emailtext").val());
        var regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+\\\\.[a-z]{3,5}";

          if($(".emailtext").val()==""||$(".passwordtext").val()==""||$(".passwordagain").val()==""||$(".verifytext").val()==""){

              alert("请输入完整信息！");
              return false;
          }
          // if (!$(".emailtext").val().matchAll(regex)){
          //     alert("格式不正确");
          //     return false;
          // }

        if ($(".passwordtext").val().length>16||$(".passwordtext").val().length<5)
        {
            $(".passwordtext").val("");
            $(".passwordagain").val("");
            $(".passwordtext").attr("placeholder","请输入5-16个字符");
            $(".passwordagain").attr("placeholder","请输入5-16个字符");
            return  false;
        }
          if ($(".passwordtext").val()!=$(".passwordagain").val()){

              $(".passwordtext").val("");
              $(".passwordagain").val("");
              $(".passwordtext").attr("placeholder","两次密码不一致");
              $(".passwordagain").attr("placeholder","请重新输入密码");
             // alert("两次密码不一致");
              return false;
          }
          if ($(".verifytext").val()!=verfi){
              $(".verifytext").val("");
              $(".verifytext").attr("placeholder","请重新输入验证码");
              return  false;
          }

            return true;
    }

</script>
</body>
</html>
