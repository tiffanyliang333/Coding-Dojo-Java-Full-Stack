<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>New Ninja</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
    <h1 style="text-align:center;">New Ninja</h1>
    <form:form action="/ninjas" style="text-align:center;" method="POST" modelAttribute="ninja">
        <div>
            <form:label path="dojo">Dojo:</form:label>
            <form:select path="dojo">
                <c:forEach var="d" items="${dojos}">
                    <form:option value="${d.id}" path="dojo">
                        <c:out value="${d.name}"/>
                    </form:option>
                </c:forEach>
            </form:select>
        </div>
        <div>
            <form:label path="firstName">First Name:</form:label>
            <form:input path="firstName"/>
            <form:errors path="firstName"/>
        </div>
        <div>
            <form:label path="lastName">Last Name:</form:label>
            <form:input path="lastName"/>
            <form:errors path="lastName"/>
        </div>
        <div>
            <form:label path="age">Age:</form:label>
            <form:input path="age"/>
            <form:errors path="age"/>
        </div>
        <input type = "submit" value="Create" class="btn-primary">
    </form:form>
</body>
</html>
