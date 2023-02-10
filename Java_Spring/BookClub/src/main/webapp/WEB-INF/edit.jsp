<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Book Club</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
    <h1 style="text-align:center;">Change Your Entry!</h1>
    <a href="/books" style="text-align:right;">back to the shelves</a>
    <form:form action="/updateBook/${book.id}" style="text-align:left;" method="POST" modelAttribute="book">
        <input type="hidden" name="-method" value="put"/>
        <div>
            <form:label path="title">Title:</form:label>
            <form:input path="title" value="${book.title}"/>
            <form:errors path="title" class="text-danger"/>
        </div>
        <div>
            <form:label path="author">Author:</form:label>
            <form:input path="author" value="${book.author}"/>
            <form:errors path="author" class="text-danger"/>
        </div>
        <div>
            <form:label path="thoughts">My thoughts:</form:label>
            <form:input path="thoughts" type="textarea" value="${book.thoughts}"/>
            <form:errors path="thoughts" class="text-danger"/>
        </div>
        <button>Submit</button>
    </form:form>
</body>
</html>
