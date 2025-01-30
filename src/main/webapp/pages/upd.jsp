<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Upd user</title>
</head>
<body>
    <sf:form method="post" action="/saveUpd" modelAttribute="user">
        <sf:input type="hidden" path="id"/><br>
        <sf:input path="name"/><br>
        <sf:input path="age"/><br>
        <input type="submit" value="Update">
    </sf:form>
</body>
</html>
