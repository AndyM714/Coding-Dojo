<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Travel</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> 
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
    <div class="container center">
        <div class="d-flex justify-content-between">
            <h1 class="text-center">Edit Expense</h1>
            <a href="/">Go Back</a>
        </div>
       
        <form:form class="container center" action="/expenses/${expense.id}" method="post" modelAttribute="expense">
            <input type="hidden" name="_method" value="put">
            <div class="form-control">
             
                <form:label path="expenseName">Expense Name: </form:label>
                
                <form:errors class="text-danger" path="expenseName"></form:errors>
                <form:input path="expenseName"></form:input>
            </div>
            <div class="form-control">
            
                <form:label path="vendor">Vendor: </form:label>
                
                <form:errors class="text-danger" path="vendor"></form:errors>
                <form:input path="vendor"></form:input>
            </div>
            <div class="form-control">
             
                <form:label path="amount">Amount: </form:label>
                
                <form:errors class="text-danger" path="amount"></form:errors>
                <form:input path="amount"></form:input>
            </div>
            <div class="form-control">
              
                <form:label path="description">Description: </form:label>
                <form:errors class="text-danger" path="description"></form:errors>
                <form:input path="description"></form:input>
            </div>
            <input type="submit" value="Edit Expense">
        </form:form>
    </div>

</body>
</html>