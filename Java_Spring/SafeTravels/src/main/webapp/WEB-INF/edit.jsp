<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isErrorPage="true" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Safe Travels</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
    <h1 style="text-align:center;">Edit Expense</h1>
    <h3 style="text-align:right;"><a href="/">Go Back</a></h3>
    <form:form action="/expenses/${travel.id}" modelAttribute="travel" style="text-align:left;" method="POST" class="form">
    <form:input type="hidden" name="_method" value="put">
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
        <input type = "submit" value="Update" class="btn-primary">
    </form:form>
</body>
</html>
