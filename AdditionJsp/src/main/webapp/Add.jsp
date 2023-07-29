<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
String a=request.getParameter("t1");
String b=request.getParameter("t2");
int n1=Integer.parseInt(a);
int n2=Integer.parseInt(b);
int sum=n1+n2;
%>
<h1>Sum Is :<%= sum %></h1>

</body>
</html>