<%-- 
    Document   : insertCategory
    Created on : Mar 22, 2011, 1:10:32 PM
    Author     : Talieh Dastmalchi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>New Category</title>
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
					<form method="post" action="insertCategory">
						Add A category
						<br />
						Category Name:
						<input type="text" name="categoryName">
						<br />
						<input type="submit" value="New Category">
					</form>
				</td>
			</tr>
		</table>

	</body>
</html>
