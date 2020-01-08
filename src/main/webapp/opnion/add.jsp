<%--
  Created by IntelliJ IDEA.
  User: Hzw
  Date: 2019/6/26
  Time: 19:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String s=(String)session.getAttribute("depart");
    System.out.println(s);
%>
信息添加！
种类1：<%=s%>
<s:form action="wareadd2" theme="simple">
    编号：<s:textfield name="wareb.num"/><br>
    名称：<s:textfield name="wareb.name"/><br>
    <input type="hidden" name="wareb.type" value=<%=s%>>
    价格：<s:textfield name="wareb.price"/><br>
    产地：<s:textfield name="wareb.rootate"/><br>
    库存：<s:textfield name="wareb.stock"/><br>
    <s:submit/>
</s:form>
</body>
</html>
