<%--
  Created by IntelliJ IDEA.
  User: ZJM
  Date: 6/12/2019
  Time: 8:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>

    <form method="post" action="UserServlet?action=register">
        用户名：<input type="text" name="username"><br>
        密码：<input type="text" name="password"><br>
        性别：男<input type="radio" name="sex" value="male">
        女<input type="radio" name="sex" value="female"><br>
        爱好：唱<input type="checkbox" name="hobbies" value="sing">
        跳<input type="checkbox" name="hobbies" value="dance">
        打篮球 <input type="checkbox" name="hobbies" value="basketball">
        rap <input type="checkbox" name="hobbies" value="rap"><br>
        电话：<input type="number" name="phone"><br>
        电子邮箱：<input type="email" name="email"><br>
        地址：<input type="text" name="addrs"><br>
        <input type="reset" value="重置">
        <input type="submit" value="提交">
    </form>
</body>
</html>
