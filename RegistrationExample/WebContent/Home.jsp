<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
keep the page running for 30 seconds...
<br> try reloading the page
<br>you will get direction to home page...
<br>
<%
if(session!=null)
{
 if(session.getAttribute("user")!=null)
 {
	 String name=(String)session.getAttribute("user");
	 out.print("hello,"+name+"welcome to your profile page...");
 }
 else
 {
	 response.sendRedirect("Login.html");
	 
 }
}
%>
<br><br><br>
<form action="LogOutController" method="post">
<input type="submit" name="submit" value="submits">
</form>
</body>
</html>