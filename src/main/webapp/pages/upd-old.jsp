<%@ page import="static by.itclass.constants.Constants.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upd old</title>
</head>
<body>
    <form action="<%=UPD_USER_URL_OLD%>" method="post">
        <input type="hidden" name="id" value="${param.id}">
        <input name="name" value="${param.name}">
        <input type="number" name="age" value="${param.age}">
        <input type="submit" value="Upd Old">
    </form>
</body>
</html>
