<%--
  登录页面
  Created by IntelliJ IDEA.
  User: fuxin
  Date: 2019-10-29
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<jsp:include page="../comp/head.jsp"></jsp:include>
<form action="/isLogin.do" method="post">
    <table style="height: 150px;width: 300px; margin: 0 auto;">
        <tr>
            <td>所属类别</td>
            <td>
                <select name="auth">
                    <option value="1">个人登录</option>
                    <option value="2">团队登录</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"></td>
        </tr>
        <tr>
            <td><input type="submit" value="登录"></td>
            <td><input type="reset" value="重置"></td>
        </tr>
    </table>
</form>

<jsp:include page="../comp/floor.jsp"></jsp:include>
</body>
</html>
