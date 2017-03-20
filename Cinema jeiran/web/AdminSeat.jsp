

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="Cinema.common.SeatENT" %>
<%@ page import="java.util.ArrayList" %>
<%@ include file="HeaderAdmin.jsp" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body id="body">
	
	
	<!--MainBody-->	
	<div id="content">
		<!--LeftBaner-->
		<div id="bannerL_register"  class="banL_span">
						</div>	
		<!--MiddleBody-->
		<div id="middleBody_register" ></div>
		
		<!--Content-->
		<table>
                     <% ArrayList<SeatENT> seats =(ArrayList<SeatENT>)session.getAttribute("seatlist");
                     
                        for(int i=0;i< seats.size();i++){
                     %>
                    <tr>
                        <td><%=seats.get(i).getSeat_number() %></td>
                        <td><%=seats.get(i).getRow() %></td>
                        
                    </tr>
                    <%}%>
                </table>
           
		<!--RightBanner-->
		<div id="bannerR" class="fontMenu">
			<div class="banR_span"> 
				<span class="test"><p><a  href="SignIn.html"> Sign In </a> </p></span>
			
				<a  href="#">VIEW RESERVATIONS</a><br />        
				<a  href="#">MY ACCOUNT</a><br />  
				<a  href="#">FIND A MOVIE</a><br />
				<a  href="#">CUSTOMER SERVICES</a><br />
							</div>
		</div>
	</div>
	
	<!--Footer-->
	<div id="FFooter">
		<font color="#000000">
						© 2010 MELLI CINEMA. All worldwide rights reserved.					</font>	
	</div>	
</body>
</html>
