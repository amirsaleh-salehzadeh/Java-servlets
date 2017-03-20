<%-- 
    Document   : insertCar
    Created on : Mar 22, 2011, 1:10:32 PM
    Author     : Talieh Dastmalchi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Common.CategoryENT"%>
<%@page import="Business.bsManager"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>New Car</title>
	</head>
	<body>
		<table align="center">
			<tr>
				<td><br> <jsp:include page="menu.jsp"></jsp:include>
				<br></td>
			</tr>
			<tr>
				<td>
					<form method="post" action="insertCar">
						Add A Car
						<br />
						Category Name:
						
						<select name="categId">
						<%
						bsManager bsManager = new bsManager(); 
					ArrayList<CategoryENT> ents = bsManager.searchACategory(""); 
							for(int i  = 0 ; i < ents.size() ; i++){
							out.print("<option value='"+ents.get(i).getCategoryid()+"'>"+ents.get(i).getName()+"</option>");
							}
						%>
						</select>
						<br />
						Car Name:
						<input type="text" name="name">
						<br />
						price:
						<input type="text" name="price">
						<br />
						<input type="submit" value="New Car">
					</form>
				</td>
			</tr>
		</table>

	</body>
</html>
