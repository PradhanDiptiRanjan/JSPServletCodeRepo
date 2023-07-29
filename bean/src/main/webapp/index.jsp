<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
out.println("<body style='background-color:green;'>");
	<jsp:useBean id="obj" class="calculator.calc"/> 
	
	  
	<%  
	int m=obj.cube(9);  
	out.print("Cube of 9 is: "+m);  
	%>
</body>
</html>