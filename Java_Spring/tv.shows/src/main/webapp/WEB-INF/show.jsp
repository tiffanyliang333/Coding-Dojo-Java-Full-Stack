<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>TV Show</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
    <h1 style="text-align:center;"><c:out value="${show.title}"></c:out></h1>
    <div>
        <a href="/shows">Back to shows.</a>
    </div>
    <table>
        <tbody>
            <tr>
                <td>Posted by: <c:out value="${show.user.name}"></c:out></td>
            </tr>
            <tr>
                <td>Network: <c:out value="${show.network}"></c:out></td>
            </tr>
            <tr>
                <td>Description: <c:out value="${show.description}"></c:out></td>
            </tr>
        </tbody>
    </table>
    <button><a href="/shows/edit/${show.id}">Edit</a></button>
</body>
</html>
