<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
<style>
.reg{
border:2px solid;
width:30%;
height:300px;
text-align:center;
box-shadow:2px 2px 5px grey;
padding:30px;
}
</style>
<meta charset="UTF-8">
<title>login</title>
</head>
<body>
<ul class="nav nav-pills">
  <li class="nav-item">
    <a class="nav-link active" aria-current="page" href="login.jsp">Login</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="register.jsp">Register</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="contact.jsp">contact us</a>
  </li>
</ul>
<center>
<fieldset class="reg">
<legend>register</legend>

<form  action="login">
    <label>Email</label>
    <input type="email" required><br><br>
    <label>Password</label>
    <input type="password"  required><br><br>
    <button class="btn btn-primary" type="submit">login</button>
  </form>
</fieldset>
</center>
</body>
</html>