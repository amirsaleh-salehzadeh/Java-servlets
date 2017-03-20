<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page import="java.util.ArrayList" %>
<%@ page import="Cinema.common.GenreENT" %>

<%@ include file="HeaderAdmin.jsp" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Admin Genre</title>
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
		<table>
                     <% ArrayList<GenreENT> genres =(ArrayList<GenreENT>) session.getAttribute("genrelist");
                     
                        for(int i=0;i< genres.size();i++){
                     %>
                    <tr>
                        <td><%=genres.get(i).getGenre() %></td>
                        
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
