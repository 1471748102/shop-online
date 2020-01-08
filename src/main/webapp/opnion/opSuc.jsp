<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/26
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
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
    <s:iterator  value="TypeSelect"  var="ts">
        <tr>
            <td><s:property value="#ts.getNum()"/></td>
            <td><s:property value="#ts.getName()"/></td>
            <td><s:property value="#ts.getType()"/></td>
            <td><s:property value="#ts.getPrice()"/></td>
            <td><s:property value="#ts.getRootate()"/></td>
            <td><s:property value="#ts.getStock()"/></td>
        </tr>
    </s:iterator>
</table>


    <a href="add.jsp"/>继续添加此种类的商品</a><br>
</body>
</html>
