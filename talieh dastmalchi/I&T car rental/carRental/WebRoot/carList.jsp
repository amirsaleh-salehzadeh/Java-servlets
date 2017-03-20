<%-- 
    Document   : carList
    Created on : Mar 18, 2011, 1:10:32 PM
    Author     : Talieh Dastmalchi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>

<%@ page import="Common.*"%>
   <%@ page import="java.text.DateFormat" %>
   <%@ page import="java.text.SimpleDateFormat" %>
   <%@ page import="java.util.ArrayList" %>
   <%@ page import="java.util.Date" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>List of cars</title>
	</head>
	<body>
		<table align="center">
			<tr>
				<td>
					<jsp:include page="menu.jsp"></jsp:include>
				</td>
			</tr>
			<%ArrayList<CarENT> ents = (ArrayList<CarENT>)session.getAttribute("cars");  %>
			<tr>
				<td>
					<form action="searchForCar">
					<%CategoryENT categoryENT = (CategoryENT)request.getSession().getAttribute("category");
					
					 %>
					<input type="hidden" value="<%=categoryENT.getCategoryid() %>" name="categId">
					
					Search For Car:
					<input type="text" name="search">
					<input  type="submit" value="Search On Cars">
					</form> 
				</td>
			</tr>
			<form action="rentACar">
			<%
			UserENT userENT = new UserENT();
			if(request.getSession().getAttribute("user")!=null)
				userENT = (UserENT)request.getSession().getAttribute("user"); %>
			<input type="hidden" value="<%=userENT.getUserName() %>" name="userName">
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
							<th class="header">
								price
							</th>
							<th class="header">
								select
							</th>
						</tr>
						<% 
                            for(int i = 0 ; i < ents.size() ; i ++ ){
                            %>
						<tr>
							<td class="listItem">
								<%= i+1 %>
							</td>
							<td class="listItem">
								<%= ents.get(i).getName() %>
							</td>
							<td class="listItem">
								<%= ents.get(i).getPrice() %>
							</td>
							<td class="listItem">
								<input type="radio" name="carId" value="<%= ents.get(i).getProductid() %>">
							</td>
						</tr>
						<%}%>
						<%
                            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                            Date date = new Date();
                            %>
                           
					</table>
				</td>
			</tr>
			<%if(userENT.isActive()){ %>
			 <tr>
              	<td>
              		From Date:<input type="text" name="startDate" value="<%=dateFormat.format(date)%>">
              To Date:<input type="text" name="endDate" value="<%=dateFormat.format(date)%>">
              <input type="submit" value="rent">
              	</td>
              </tr>
              <%} %>
                            </form>
		</table>

	</body>
</html>
