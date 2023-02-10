<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Counter index</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
    <h1 style="text-align:center;">You have visited this server <c:out value="${count}"/> times(s).</h1>
    <h3 style="text-align:center;"><a href="/">Go back to server.</a></h2>
    <h4 style="text-align:center;"><a href="/reset">Test another visit?</a></h4>
</body>
</html>
