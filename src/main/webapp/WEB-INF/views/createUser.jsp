<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create User</title>
</head>
<body>

<h2>Create User</h2>

<form action="<c:url value='/users/create'/>" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" required>
    <br>

    <label for="name">Name:</label>
    <input type="name" id="name" name="name" required>
    <br>

    <label for="email">Email:</label>
    <input type="email" id="email" name="email" required>
    <br>

    <label for="category">Category:</label>
    <input type="category" id="category" name="category" required>
    <br>

    <label for="contact">Contact:</label>
    <input type="contact" id="contact" name="contact" required>
    <br>

    <label for="address">Address:</label>
    <input type="address" id="address" name="address" required>
    <br>

    <input type="submit" value="Create User">
</form>

<br>

<a href="<c:url value='/users'/>">Back to User List</a>

</body>
</html>