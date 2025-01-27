<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="static by.itclass.constants.Constants.*" %>
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
            <th>Action</th>
        </tr>
        <c:forEach var="user" items="${userList}">
           <tr>
               <td>${user.id}</td>
               <td>${user.name}</td>
               <td>${user.age}</td>
               <td>
                   <a href="<%=DELETE_USER_URL%>?id=${user.id}">Delete</a>
               </td>
           </tr>
        </c:forEach>
    </table>

    <div>
        <a href="<%=ADD_USER_URL%>">Add user</a>
    </div>

    <div>
        <a href="/pages/add-old.jsp">Add user All</a>
    </div>
</body>
</html>
