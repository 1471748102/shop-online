<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/27
  Time: 8:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
通过价格区间进行查询！
<s:form action="selectbyprice" method="post">
    <s:textfield name="pricea" label="大于此价格"/>
    <s:textfield name="priceb" label="小于此价格"/>
    <s:submit/>
</s:form>
</body>
</html>
