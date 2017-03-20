<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page import="common.*" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Shop</title>
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
<tr>
    <td colspan="5"> <marquee scrolldelay="170">
        <span class="style7">Welcome Mr/Mrs <%=u.getName() +" "+ u.getFamily() %></span>
    </marquee></td>
</tr>
<tr><td colspan="5">
<table width="100%" style="color:#fff;" >
                <%if("role1".equalsIgnoreCase(u.getRole())){%>
                    <tr>
                        <td>test1</td>
                    </tr>
                 <%}%>
                 <%if("role2".equalsIgnoreCase(u.getRole())){%>
                    <tr>
                        <td>test2</td>
                    </tr>
                 <%}%>
                 <%if("superAdmin".equalsIgnoreCase(u.getRole())){%>
                 
                    <tr>
                        <td>test3</td>
                    </tr>
		<%}%>
</table>
</td></tr>
<tr>
    <td colspan="5"><div align="center" class="style3">Copyright 2009. Crooks &amp; Castles logo and site content is the Copyright ownership of Mohammad TRavanchi.</div></td>
</tr>
</table>
</body>
</html>
