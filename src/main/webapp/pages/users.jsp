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
            <th>City</th>
            <th>Street</th>
            <th>House</th>
            <th>Action</th>
        </tr>
        <c:forEach var="user" items="${userList}">
           <tr>
               <td>${user.id}</td>
               <td>${user.name}</td>
               <td>${user.age}</td>
               <td>${user.address.city}</td>
               <td>${user.address.street}</td>
               <td>${user.address.house}</td>
               <td>
                   <a href="<%=DELETE_USER_URL%>?id=${user.id}">Delete</a>
                   <a href="<%=UPD_USER_URL%>?id=${user.id}&name=${user.name}&age=${user.age}">Update</a>
                   <a href="/pages/upd-old.jsp?id=${user.id}&name=${user.name}&age=${user.age}">Update-Old</a>
               </td>
           </tr>
        </c:forEach>
    </table>

    <div>
        <a href="<%=ADD_USER_URL%>">Add user</a>
    </div>

    <div>
        <a href="/pages/add-old.jsp">Add user Old</a>
    </div>
</body>
</html>
