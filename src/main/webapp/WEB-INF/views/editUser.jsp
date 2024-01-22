<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Edit User</title>
</head>
<body>

<h2>Edit User</h2>

<form action="<c:url value='/users/edit/${user.userId}'/>" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" value="${user.username}" required>
    <br>

    <label for="password">Password:</label>
    <input type="password" id="password" name="password" value="${user.password}" required>
    <br>

    <label for="name">Name:</label>
    <input type="name" id="name" name="name" value="${user.name}" required>
    <br>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" value="${user.email}" required>
    <br>

    <label for="category">Category:</label>
    <input type="category" id="category" name="category" value="${user.category}" required>
    <br>

    <label for="contact">Contact:</label>
    <input type="contact" id="contact" name="contact" value="${user.contact}" required>
    <br>

    <label for="address">Address:</label>
    <input type="address" id="address" name="address" value="${user.address}" required>
    <br>

    <input type="submit" value="Save Changes">
</form>

<br>

<a href="<c:url value='/users'/>">Back to User List</a>

</body>
</html>