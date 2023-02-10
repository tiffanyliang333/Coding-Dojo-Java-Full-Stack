<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Login and Registration</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
    <h1 style="text-align:center;">Welcome!</h1>
    <h2>Join our growing community.</h2>
    <h3>Register</h3>
    <form:form action="/register" style="text-align:left;" method="POST" modelAttribute="newUser">
        <div>
            <form:label path="username">Username:</form:label>
            <form:input path="username"/>
            <form:errors path="username" class="text-danger"/>
        </div>
        <div>
            <form:label path="email">Email:</form:label>
            <form:input path="email"/>
            <form:errors path="email" class="text-danger"/>
        </div>
        <div>
            <form:label path="password">Password:</form:label>
            <form:input path="password" type = "password"/>
            <form:errors path="password" class="text-danger"/>
        </div>
        <div>
            <form:label path="confirm">Confirm Password:</form:label>
            <form:input path="confirm" type = "password"/>
            <form:errors path="confirm" class="text-danger"/>
        </div>
        <button>Submit</button>
    </form:form>
    <h3>Login</h3>
    <form:form action="/login" style="text-align:left;" method="POST" modelAttribute="newLogin">
        <div>
            <form:label path="email">Email:</form:label>
            <form:input path="email"/>
            <form:errors path="email" class="text-danger"/>
        </div>
        <div>
            <form:label path="password">Password:</form:label>
            <form:input path="password" type = "password"/>
            <form:errors path="password" class="text-danger"/>
        </div>
        <button>Submit</button>
    </form:form>
</body>
</html>
