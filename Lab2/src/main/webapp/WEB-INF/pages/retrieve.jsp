<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Retrieve Operation</h1>
<form action="retrieve-trainee" method="post">
<table>
<tr><td>Please enter trainee ID<input type="text" name="retrieve1"/><input type="submit" value="retrieve"/>
</td></tr>
</table>
</form>
<table border="1">
<tr><th>Trainee ID</th>
<th>Trainee Name</th>
<th>Trainee Location</th>
<th>Trainee Domain</th></tr>

<tr>
<td>${list.traineeId}</td>
<td>${list.traineeName}</td>
<td>${list.traineeLocation}</td>
<td>${list.traineeDomain}</td></tr>
</table>

</body>
</html>