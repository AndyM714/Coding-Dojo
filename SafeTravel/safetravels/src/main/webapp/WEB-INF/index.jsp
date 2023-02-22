<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
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
    <script type="text/javascript" src="/js/app.js"></script>->
</head>
<body>
    <h1 class="text-center">Save Travels</h1>
    
    <table class="table container center text-center ">
        <thead>
            <th>Expense</th>
            <th>Vendor</th>
            <th>Amount</th>
            <th>Actions</th>
        </thead>
        <tbody>
            <c:forEach var="expense" items="${expenses}">
                <tr>
                    
                    <td>
                        <a href="/expenses/${expense.id}">
                            ${expense.expenseName}
                        </a>
                    </td>
                    <td>${expense.vendor}</td>
                    <td>${expense.amount}</td>

                    <td class="d-flex gap-2">
                        <a href="/expenses/edit/${expense.id}">
                            Edit
                        </a>
                     
                        <form action="/expenses/${expense.id}" method="post">
                            <input type="hidden" name="_method" value="delete">
                            <input class="btn btn-danger" type="submit" value="Delete">
                        </form>
                    </td>
                </tr>
            
            </c:forEach>
        </tbody>
    </table>
    
    
    <form:form class="container center" action="/expenses" method="post" modelAttribute="expense">
        <h2>Add an Expense: </h2>
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

        <input type="submit" value="Create An Expense">
    </form:form>

</body>
</html>