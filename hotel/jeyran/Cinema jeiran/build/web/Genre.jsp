<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page import="java.util.ArrayList" %>
<%@ page import="Cinema.common.GenreENT" %>
<%@ page import="Cinema.common.MovieENT" %>
<%@ include file="Header.jsp" %> 
<%@ include file="RightBanner.jsp" %> 

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Movies</title>
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
                     <% ArrayList<GenreENT> genres =(ArrayList<GenreENT>)session.getAttribute("genrelist");
                     
                        for(int i=0;i< genres.size();i++){
                     %>
                    <tr>
                        <td><a href="SearchByGenreServlet?id=<%=genres.get(i).getGenre_id() %>"><%=genres.get(i).getGenre() %></a></td>
                        
                    </tr>
                    <%}%>
                </table>
                <%CustomerENT cent = new CustomerENT();
         if(session.getAttribute("userENT")!=null)
            cent = (CustomerENT)session.getAttribute("userENT");%>
                <% if(session.getAttribute("moviegenre") != null) { %>
                <table border="1">
                      <tr>
                          <th>&nbsp;</th>
                        <th>Movie Name</th>
                        <th>Diresctor</th>
                        <th>Producer</th>
                        <th>Date</th>
                        <th>Price</th>
                        <%if(cent.getIsActive()>0){%>
                        <th>book</th>
                        <%}%> 
                    </tr>
                    <% ArrayList<MovieENT> movie =(ArrayList<MovieENT>)session.getAttribute("moviegenre");
                     
                        for(int i=0;i< movie.size();i++){
                     %>
                   
                      
                    <tr>
                        <td><img height="50" width="50" src="images/<%=movie.get(i).getImage()%>"></td>
                        <td><%= movie.get(i).getMovie_name() %></td>
                        <td><%= movie.get(i).getDirector() %></td>
                         <td><%= movie.get(i).getProducer() %></td>
                          <td><%= movie.get(i).getStart_date() %></td>
                           <td><%= movie.get(i).getPrice() %></td>
                       <td><a href="previewMovie?Movieid=<%= movie.get(i).getMovie_id() %>">book</a></td>
                        
                    </tr>
                    <%}%>
                </table>
                <% } %>
		
	
	<!--Footer-->
	<div id="FFooter">
		<font color="#000000">
						© 2010 MELLI CINEMA. All worldwide rights reserved.					</font>	
	</div>	
</body>
</html>
