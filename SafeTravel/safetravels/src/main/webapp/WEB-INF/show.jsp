<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix = "c" uri =
"http://java.sun.com/jsp/jstl/core" %> <%@ taglib
uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> <%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form"%> <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Travel</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/main.css" />
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script>
  </head>
  <body>
    <div class="container center">
      <div class="d-flex justify-content-between">
        <h1 class="text-center">Expense Details</h1>
        <a href="/">Go Back</a>
      </div>

      <table class="table container center text-center">
        <thead>
          <th>Expense</th>
          <th>Vendor</th>
          <th>Amount</th>
          <th>Description</th>
        </thead>
        <tbody>
          <tr>
            <td>${expense.expenseName}</td>
            <td>${expense.vendor}</td>
            <td>${expense.amount}</td>
            <td>${expense.description}</td>
          </tr>
        </tbody>
      </table>
    </div>
  </body>
</html>
