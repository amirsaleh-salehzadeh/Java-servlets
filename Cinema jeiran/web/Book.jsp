<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page import="java.util.ArrayList" %>

<%@ page import="Cinema.common.MovieENT" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Movies</title>
	<link rel="stylesheet" href="style.css" />
	
	
</head>

<body id="body">
	<!--Header-->
	<div id="header">
		<div >
			<a href="Home.html" ><img src="logo.jpg" alt="Home" id="logoPic" class="picLink"/></a>
		</div>
		<!--Title-->
		<div align="right"><span class="title">WELCOME TO <span style="font-size:24px;">Melli Cinema</span> website</span></div>
		<!--Menu-->
		<div id="menu" >
			<table class="fontMenu" cellpadding="5px">
					<tr>
						<td class="menuLink"><a href="#">Home</a></td>
						<td class="menuLink"><a href="#" >Movies</a></td>
						<td class="menuLink"><a href="#">Reseve a Movie</a></td>
						<td class="menuLink"><a href="#">About Us</a></td>
						<td class="menuLink"><a href="#">Contact Us</a></td>
					</tr>
			</table>
		</div>
		<!--Search-->
		
	</div>
	
	<!--MainBody-->	
	<div id="content">
		<!--LeftBaner-->
		<div id="bannerL_register"  class="banL_span">
						</div>	
		<!--MiddleBody-->
		<div id="middleBody_register" ></div>
		
		<!--Content-->
                 <span>Your movie was booked sucessfully.</span>
                 
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
