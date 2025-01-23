<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>User List</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Age</th>
        </tr>
        <c:forEach var="user" items="${userList}">
           <tr>
               <td>${user.id}</td>
               <td>${user.name}</td>
               <td>${user.age}</td>
           </tr>
        </c:forEach>
    </table>
</body>
</html>
