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
    <h1 style="text-align:center;"><c:out value="${book.title}"/></h1>
    <a href="/books" style="text-align:right;">back to the shelves</a>
    <h4 style="text-align:left;"><c:out value="${book.user.name}"/> read <c:out value="${book.title}"/> by <c:out value="${book.author}"/>.</h4>
    <h4 style="text-align:left;">Here are <c:out value="${book.user.name}"/>'s thoughts:</h4>
    <p style="text-align:center;">____________________________________________________</p>
    <p style="text-align:center;"><c:out value="${book.thoughts}"/></p>
    <p style="text-align:center;">____________________________________________________</p>
    <div>
            <a href="/books/edit/${book.id}">
                <button>edit</button>
            </a>
            <form action="/books/delete/${book.id}" method="POST">
                <input type="hidden" name="_method" value="delete"/>
                <button>delete</button>
            </form>
    </div>
</body>
</html>
