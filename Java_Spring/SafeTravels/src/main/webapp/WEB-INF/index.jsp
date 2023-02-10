<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Safe Travels</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
    <h1 style="text-align:center;">Safe Travels</h1>
    <table class="table table-striped table-bordered">
        <thead>
            <tr>
                <th>Expense</th>
                <th>Vendor</th>
                <th>Amount</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="t" items="${travels}">
                <tr>
                    <td><a href="/expenses/${t.id}"><c:out value="${t.name}"></c:out></a></td>
                    <td><c:out value="${t.vendor}"></c:out></td>
                    <td><c:out value="${t.price}"></c:out></td>
                    <td>
                        <a href="/expenses/edit/<c:out value="${t.id}"/>">edit</a> | 
                        <!-- <a href="/expenses/destroy/<c:out value="${t.id}"/>">delete</a> --> 
                        <!-- <form action="/expenses/edit/<c:out value="${t.id}"/>" method="post">
                            <input type="hidden" name="_method" value="edit">
                            <input type="submit" value="Edit">
                        </form> -->
                        <form action="/expenses/destroy/${t.id}" method="post">
                            <input type="hidden" name="_method" value="delete">
                            <input type="submit" value="Delete">
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <h2>Add an expense:</h2>
    <form:form action="/expenses" style="text-align:left;" method="POST" modelAttribute="travel">
        <div>
            <form:label>Expense Name:</form:label>
            <form:input type="text" name="name">
            <form:errors path="name" class="text-danger"/>
        </div>
        <div>
            <form:label>Vendor:</form:label>
            <form:input type="text" name="vendor">
            <form:errors path="vendor" class="text-danger"/>
        </div>
        <div>
            <form:label>Amount:</form:label>
            <form:input type="number" name="price">
            <form:errors path="price" class="text-danger"/>
        </div>
        <div>
            <form:label>Description:</form:label>
            <form:input type="text" name="description">
            <form:errors path="description" class="text-danger"/>
        </div>
        <input type = "submit" value="Submit" class="btn-primary">
    </form:form>
</body>
</html>
