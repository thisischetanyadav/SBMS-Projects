<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head><title>Student Form</title></head>
<body>

<h2>Add Student</h2>
<form action="${pageContext.request.contextPath}/student/add" method="post">
    Name: <input type="text" name="name" required><br>
    Password: <input type="password" name="password" required><br>
    <button type="submit">Save</button>
</form>

<hr>

<h2>Search Student by ID</h2>
<form action="${pageContext.request.contextPath}/student/search/result" method="get">
    Enter ID: <input type="number" name="id" required>
    <button type="submit">Search</button>
</form>

<hr>

<!-- Search by Name Form -->
<h2>Search Student by Name</h2>
<form action="${pageContext.request.contextPath}/student/searchByName" method="get">
    <input type="text" name="name" placeholder="Enter Name" required>
    <button type="submit">Search</button>
</form>

</body>
</html>
