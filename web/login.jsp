<%--
  Created by IntelliJ IDEA.
  User: ZJM
  Date: 6/13/2019
  Time: 9:50 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    ${msg}
    <form action="UserServlet?action=login" method="post">
        用户名：<input type="text" name="username"><br>
        密码：<input type="password" name="password"><br>
        <input type="reset" value="重置"><input type="submit" value="提交">
    </form>
</body>
</html>
