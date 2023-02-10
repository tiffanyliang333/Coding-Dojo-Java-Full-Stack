<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>New Dojo</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
    <h1 style="text-align:center;">New Dojo</h1>
    <form:form action="/dojos" style="text-align:center;" method="post" modelAttribute="dojo">
        <div>
            <form:label path="name">Name:</form:label>
            <form:input path="name"/>
            <form:errors path="name"/>
        </div>
        <input type = "submit" value="Create" class="btn-primary">
    </form:form>
</body>
</html>
