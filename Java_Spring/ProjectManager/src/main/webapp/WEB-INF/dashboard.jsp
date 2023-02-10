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
    <h1 style="text-align:center;">Welcome <c:out value = "${user.fName}"></c:out>!</h1>
    <div>
        <a href="/logout">logout</a>
    </div>
    <h3>All Projects</h3>
    <div>
        <button><a href="/projects/new">+ new project</a></button>
    </div>
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                <th>Project</th>
                <th>Team Lead</th>
                <th>Due Date</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="p" items="${notUserProjects}">
                <tr>
                    <c:if test="{project.lead.id != user.id}">
                        <td><a href="/projects/${p.id}"><c:out value="${p.title}"/></a></td>
                        <td><c:out value="${p.lead.fName}"></c:out></td>
                        <td><c:out value="${p.dueDate}"></c:out></td>
                        <td><a href="/dashboard/join/${p.id}">Join team</a></td>
                    </c:if>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <h3>Your Projects</h3>
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                <th>Project</th>
                <th>Team Lead</th>
                <th>Due Date</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="u" items="${userProjects}">
                <tr>
                    <td><a href="/projects/${u.id}"><c:out value="${u.title}"/></a></td>
                    <td><c:out value="${u.lead.fName}"/></td>
                    <td><c:out value="${u.dueDate}"/></td>
                    <c:if test="${u.lead.id == user.id}">
                        <td><a href="/project/edit/${u.id}">Edit</a>
                    </c:if>
                    <c:if test="${u.lead.id != user.id}">
                        <a href="/dashboard/leave/${project.id}">Leave team</a></td>
                    </c:if>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
