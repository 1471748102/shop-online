<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/27
  Time: 9:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*,bean.*" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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

<div class="content2">
    <font size="5">
        <center>
            <br><br>
            <table width="1200" border="9" align="center" cellpadding="15" cellspacing="0">
                <tr>
                    <td colspan="9" align="center" valign="middle"><strong><font  size="4">所有商品信息</font></strong></td>
                </tr>
                <tr align="center" valign="middle">
                    <td>编号</td>
                    <td>名称</td>
                    <td>类型</td>
                    <td>价格</td>
                    <td>产地</td>
                    <td>库存</td>
                    <td colspan="1">操作</td>
                </tr>
                <%
                    List<Ware> list=(List<Ware>)request.getAttribute("list");
                %>
                <s:iterator value="list" var="ina">
                    <tr align="center" valign="middle" >
                        <td><s:property value="#ina.getNum()"/></td>
                        <td><s:property value="#ina.getName()"/></td>
                        <td><s:property value="#ina.getType()"/></td>
                        <td><s:property value="#ina.getPrice()"/></td>
                        <td><s:property value="#ina.getRootate()"/></td>
                        <td><s:property value="#ina.getStock()"/></td>
                        <td>
                            <s:url value="wareshop/WareBuyShop.jsp" var="WareBuyShop">
                                <s:param name="st.num"><s:property value="#ina.getNum()"/></s:param>
                                <s:param name="st.name"><s:property value="#ina.getName()"/></s:param>
                                <s:param name="st.type"><s:property value="#ina.getType()"/></s:param>
                                <s:param name="st.price"><s:property value="#ina.getPrice()"/></s:param>
                                <s:param name="st.rootate"><s:property value="#ina.getRootate()"/></s:param>

                            </s:url>

                            <a href="${WareBuyShop}">添加购物车</a>
                                <%--<a href="WareBuyShop.jsp?st.num=<s:property value="#ina.getNum()"/> & st.name=<s:property value="#ina.getName()"/> & st.type=<s:property value="#ina.getType()"/> & st.price = <s:property value="#ina.getPrice()"/> & st.rootate = <s:property value="#ina.getRootate()"/>">添加购物车</a>--%>
                        </td>
                    </tr>
                </s:iterator>
                <tr align="center" valign="middle">
                    <td colspan="9">
                        <%=request.getAttribute("s") %>
                    </td>
                </tr>

            </table>
            <br>
            <a href="wareshop/WareShopShow.jsp"/>查看购物车</a><br>
            <a href="opnion/opindex.jsp"/>下拉框分类查询</a><br>
            <a href="SelectByMt/SelectByName.jsp"/>名称模糊查询</a>+++++
            <a href="SelectByMt/SelectByPrice.jsp"/>按照价格查询</a>+++++
            <a href="waresaud/WareSelect.jsp"/>按照编号查询</a>+++++
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
