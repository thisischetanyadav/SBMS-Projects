<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head><title>Student Saved</title></head>
<body>
<h2>Student Saved Successfully!</h2>
<p>Generated ID: ${id}</p>

<!-- Add Another button -->
<a href="${pageContext.request.contextPath}/student/form">Add Another</a>

<!-- View single student-->
<a href="${pageContext.request.contextPath}/student/${id}">View Student</a>


</body>
</html>