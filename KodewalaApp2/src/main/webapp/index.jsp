<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Kodewala Portal</title>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            background: #f5f7fa;
            color: #333;
            margin: 0;
            padding: 0;
        }
        .container {
            max-width: 600px;
            margin: 80px auto;
            padding: 30px;
            background: #fff;
            border-radius: 12px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.1);
            text-align: center;
        }
        h2 {
            color: #2c3e50;
            margin-bottom: 25px;
        }
        a, button {
            background-color: #3498db;
            color: white;
            padding: 12px 25px;
            text-decoration: none;
            border: none;
            border-radius: 25px;
            margin: 10px 5px;
            font-size: 16px;
            cursor: pointer;
            transition: background 0.3s;
        }
        a:hover, button:hover {
            background-color: #2980b9;
        }
        form {
            margin-top: 20px;
        }
        input[type="text"], select {
            padding: 10px;
            width: 70%;
            border-radius: 25px;
            border: 1px solid #ccc;
            margin-right: 10px;
            font-size: 16px;
        }
        hr {
            border: 0;
            height: 1px;
            background: #ccc;
            margin: 40px 0;
        }
        .logo {
            width: 80px;
            height: 80px;
            background-color: #3498db;
            border-radius: 50%;
            display: inline-block;
            margin-bottom: 20px;
            line-height: 80px;
            color: white;
            font-weight: bold;
            font-size: 28px;
        }
    </style>
</head>
<body>

<div class="container">
    <!-- Logo -->
    <div class="logo">K</div>

    <h2>Welcome to Kodewala Portal!</h2>

    <!-- Add Student Button -->
    <a href="student/form">Add Student</a>

    <hr>

    <!-- Select Course Feature -->
    <h2>Select Course</h2>
    <form action="#" method="get">
        <select name="course" required>
            <option value="">-- Choose Course --</option>
            <option value="core-java">Core Java</option>
            <option value="spring-boot">Spring Boot</option>
            <option value="spring-core">Spring Core</option>
            <option value="full-stack">Full Stack</option>
        </select>
        <button type="submit">Select</button>
    </form>

    <hr>
    
    <a href="${pageContext.request.contextPath}/student/all">View All Students</a>

    <!-- Search by Name Form -->
    <h2>Search Student by Name</h2>
    <form action="${pageContext.request.contextPath}/student/searchByName" method="get">
        <input type="text" name="name" placeholder="Enter Name" required>
        <button type="submit">Search</button>
    </form>
</div>

</body>
</html>
