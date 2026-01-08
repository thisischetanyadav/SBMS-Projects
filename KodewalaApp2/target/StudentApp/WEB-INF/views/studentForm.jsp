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
</body>
</html>
