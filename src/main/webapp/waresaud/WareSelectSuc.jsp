<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/26
  Time: 8:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr align="center">
        <td>编号</td>
        <td>名称</td>
        <td>类型</td>
        <td>价格</td>
        <td>产地</td>
        <td>库存</td>
    </tr>
    <s:iterator  value="StudentList"  var="ux">
        <tr>
            <td><s:property value="#ux.getNum()"/></td>
            <td><s:property value="#ux.getName()"/></td>
            <td><s:property value="#ux.getType()"/></td>
            <td><s:property value="#ux.getPrice()"/></td>
            <td><s:property value="#ux.getRootate()"/></td>
            <td><s:property value="#ux.getStock()"/></td>
        </tr>
    </s:iterator>
</table>
<p>
</body>
</html>
