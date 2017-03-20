<%-- 
    Document   : categoryList
    Created on : Mar 18, 2011, 1:10:32 PM
    Author     : Talieh Dastmalchi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>

<%@ page import="Common.*"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>List of Companies</title>
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
					<form action="searchForCategory">
					Search For Category:
					<input type="text" name="search">
					<input  type="submit" value="Search On Category">
					</form> 
				</td>
			</tr>
			<tr>
				<td>
					<table border="1" align="center">
						<tr>
							<th class="header">
								Index
							</th>
							<th class="header">
								name
							</th>
						</tr>
						<% ArrayList<CategoryENT> ents = (ArrayList<CategoryENT>)session.getAttribute("categoryList"); 
                            //create a list of categories from the categoryList session    
                            for(int i = 0 ; i < ents.size() ; i ++ ){
                                //list all the categories attributes in the table    
                            %>
						<tr>
							<td class="listItem">
								<%= i+1 %>
							</td>
							<td class="listItem">
								<a href="searchForCar?categId=<%=ents.get(i).getCategoryid() %>"> <%= ents.get(i).getName() %></a>
							</td>
						</tr>
						<%}%>
					</table>
				</td>
			</tr>
		</table>

	</body>
</html>
