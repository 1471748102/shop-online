<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/27
  Time: 9:08
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

    String num = request.getParameter("st.num");
    String name =request.getParameter("st.name");
    String type = request.getParameter("st.type");
    String price = request.getParameter("st.price");
    String rootate = request.getParameter("st.rootate");

    System.out.println(num);
    System.out.println(name);
    System.out.println(type);
    System.out.println(price);
    System.out.println(rootate);

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
    <div class="content-box w">
        <div class="login-box">
            <div class="login-div3">
                <s:form action="wareshopadd" theme="simple">
                    <s:textfield name="st.stnum" placeholder="请输入订单编号"/><br>
                    <input type="hidden" name="st.num" value=<%=num%>>
                    <input type="hidden" name="st.name" value=<%=name%>>
                    <input type="hidden" name="st.type" value=<%=type%>>
                    <input type="hidden" name="st.price" value=<%=price%>>
                    <input type="hidden" name="st.rootate" value=<%=rootate%>>
                    <s:textfield name="st.ststock" placeholder="请输入购买数量"/><br>
                    <button>提交</button>
                </s:form >

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
    <p class="copyright">Copyright &copy; 2004-2019  养蛋鸡XFY.com 版权所有</p>
</div>

</body>
</html>


