<%--
  Created by IntelliJ IDEA.
  User: yangjie
  Date: 2021/10/29
  Time: 14:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    新增编辑页面
    <form action="${pageContext.request.contextPath}/insertEmp">
        姓名：<input type="text" name="ename"> <br>
        职位：<input type="text" name="job"> <br>
        入职时间：<input type="date" name="hiredate"> <br>
        年龄： <input type="text" name="age"> <br>
        性别：<input type="text" name="sex"> <br>
        工资：<input type="text" name="sal"> <br>
        部门：<input type="text" name="dno"> <br>
        <input type="submit" value="添加">

    </form>
</body>
</html>
