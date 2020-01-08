<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/27
  Time: 8:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="bean.Ware" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table width="1200" border="9" align="center" cellpadding="15" cellspacing="0">
    <tr>
        <td colspan="9" align="center" valign="middle"><strong><font size="4">商品信息</font></strong></td>
    </tr>
    <tr align="center" valign="middle">
        <td>编号</td>
        <td>名称</td>
        <td>类型</td>
        <td>价格</td>
        <td>产地</td>
        <td>库存</td>
    </tr>
    <%
        List<Ware> waref=(List<Ware>)request.getAttribute("waref");
    %>
    <s:iterator value="waref" var="inwaref">
        <tr align="center" valign="middle" >
            <td><s:property value="#inwaref.getNum()"/></td>
            <td><s:property value="#inwaref.getName()"/></td>
            <td><s:property value="#inwaref.getType()"/></td>
            <td><s:property value="#inwaref.getPrice()"/></td>
            <td><s:property value="#inwaref.getRootate()"/></td>
            <td><s:property value="#inwaref.getStock()"/></td>
        </tr>
    </s:iterator>

</table>

</body>
</html>
