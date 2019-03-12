<%--
  Created by IntelliJ IDEA.
  User: Yvonne
  Date: 2018/9/6
  Time: 11:22
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
    <script type="text/javascript" src="js/jedate/src/jedate.js"></script>
</head>
<body>
<%
    request.setCharacterEncoding("UTF-8");
%>
<form action="member_add_do.jsp" method="post">
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
    <table border="1" width="100%" class="init">
        <tr>
            <td colspan="3">增加新用户</td>

        </tr>
        <tr>
            <td>用户名</td>
            <td ><input type="text" id="memid" name="memid"></td>
            <td>请输入您的用户名(邮箱或者是手机号)</td>
        </tr>
        <tr>
            <td>名字</td>
            <td><input type="text" id="name" name="name"></td>
            <td>请输入您的名字</td>
        </tr>
        <tr>
            <td>性别</td>
            <td><input type="radio" id="sex" name="sex" value="男" checked>男
            <input type="radio" id="sex" name="sex"  value="女">女</td>
            <td>请输入您的性别</td>
        </tr>
        <tr>
            <td>学历</td>
            <td>
                <select id="edu" name="edu" >
                    <option value="高中">初中</option>
                    <option value="高中">高中</option>
                    <option value="高中">中专</option>
                    <option value="高中">大专</option>
                    <option value="高中">本科</option>
                    <option value="高中">硕士</option>
                    <option value="高中">博士</option>
                </select>
            </td>
            <td>请选择您的学历</td>
        </tr>
        <tr>
            <td>请选择您的生日</td>
            <td><input type="text" id="birthday" name="birthday" readonly onclick=" jeDate() "
                  ></td>
            <td>请选择您的生日</td>
        </tr>
        <tr>
            <td>工资</td>
            <td><input type="number" name="salary" id="salary"></td>
            <td>请选择您的工资</td>
        </tr>
        <tr>
            <td colspan="3">自我介绍</td>
        </tr>
        <tr colspan="3">
            <td ><textarea id="note" name="note" rows="10" cols="50" ></textarea> </td>
            <td>请输入您的自我介绍</td>
        </tr>
        <tr colspan="3">
            <td><input type="submit" id="submit" name="submit" value="增加"></td>
            <td><input type="reset" id="reset" name="reset" value="重置"></td>
        </tr>
        <tr>
            <td></td>
            <td></td>
            <td></td>
        </tr>

    </table>
</form>
</body>
</html>