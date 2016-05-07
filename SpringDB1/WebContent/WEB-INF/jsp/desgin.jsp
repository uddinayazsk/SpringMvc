<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<form:form action="result.html" modelAttribute="user">
Name<form:input path="name"/><br>
Age<form:input path="age" /> <br>
City<form:input path="city"/><br>
<input type="submit" value="Submit"><br>
<input type="reset" value="Reset">

</form:form>
<a href="desgin1.html">Do Want To View The Details...
!</a>
</center>
</body>
</html>