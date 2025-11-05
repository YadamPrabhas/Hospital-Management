<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hospital Management System</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/styles.css">
    <style>
        body { font-family: Arial, sans-serif; margin: 0; padding: 0; }
        .navbar { background-color: #990000; color: white; padding: 10px 20px; }
        .navbar a { color: white; margin: 0 15px; text-decoration: none; }
    </style>
</head>
<body>
<div class="navbar">
    <span style="font-weight: bold;">Hospital Management System</span>
    <a href="/patients">View Patients</a>
    <a href="/doctors">View Doctors</a>
    <a href="/appointments">Appointments</a>
    <a href="/register">Register Doctor</a>
    <a href="/logout">Logout</a>
</div>
