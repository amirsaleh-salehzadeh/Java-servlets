<%@ page import="common.*" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Login</title>
<style type="text/css">
<!--
.style3 {color: #999999}
.style5 {font-size: 18px; font-weight: bold; color: #999999; }
.style7 {
	color: #FFFFFF;
	font-weight: bold;
	font-size: 24px;
}
.style8 {
	color: #FFFFFF;
	font-size: 20px;
}
.style10 {font-family: "Times New Roman", Times, serif}

-->
</style></head>

<body background="images/Background.jpg">
<table width="1065"  bgcolor="#000000" border="1" align="center" cellspacing="0" cellpadding="0">
<tr>
    <td colspan="5" bgcolor="#000000"><div align="center"><img src="images/crooks_and_castles_logo.jpg" width="220" height="120" alt="01" /></div></td>
</tr>
<tr >
    <td ><div align="center" class="style5"><a href="main.html">Home</a></div></td>
	<td><div align="center" class="style5"><a href="Aboutus.html">About us</a></div></td>
	<td><div align="center" class="style5"><a href="Contactus.html">Contact us</a></div></td>
	<td><div align="center" class="style5">Login</div></td>
	
</tr>
<tr>
    <td colspan="5"> <marquee scrolldelay="170">
        <span class="style7">Please enter your Username/Password and enjoy your shopping. Please Register as a new user</span>
    </marquee></td>
</tr>
<% Userparam u = (Userparam)session.getAttribute("user");
    if (u!=null){
%>
<tr>
    <td > 
          <div style="background-color: #aaa; color:#555;">
              <a href="MyProjServlet?whatToDo=logout">Logout</a>
          </div>
    </td>
</tr>
<%}%>
<tr><td colspan="5">
<table width="30%" ><form action="MyProjServlet" method="post">
    <tr>
	    <td>
                 <span style="color: red;">
                     <% if(request.getParameter("alert")!=null){
                        out.print(request.getParameter("alert"));
                     } %> 
                    
                 </span><br/>
                 <input type="hidden" name="whatToDo" value="login"><p align="center"><br />
	      <span class="style8"><span class="style10">Username:</span>&nbsp;</span>
	      <input type="text" name="Username" Id="textuser" size="30" />
		  <br />
		  <br />
		  <span class="style8"><span class="style10">Password:</span>&nbsp;</span>
		  <input type="password" name="Password" id="pass"  size="30" />	
		  <br />
		  <br />	
		  <input name="Login" type="submit" value="Login" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  <span class="style8"><span class="style10"><a href="Register.html">Register</a></span></span>
		  </p>
		  
		</td>
	</tr>
     </form>
</table>
</td></tr>
<tr>
    <td colspan="5"><div align="center" class="style3">Copyright 2009. Crooks &amp; Castles logo and site content is the Copyright ownership of Mohammad TRavanchi.</div></td>
</tr>
</table>
</body>
</html>
