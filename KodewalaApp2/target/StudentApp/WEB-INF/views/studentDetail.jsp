<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head><title>Student Detail</title></head>
<body>
<h2>Student Detail</h2>
<p>ID: ${student.id}</p>
<p>Name: ${student.name}</p>
<p>Password: ${student.password}</p>

<a href="${pageContext.request.contextPath}/student/form">Back to Form</a>
</body>
</html>
