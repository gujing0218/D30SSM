<%--
  Created by IntelliJ IDEA.
  User: yangjie
  Date: 2021/10/29
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    修改员工信息页面：
    <form action="${pageContext.request.contextPath}/updateEmp">
        编号：<input type="text" name="eno" readonly value="${employee.eno}"> <br>
        姓名：<input type="text" name="ename" value="${employee.ename}"> <br>
        职位： <input type="text" name="job" value="${employee.job}"> <br>
        入职日期： <input type="date" name="hiredate" readonly value="${employee.hiredate}"> <br>
        年龄：<input type="text" name="age" value="${employee.age}"> <br>
        性别: <input type="text" name="sex" readonly value="${employee.sex}"> <br>
        工资： <input type="text" name="sal" value="${employee.sal}"> <br>
        部门： <input type="text" name="dno" value="${employee.dno}"> <br>

        <input type="submit" value="修改">
    </form>
</body>
</html>
