<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Project Manager</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
    <h1 style="text-align:center;">Project Details/h1>
    <div>
        <a href="/dashboard">Dashboard</a>
    </div>
    <table>
        <tbody>
            <tr>
                <td>Project: <c:out value="${project.title}"></c:out></td>
            </tr>
            <tr>
                <td>Description: <c:out value="${project.description}"></c:out></td>
            </tr>
            <tr>
                <td>Due Date: <fmt:formatDate value="${project.dueDate}" pattern="MMM dd"/></td>
            </tr>
        </tbody>
    </table>
    <c:if test="${project.lead.id == userId}">
        <h3><a href="/projects/delete/${project.id}">Delete Project</a></h3>
    </c:if>
</body>
</html>
