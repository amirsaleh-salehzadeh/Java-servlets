<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page import="java.util.ArrayList" %>
<%@ page import="Cinema.common.MovieENT" %>
<%@ include file="HeaderAdmin.jsp" %> 


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
               <form action="AddMovieServlet" method="post">
                   Movie Name:<input type="text" name="movie_name"/><br/>
                   Director Name:<input type="text" name="director"/><br/>
                   Producer Name:<input type="text" name="producer"/><br/>
                   Price:<input type="text" name="price"/><br/>
                   Date:<input type="text" name="date"/><br/>
                   Genre:<select name="genre"><br/>
                       <option value="1">Action</option>
                       <option value="2">Romantic Comedy</option>
               </select><br/>
               <input type="submit" value="Add"><br/>
                   
               </form>
		
		<!--RightBanner-->
		<div id="bannerR" class="fontMenu">
			<div class="banR_span"> 
				<span class="test"><p><a  href="SignIn.html"> Sign In </a> </p></span>
			
				<a  href="#">Manage Movies</a><br />        
				<a  href="#">Manage Seats</a><br />  
				<a  href="CustomerAdminServlet">Manage Users</a><br />
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
