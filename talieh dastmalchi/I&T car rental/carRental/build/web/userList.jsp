<%-- 
    Document   : userList
    Created on : Mar 17, 2011, 1:10:32 PM
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
		<title>List of Users</title>
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
					<table border="1" align="center">
						<tr>
							<th class="header">
								Index
							</th>
							<th class="header">
								Username
							</th>
							<th class="header">
								Name
							</th>
							<th class="header">
								Familyname
							</th>
							<th class="header">
								Is active
							</th>

						</tr>
						<% ArrayList<UserENT> pl = (ArrayList<UserENT>)session.getAttribute("userListSession"); 
                            //create a list of users from the user session    
                            for(int i = 0 ; i < pl.size() ; i ++ ){
                                //list all the users attributes in the table    
                                UserENT p = pl.get(i);
                            %>
						<tr>
							<td class="listItem">
								<%= i+1 %>
							</td>
							<td class="listItem">
								<%= p.getUserName() %>
							</td>
							<td class="listItem">
								<%= p.getName() %>
							</td>
							<td class="listItem">
								<%= p.getFName() %>
							</td>
							<td class="listItem">
								<%if(p.isActive()){%>
								<a
									href="confirmUser?activate=FALSE&activateId=<%= p.getUserName() %>">
									Deactive </a>
								<%}else{ %>
								<a
									href="confirmUser?activate=TRUE&activateId=<%= p.getUserName() %>">
									Active </a>
								<%} %>
							</td>

						</tr>
						<%}%>
					</table>
				</td>
			</tr>
		</table>

	</body>
</html>
