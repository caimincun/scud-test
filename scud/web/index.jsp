<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2015/6/9
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
  <body>
  注册测试
  <form action="/user/json" method="post">
    <p>First name: <input type="text" name="name" /></p>
    <p>Last name: <input type="password" name="password" /></p>
    <input type="submit" value="Submit" />
  </form>
  </body>
</html>
