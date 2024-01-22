<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User List</title>
</head>
<body>

<h2>User List</h2>

<table border="1">
    <thead>
        <tr>
            <th>User ID</th>
            <th>Username</th>
            <th>Email</th>
            <th>Name</th>
            <th>Contact</th>
\           <th>Address</th>
            <th>Category</th>
            <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="user" items="${userList}">
            <tr>
                <td>${user.userId}</td>
                <td>${user.username}</td>
                <td>${user.email}</td>
                <td>${user.name}</td>
                <td>${user.contact}</td>
                <td>${user.address}</td>
                <td>${user.category}</td>
                <td>
                    <a href="<c:url value='/users/edit/${user.userId}'/>">Edit</a>
                    |
                    <a href="<c:url value='/users/delete/${user.userId}'/>">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

<br>

<a href="<c:url value='/users/create'/>">Create New User</a>

</body>
</html>
