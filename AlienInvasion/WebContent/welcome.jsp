<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	HttpSession ses=request.getSession();
	if(ses.getAttribute("User")==null){
		response.sendRedirect("login.jsp");
	}
	else if(!ses.getAttribute("User").equals("Biswa") && !ses.getAttribute("pwd").equals("biswa"))
	{
		response.sendRedirect("error.jsp");
	}

%>
	<h2>Welcome ${User}, Have a pleasant time in Earth!!</h2>
	
</body>
</html>