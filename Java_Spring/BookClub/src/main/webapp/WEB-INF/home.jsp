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
    <h1 style="text-align:center;">Welcome <c:out value = "${user.name}"></c:out>!</h1>
    <p>Books from everyone's shelves:</p>
    <div>
        <a href="/logout">logout</a>
    </div>
    <div>
        <a href="/books/new">+ Add to my shelf!</a>
    </div>
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                <th>ID</th>
                <th>Title</th>
                <th>Author Name</th>
                <th>Posted By</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="b" items="${books}">
                <tr>
                    <td><c:out value="${b.id}"/></td>
                    <td><a href="/books/${b.id}"><c:out value="${b.title}"/></a></td>
                    <td><c:out value="${b.author}"/></td>
                    <td><c:out value="${b.user.name}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
