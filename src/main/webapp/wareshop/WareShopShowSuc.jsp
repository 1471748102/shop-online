<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/27
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*,bean.*" %>
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Show</title>
</head>
<body>
<table width="1200" border="9" align="center" cellpadding="15" cellspacing="0">
    <tr>
        <td colspan="9" align="center" valign="middle"><strong><font color="#FF00CC" size="4">所有商品信息</font></strong></td>
    </tr>
    <tr align="center" valign="middle">
        <td>订单号</td>
        <td>货物编号</td>
        <td>名称</td>
        <td>类型</td>
        <td>价格</td>
        <td>产地</td>
        <td>购买数量</td>
        <td colspan="2">操作</td>
    </tr>
    <%
        List<Ware> list=(List<Ware>)request.getAttribute("list");
    %>
    <s:iterator value="list" var="ina">
        <tr align="center" valign="middle" >
            <td><s:property value="#ina.getStnum()"/></td>
            <td><s:property value="#ina.getNum()"/></td>
            <td><s:property value="#ina.getName()"/></td>
            <td><s:property value="#ina.getType()"/></td>
            <td><s:property value="#ina.getPrice()"/></td>
            <td><s:property value="#ina.getRootate()"/></td>
            <td><s:property value="#ina.getStstock()"/></td>
            <td>
                <a href="wareshopcal.action?num=<s:property value="#ina.getStnum()"/>">结算</a>
            </td>
            <td>
                <a href="wareshopdel.action?num=<s:property value="#ina.getStnum()"/>">删除</a>
            </td>
        </tr>
    </s:iterator>
    <tr align="center" valign="middle">
        <td colspan="9">
            <%=request.getAttribute("s") %>
        </td>
    </tr>

</table>
</body>
</html>
