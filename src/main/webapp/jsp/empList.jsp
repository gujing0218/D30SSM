<%--
  Created by IntelliJ IDEA.
  User: yangjie
  Date: 2021/10/27
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        form input{
            width: 130px;
        }
        table td{width: 100px;text-align: center}
    </style>
</head>
<body>
<%--    ${employeeList}--%>
<%--${pageInfo}--%>
    <h2 align="center">员工信息</h2>
    <div align="center">
        <form id="myForm" action="allEmps2.action">
            姓名 <input type="text" name="ename" value="${params.ename}">
            职位 <input type="text" name="job" value="${params.job}"> <br> <br>
            入职日期 <input type="date" name="dateFrom" value="${params.dateFrom}">
                -- <input type="date" name="dateTo" value="${params.dateTo}"> <br> <br>
            年龄 <input type="text" name="ageFrom" value="${params.ageFrom}">
             -- <input type="text" name="ageTo" value="${params.ageTo}"> <br> <br>
            工资 <input type="text" name="salFrom" value="${params.salFrom}">
            -- <input type="text" name="salTo" value="${params.salTo}"> <br> <br>
            部门 <input type="text" name="dno" value="${params.dno}">
            <input id="currentPage" type="hidden" name="pageNum" value="${params.pageNum}">
            <input type="submit" value="查询">

        </form>
    </div>
    <table align="center" border="1" cellspacing="0">

        <tr>
            <td>编号</td>
            <td>姓名</td>
            <td>职位</td>
            <td>入职日期</td>
            <td>年龄</td>
            <td>性别</td>
            <td>工资</td>
            <td>部门</td>
            <td>操作</td>
        </tr>


        <c:forEach items="${pageInfo.list}" var="emp" varStatus="no">
            <tr>
<%--            <td>${emp.eno}</td>--%>
                <td>${no.count+(pageInfo.pageNum-1)*pageInfo.pageSize}</td>
                <td>${emp.ename}</td>
                <td>${emp.job}</td>
                <td>${emp.hiredate}</td>
                <td>${emp.age}</td>
                <td>${emp.sex}</td>
                <td>${emp.sal}</td>
                <td>${emp.dno}</td>
                <td>
                    <a href="deleteEmp?id=${emp.eno}">删除</a> &nbsp;&nbsp;
                    <a href="updateGetById/${emp.eno}">修改</a>
                </td>
            </tr>
        </c:forEach>
        <tr align="center">
            <td colspan="9">
                <a href="${pageContext.request.contextPath}/jsp/insertEmp.jsp">添加员工信息</a>
            </td>
        </tr>
    </table>
    <table align="center">
        <%--<tr>
            <td><a href="allEmps2.action?pageNum=1">首页</a></td>
            <td><a href="allEmps2.action?pageNum=${pageInfo.pageNum-1}">上一页</a></td>
            <td><a href="allEmps2.action?pageNum=${pageInfo.pageNum+1}">下一页</a></td>
            <td><a href="allEmps2.action?pageNum=${pageInfo.pages}">尾页</a></td>
        </tr>--%>
        <tr>
            <td><a href="javascript:toPage(1)">首页</a></td>
            <td><a href="javascript:toPage(${pageInfo.pageNum-1})">上一页</a></td>
            <td><a href="javascript:toPage(${pageInfo.pageNum+1})">下一页</a></td>
            <td><a href="javascript:toPage(${pageInfo.pages})">尾页</a></td>
        </tr>
        <tr align="center">
            <td colspan="4">第${pageInfo.pageNum}页/共${pageInfo.pages}页</td>
        </tr>
    </table>
    <script type="text/javascript">
        function toPage(pageNum) {
            var currentPage = document.getElementById("currentPage");
            currentPage.value = pageNum;
            //表单提交
            var myForm = document.getElementById("myForm");
            myForm.submit();
        }
    </script>

</body>
</html>
