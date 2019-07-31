<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Modify Operation</h1>
<form action="modify-trainee11" method="post">
<table>
<tr><td>Please enter trainee ID<input type="text" name="mod"/><input type="submit" value="modify"/>
</td></tr>
</table>
</form>
<br>
<br>
<s:form action="modify-trainee12" method="post" modelAttribute="trainee1">
<table>
<tr> <td>Trainee Id<input type="text" name="traineeId" value="${list.traineeId}"/></td></tr> 
<tr> <td>Trainee Name<input type="text" name="traineeName" value="${list.traineeName}"/></td></tr>
<tr> <td>Trainee Location<input type="text" name="traineeLocation" value="${list.traineeLocation }"/></td></tr>
<tr> <td>Trainee Domain<input type="text" name="traineeDomain" value="${list.traineeDomain }"/></td></tr>
<tr><td><input type="submit" value="Update"/></td></tr>
</table>
</s:form>
</body>
</html>