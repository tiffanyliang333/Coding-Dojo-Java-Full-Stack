<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>TV Shows</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
    <h1 style="text-align:center;">Welcome <c:out value = "${user.name}"></c:out>!</h1>
    <p>TV Shows</p>
    <div>
        <a href="/logout">logout</a>
    </div>
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                <th>Show</th>
                <th>Network</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="s" items="${shows}">
                <tr>
                    <td><a href="/shows/${s.id}"><c:out value="${s.title}"/></a></td>
                    <td><c:out value="${s.network}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <div>
        <button><a href="/shows/new">Add a show!</a></button>
    </div>
</body>
</html>
