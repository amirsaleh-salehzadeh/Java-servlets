<%-- 
    Document   : admin
    Created on : Mar 17, 2011, 1:10:32 PM
    Author     : Talieh Dastmalchi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Administrator</title>
	</head>
	<body>
		<table align="center">
			<tr>
				<td>
					<jsp:include page="menu.jsp"></jsp:include>
				</td>
			</tr>
			<tr>
				<td>
					<a href="insertCategory.jsp">New Category</a>
				</td>
			</tr>
			<tr>
				<td>
					<a href="insertCar.jsp">New Car</a>
				</td>
			</tr>
			<tr>
				<td>
					<a href="userList">Users Control</a>
				</td>
			</tr>
		</table>

	</body>
</html>
