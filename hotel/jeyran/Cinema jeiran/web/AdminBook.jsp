<%-- 
    Document   : AdminBook
    Created on : Feb 17, 2010, 12:29:38 PM
    Author     : Jeiran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="Cinema.common.BookENT" %>
<%@ include file="HeaderAdmin.jsp" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="style.css" />
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
                 <table border="2">
                 <%
                    ArrayList<BookENT> book = (ArrayList<BookENT>)session.getAttribute("booklist");
                    for(int i = 0; i < book.size(); i++) {
                        %>
                        <tr>
                            <td><%%></td>
                            
			</tr>
                        <%
                    }
                 %>
		</table>
		
		<!--RightBanner-->
		<div id="bannerR" class="fontMenu">
			<div class="banR_span"> 
				<span class="test"><p><a  href="SignIn.html"> Sign In </a> </p></span>
			
				<a  href="#">Manage Movies</a><br />        
				<a  href="#">Manage Seats</a><br />  
				<a  href="#">Manage Users</a><br />
				<a  href="#">Mnage Booking</a><br />
							</div>
		</div>
	</div>
	
	<!--Footer-->
	<div id="footer">
		<font color="#000000">
						© 2010 MELLI CINEMA. All worldwide rights reserved.					</font>	
	</div>	
</body>
</html>