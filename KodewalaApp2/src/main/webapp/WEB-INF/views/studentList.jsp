<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<title>Students List</title>
</head>
<body>
	<h2>Search Results</h2>

	<c:choose>
		<c:when test="${empty students}">
			<p>No students found.</p>
			<p>“First, enroll in the Kodewala family.”</p>
		</c:when>
		<c:otherwise>
			<table border="1">
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Password</th>
				</tr>
				<c:forEach var="student" items="${students}">
					<tr>
						<td>${student.id}</td>
						<td>${student.name}</td>
						<td>${student.password}</td>
						<td><a
							href="${pageContext.request.contextPath}/student/delete/${student.id}"
							onclick="return confirm('Are you sure you want to delete this student?');">
								Delete </a></td>
					</tr>
				</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>

	<br>
	<br>
	<a href="${pageContext.request.contextPath}/student/form">Back to
		Form</a>
	<br>
	<br>
	<a href="${pageContext.request.contextPath}/">Back to Home</a>

</body>
</html>
