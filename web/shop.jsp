<%--
  Created by IntelliJ IDEA.
  User: ZJM
  Date: 6/13/2019
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>shop</title>
</head>
<body>
    <table cellspacing="0" border="1">
        <tr>
            <th>商品id</th>
            <th>商品名</th>
            <th>商品图</th>
            <th>商品价格</th>
            <th>商品简介</th>
            <th>商品库存</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${list}" var="goods">
            <tr>
                <td>${goods.id}</td>
                <td>${goods.name}</td>
                <td>${goods.pic}</td>
                <td>${goods.price}</td>
                <td>${goods.description}</td>
                <td>${goods.stock}</td>
                <td>删除|修改</td>
            </tr>
            <tr>
                <td colspan="7"></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
