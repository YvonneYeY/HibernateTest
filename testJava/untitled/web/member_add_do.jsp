
<%--
  Created by IntelliJ IDEA.
  User: Yvonne
  Date: 2018/9/5
  Time: 20:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page pageEncoding="utf-8" import="java.util.*" %>
<%@ page import="mldn.cn.vo.*" %>
<%
    String path=request.getContextPath();
    String basePath=request+"://"+request.getScheme()+request.getServletPath()+path+"/";
%>

<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="css/style.css" >
    <script type="text/javascript" src="js/util.js"></script>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
%>
    <%
        /*
    private String memid;
    private String name;
    private String sex;
    private String edu;
    private Date birthday;
    private Double salary;
    private String note;
         */
    %>
<%
   Member member=new Member();
    member.setMemid(request.getParameter("memid"));


%>

</body>
</html>
