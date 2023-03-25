<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Data</title>
<link rel="stylesheet" href="/css/style.css" >
</head>
<body>
   <h3>REGISTRATION FORM</h3>
   <div>
      <form action="/registerData" method="POST" >
          <div>Name : <input  placeholder="Enter your name" type="text" name="name" /></div>
          <div>Email : <input  placeholder="Enter your email" type="email" name="email" /></div>
          <div>Gender : <input   type="radio" name="gender" value="Male" >Male</input>
               <input   type="radio" name="gender" value="Female" >Female</input>
          </div>
          <div>Contact Number : <input  placeholder="Enter your contact Number" type="tel" name="contact" /></div>
          
          <div><button type="submit" >SUBMIT</button></div>
      
      </form>
   
   </div>
</body>
</html>