<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page import="Cinema.common.CustomerENT" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Cinema.common.MovieENT" %>
<%@ include file="Header.jsp" %> 
<%@ include file="RightBanner.jsp" %> 

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title> Home </title>

	<link rel="stylesheet" href="style.css" />
	

	
	
	
</head>
	
<body id="body" >
	<!--Header-->
	
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
                    ArrayList<MovieENT> movies = (ArrayList<MovieENT>)session.getAttribute("movielist");
                    for(int i = 0; i < movies.size(); i++) {
                        %>
                        <tr>
                            <td><%= movies.get(i).getMovie_name() %></td>
                            <td><%= movies.get(i).getDirector() %></td>
                            <td><%= movies.get(i).getProducer() %></td>
                            <td><%= movies.get(i).getStart_date() %></td>
                            <td><%= movies.get(i).getPrice() %></td>
                            
                             
                            <td></td>
			</tr>
                        <%
                    }
                 %>
		</table>
	
		
		
			<!--RightBanner-->
			
	
	
	<!--Footer-->
	<div id="footer">
		<font color="#000000">
						© 2010 MELLI CINEMA. All worldwide rights reserved.					
                                                 </font>	
	</div>	


</body>
</html>
