<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <title>Omikuji</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>
    <h1 style="text-align:center;">Send an Omikuji!</h1>
    <form action = "/submit" style = "text-align:center;" method = "POST">
        <div>
            <label>Pick any number.</label>
            <input type = "number" name = "number">
        </div>
        <div>
            <label>Enter the name of any city.</label>
            <input type = "text" name = "city">
        </div>
        <div>
            <label>Enter the name of any real person.</label>
            <input type = "text" name = "name">
        </div>
        <div>
            <label>Enter professional endeavor or hobby.</label>
            <input type = "text" name = "hobby">
        </div>
        <div>
            <label>Enter any type of living thing.</label>
            <input type = "text" name = "livingThing">
        </div>
        <div>
            <label>Say something nice to someone:</label>
            <input type = "text" name = "somethingNice">
        </div>
        <div>
            <p><em>Send and show a friend</em></p>
        </div>
        
        <input type = "submit" value = "Send">
    </form>
</body>
</html>
