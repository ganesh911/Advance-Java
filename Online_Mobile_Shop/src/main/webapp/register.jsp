<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<style>
.reg{
border:2px solid;
width:30%;
height:400px;
margin:50px;
text-align:center;
box-shadow:2px 2px 5px grey;
padding:30px;
}
</style>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-aFq/bzH65dt+w6FI2ooMVUpc+21e0SRygnTpmBvdBgSdnuTN7QbdgL+OapgHtvPp" crossorigin="anonymous">
</head>
<body>
<center>
<fieldset class="reg">
<legend>register</legend>
<form  action="login.jsp">
<label >name</label>
    <input type="text"  required name ="name"><br><br>
    <label>Email</label>
    <input type="email" required name = "email"><br><br>
    <label>Password</label>
    <input type="password"  required name = "password"><br><br>
    <label >City</label>
    <input type="text"  required name="address"><br><br>
    <button class="btn btn-primary" type="submit">register</button>
  </form>
</fieldset>
</center>
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha2/dist/js/bootstrap.bundle.min.js" integrity="sha384-qKXV1j0HvMUeCBQ+QVp7JcfGl760yU08IQ+GpUo5hlbpg51QRiuqHAJz8+BrxE/N" crossorigin="anonymous"></script>
</body>
</html>