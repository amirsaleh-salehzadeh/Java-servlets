<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page import="Cinema.common.CustomerENT" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Cinema.common.*" %>
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
                 <form action="searchForMovie">
                 Search:<input type="text" name="search"><input type="submit" value="search">
                     </form>
		<!--Content-->
               <%CustomerENT cent = new CustomerENT();
         if(session.getAttribute("userENT")!=null)
            cent = (CustomerENT)session.getAttribute("userENT");%>
         <table border="2">
             <tr>
                 <th>&nbsp;</th>
                <th>Movie_name</th>
                <th>Director</th>
                <th>Producer</th>
                <th>Start date</th>
                <th>price</th>
                <%if(cent.getIsActive()>0){%>
                <th>book</th>
                <%}%> 
             </tr>
         <%
         
         
         ArrayList<MovieENT> movies = (ArrayList<MovieENT>)session.getAttribute("movielist");
                    for(int i = 0; i < movies.size(); i++) {
                        %>
                        <tr>
                            <td><img height="50" width="50" src="images/<%=movies.get(i).getImage()%>"></td>
                            <td><%= movies.get(i).getMovie_name() %></td>
                            <td><%= movies.get(i).getDirector() %></td>
                            <td><%= movies.get(i).getProducer() %></td>
                            <td><%= movies.get(i).getStart_date() %></td>
                            <td><%= movies.get(i).getPrice() %></td>
                            <%if(cent.getIsActive()>0){%>
                            <td><a href="previewMovie?Movieid=<%= movies.get(i).getMovie_id() %>">book</a></td>
                            <%}%>
                            
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
