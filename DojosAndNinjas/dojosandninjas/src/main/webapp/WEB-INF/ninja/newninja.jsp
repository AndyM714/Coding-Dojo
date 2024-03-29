<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>New Ninja</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> 
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
    <h1>New Ninja</h1>
    
    <form:form action="/createninja" method="post" modelAttribute="ninja">
    
        <form:label path="name">Name:</form:label>
        <form:input path="name"></form:input>
        <div>
            <form:label path="dojo">Dojo:</form:label>
            <form:select path="dojo"/>
            <c:forEach var="dojo" items="${dojos}">
                <form:option value="${dojo.id}">
                    <c:out value="${dojo.name}" />
                </form:option>
            </c:forEach>
        </div>
        <div>
            <form:label path="firstName" >First Name:</form:label>
            <form:errors path="firstName" ></form:errors>
            <form:input path="firstName" ></form:input>
        </div>

        <div>
            <form:label path="lastName" >Last Name:</form:label>
            <form:errors path="lastName" ></form:errors>
            <form:input path="lastName" ></form:input>
        </div>

        <div>
            <form:label path="age" >Age:</form:label>
            <form:errors path="age" ></form:errors>
            <form:input path="age" ></form:input>
        </div>

        <input type="submit" value="Create Ninja">
    </form:form>


</body>
</html>