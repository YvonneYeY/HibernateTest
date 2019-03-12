<%--
  Created by IntelliJ IDEA.
  User: Yvonne
  Date: 2018/9/5
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page pageEncoding="utf-8" %>
<%
    String path=request.getContextPath();
    String basePath=request+"://"+request.getScheme()+request.getServletPath()+path+"/";
%>
<base href="<%=basePath%>">
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/style.css" >
    <script type="text/javascript" src="js/util.js"></script>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
%>
</body>
</html>
