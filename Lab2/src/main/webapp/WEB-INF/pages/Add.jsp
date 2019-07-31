<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter trainee details</h1>
<form action="add-trainee" method="post">
<table>
<tr> <td>Trainee Id<input type="number" name="traineeId"/></td></tr> 
<tr> <td>Trainee Name<input type="text" name="traineeName"/></td></tr>
<tr> <td>Trainee Location</td><td><input type="radio" value="chennai" name="Location"/>Chennai</td>
<td><input type="radio" value="bangalore" name="Location"/>Bangalore</td>
<td><input type="radio" value="Pune" name="Location"/>Pune</td>
<td><input type="radio" value="mumbai" name="Location"/>Mumbai</td></tr>
<tr> <td>Trainee Domain</td><td>
<select name="traineeDomain">
  <option value="java">Java</option>
  <option value=".net">.NET</option>
  <option value="android">Android</option>
  
</select>
</td></tr>
<tr><td><input type="submit" value="Add Trainee"/></td></tr>
</table>
</form>
</body>
</html>