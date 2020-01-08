<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/26
  Time: 9:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>op</title>
</head>
<body>
<form action="opselect.action" method="post">

    请选择您的类型：
    <select name="depart" id="department">
        <s:iterator  value="WareGroup"  var="WareGroup">
            <option value="<s:property value="#WareGroup.getType()"/>"><s:property value="#WareGroup.getType()"/></option>
        </s:iterator>

    </select>
    <input type="submit" value="提交"/>
</form>
</body>

</html>
