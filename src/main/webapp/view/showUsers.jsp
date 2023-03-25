<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registered Users List !</title>
<link rel="stylesheet"  href="/css/style.css">
</head>
<body>
  <h3>Registered Users List !! </h3>
  <table>
  <tr>
    <th>Name</th>
    <th>Email</th>
    <th>Gender</th>
    <th>Contact No.</th>
  </tr>
  <c:forEach var="user" items="${users}">
      <tr>
         <td><c:out value="${user.name}"></c:out></td>
         <td><c:out value="${user.email}"></c:out></td>
         <td><c:out value="${user.gender}"></c:out></td>
         <td><c:out value="${user.contact}"></c:out></td>
      </tr>
  </c:forEach>
  </table>
</body>
</html>