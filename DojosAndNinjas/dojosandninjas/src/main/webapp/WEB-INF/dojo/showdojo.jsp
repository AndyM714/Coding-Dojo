<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%@ taglib prefix = "c" uri =
"http://java.sun.com/jsp/jstl/core" %> <%@ taglib
uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %> <%@ taglib prefix="form"
uri="http://www.springframework.org/tags/form"%> <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>New Dojo</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/main.css" />
    
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script>
  </head>
  <body>
    <h1>${dojo.name} Location Ninjas</h1>
    <table>
      <thead>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Age</th>
      </thead>
      <tbody>
        <c:forEach var="ninja" items="${dojo.ninja}">
          <tr>
            <td>${ninja.firstName}</td>
            <td>${ninja.lastName}</td>
            <td>${ninja.age}</td>
          </tr>
        </c:forEach>
      </tbody>
    </table>
  </body>
</html>
