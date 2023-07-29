<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ page import ="java.sql.*" %>


<%


String roll_no = request.getParameter("t1");
int roll=Integer.parseInt(roll_no);
String name = request.getParameter("t2");
String result = request.getParameter("t3");
int res=Integer.parseInt(result);
String grade = request.getParameter("t4");

Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/connectdb","root","dipti143#");
PreparedStatement ps = con.prepareStatement("insert into reasult values(?,?,?,?)");



ps.setInt(1, roll);
ps.setString(2, name);
ps.setInt(3, res);
ps.setString(4, grade);

int i=ps.executeUpdate();

if(i>0)
{
response.sendRedirect("index.html");
}

%>

</body>
</html>