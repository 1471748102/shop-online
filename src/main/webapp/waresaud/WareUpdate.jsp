<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/25
  Time: 21:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>养蛋鸡-欢迎登录</title>
    <link rel="stylesheet" type="text/css" href="./css/index-page.css">
</head>
<body>
<%
    String num=request.getParameter("num");
    System.out.println(num);
%>
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
    <font size="4">
        <center>
            <br><br>
            <s:form action="wareupdate" method="post">
                您要修改的编号：
                <input type="textfield" name="warec.num" size=20  value =<%= num %>>
                <s:textfield name="warec.name" label="修改后名称"/>
                <s:textfield name="warec.type" label="修改后类别"/>
                <s:textfield name="warec.price" label="修改后价格"/>
                <s:textfield name="warec.rootate" label="修改后产地"/>
                <s:textfield name="warec.stock" label="修改后库存"/>
                <s:submit/>
            </s:form>
        </center>
    </font>
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
    <p class="copyright">Copyright &copy; 2004-2019  养蛋鸡XFY.com 版权所有</p>
</div>

</body>
</html>
