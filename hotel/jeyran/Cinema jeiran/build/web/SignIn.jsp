<%-- 
    Document   : SignIn
    Created on : Jan 31, 2010, 1:11:41 PM
    Author     : Jeiran
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
  

 <%@ include file="Header.jsp" %>   

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>SignIn</title>

	<link rel="stylesheet" href="style.css" />
	
</head>

<body id="body">
	<!--Header-->
	
	
	<!--MainBody-->	
	<div id="content">
		<!--LeftBaner-->
		<div id="bannerL_signIn"  class="banL_span">
				<p class="fontTitle">SIGN In</p>
                                        <p id="error">
                                        <% if (request.getParameter("msg") != null) {
                out.println(request.getParameter("msg"));
                } %></p>
			 		<b>I have an account.</b><br /> 
					If you have already created an account with MELLI CINEMA Online, 
					please enter your username and password below.<br />
					<form action="LoginServlet" method="get">
						USERNAME:<br />
						<input type="text" name="username" /><br />
						PASSWORD:<br />
						<input type="password" name="password" /><br /><br />
						<input class="submit" type="submit" value="SIGN IN" />
					</form>
		</div>	
		<!--MiddleBody-->
		<div id="middleBody_signIn"  class="banL_span">
			<p><b>NOT A MEMBER YET?</b><br />
				To be ale to RESERVE A MOVIE ONLINE you need to create an account!
				We welcome you to create an account now. </p>
				<form action="Register.jsp" method="get">
						
						<input class="submit" type="submit" value="REGISTER" />
				</form>
		 </div>	
		
	<!--Footer-->
	<div id="footer">
		<font color="#000000">
						© 2010 MELLI CINEMA. All worldwide rights reserved.					</font>	
	</div>	

</body>
</html>
