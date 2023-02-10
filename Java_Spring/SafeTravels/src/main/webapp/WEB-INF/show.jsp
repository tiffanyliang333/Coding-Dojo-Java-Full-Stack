<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
    <h1 style="text-align:center;">Expense Details</h1>
    <h3 style="text-align:right;"><a href="/">Go Back</a></h3>
    <div>
        <label>Expense Name:</label>
        <c:out value="${travel.name}"/>
    </div>
    <div>
        <label>Expense Vendor:</label>
        <c:out value="${travel.vendor}"/>
    </div>
    <div>
        <label>Expense Description:</label>
        <c:out value="${travel.description}"/>
    </div>
    <div>
        <label>Amount Spent:</label>
        <c:out value="${travel.price}"/>
    </div>
</body>
</html>
