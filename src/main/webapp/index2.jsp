<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>养蛋鸡-欢迎登录</title>
    <link rel="stylesheet" type="text/css" href="./css/index-page.css">
</head>
<body>

<div class="header w clearfix">

    <a class="q" href="advertisement.jsp">
        调查问卷
    </a>
    <h1>
        <a href="index.jsp" class="logo"></a>
        <p>欢迎登录</p>
    </h1>

</div>
<div class="notice">
    <div class="box w">
        <i class="tips"></i>
        <p class="notice-content">
            依据《网络安全法》，为保障您的账户安全和正常使用，请尽快完成手机号验证！ 新版
            <a href="https://about.jd.com/privacy/" target="_blank" class="book">《超市隐私政策》</a>已上线，将更有利于保护您的个人隐私。
        </p>
    </div>

</div>

<div class="content">
    <div class="content-box w">
        <div class="login-box">
            <div class="login-div1">
                <p><span></span>本超市不会以任何理由要求您转账汇款，谨防诈骗。</p>
            </div>
            <div class="login-div2">
                <p>
                    <a href="index2.jsp" class="active"/>管理员登陆</a>
                    <span>|</span>
                    <a href="index.jsp">会员登录</a>
                </p>
            </div>
            <div class="login-div3">
                <s:form action="CheckAdmin" method="post">
                    <label for="username" class="user"></label><s:textfield id="username" name="adminname" type="text" class="no-border-left" placeholder="用户名" theme="simple"/>
                    <label for="password" class="pwd"></label><s:textfield id="password" name="adminpass" type="password" class="no-border-left" placeholder="密码" theme="simple"/>
                    <a href="AdminLossMima.jsp" class="clearfix">忘记密码</a>
                    <button>登录</button>
                </s:form>
            </div>
        </div>
    </div>
</div>

<div class="footer w">
    <ul class="clearfix">
        <li class="no-border-left"><a href="advertisement.jsp">关于我们</a></li>
        <li><a href="advertisement.jsp">联系我们</a></li>
        <li><a href="advertisement.jsp">人才招聘</a></li>
        <li><a href="advertisement.jsp">商家入驻</a></li>
        <li><a href="advertisement.jsp">广告服务</a></li>
        <li><a href="advertisement.jsp">手机业务</a></li>
        <li><a href="advertisement.jsp">友情链接</a></li>
        <li><a href="advertisement.jsp">销售联盟</a></li>
        <li><a href="advertisement.jsp">我的社区</a></li>
        <li><a href="advertisement.jsp">我的公益</a></li>
    </ul>
    <p class="copyright">Copyright &copy; 2004-2019  家家乐JJL.com 版权所有</p>
</div>

</body>
</html>

