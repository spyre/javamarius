<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.net.URLEncoder" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<%
	String appid = "1675676639370710";
	String domeniu = "http://myappengineappid.appspot.com/login.jsp";
    String fbURL = "http://www.facebook.com/dialog/oauth?client_id="+appid+"&redirect_uri=" + URLEncoder.encode(domeniu) + "&scope=email";
%>

<a href="<%= fbURL %>">LOGIN</a>

</body>
</html>