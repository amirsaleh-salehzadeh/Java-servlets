<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ include file="Header.jsp" %> 
<%@ include file="RightBanner.jsp" %> 
<%@ page import="Cinema.common.MovieENT" %>
   <%@ page import="java.text.DateFormat" %>
   <%@ page import="java.text.SimpleDateFormat" %>
   <%@ page import="java.util.ArrayList" %>
   <%@ page import="java.util.Date" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Movies</title>
	<link rel="stylesheet" href="style.css" />
	
	
</head>

<body id="body">
	<!--Header-->
	<!--MainBody-->	
	<div id="content">
		<!--LeftBaner-->
		<div id="bannerL_register"  class="banL_span">
						</div>	
		<!--MiddleBody-->
		<div id="middleBody_register" ></div>
		
		<!--Content-->
                 <form action="BookServlet" method="post">
                 <table border="2">
             <tr>
                 <th>&nbsp;</th>
                <th>Movie_name</th>
                <th>Director</th>
                <th>Producer</th>
                <th>Start date</th>
                <th>price</th>
                <th>reserve Date</th>
                <th>time</th>
                <th>tickets</th>

               
             </tr>
         <%
         
         
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        
                            
         MovieENT movies = (MovieENT)session.getAttribute("movie");
                    
                        %>
                        <tr>
                            <td><img height="50" width="50" src="images/<%=movies.getImage()%>"></td>
                            <td><%= movies.getMovie_name() %></td>
                            <td><%= movies.getDirector() %></td>
                            <td><%= movies.getProducer() %></td>
                            <td><%= movies.getStart_date() %></td>
                            <td><%= movies.getPrice() %>
                                
</td>
                            <td><input type="text" name="date" size="9" value="<%=dateFormat.format(date)%>"></td>
                            <td>
                                <select name="time">
                                <option value="10-12">10-12</option>
                                <option value="12-14">12-14</option>
                                <option value="14-16">14-16</option>
                                <option value="16-18">16-18</option>
                                <option value="18-20">18-20</option>
                                </select>
</td>
<td>
    <input type="text" size="1" name="tickets" value="1">
        
        <input type="hidden" name="price" value="<%=movies.getPrice()%>">
        <input type="hidden" name="movieId" value="<%=movies.getMovie_id()%>">
</td>

                            
			</tr>
                         <tr>
                             <td colspan="9" align="center">
                                 <input type="submit" value="Book">
                             </td>
                         </tr>
                        
		</table>
                 </form>
		<!--RightBanner-->

	</div>
	
	<!--Footer-->
	<div id="FFooter">
		<font color="#000000">
						© 2010 MELLI CINEMA. All worldwide rights reserved.					</font>	
	</div>	
</body>
</html>

