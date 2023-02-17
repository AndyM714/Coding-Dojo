<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Omikuji</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
    <link rel="stylesheet" href="/css/main.css" />
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script>
  </head>
  <body>
    <div class="container d-flex justify-content-center">
      <div class="card mt-3 d-flex justify-content-center">
        <div class="card-body ">
          <h1>Here's Your Omikuji</h1>
          <p>
            In <c:out value="${number}" /> years, you will live
            <c:out value="${city}" /> with <c:out value="${name}" /> as your
            roommate, <c:out value="${hobby}" /> for a living. The next time you
            see a <c:out value="${livingThing}" /> you will have good luck.
            Also,
            <c:out value="${niceComment}" />
          </p>
          <a href="/"> Go Back</a>
        </div>
      </div>
    </div>
  </body>
</html>
