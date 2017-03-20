<%@ page import="common.*" %>
<%--
 *
 * @author Mohammad
 --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Admin</title>
<style type="text/css">
<!--
.style3 {color: #999999}
.style7 {
	color: #CC0033;
	font-weight: bold;
	font-size: 24px;
}
.style11 {
	color: #FFFFFF;
	font-family: "Times New Roman", Times, serif;
	font-size: 20px;
}

-->
</style></head>

<body background="images/Background.jpg">
<table width="1065"  bgcolor="#000000" border="1" align="center" cellspacing="0" cellpadding="0">
<tr>
    <td  bgcolor="#000000"><div align="center"><img src="images/crooks_and_castles_logo.jpg" width="220" height="120" alt="01" /></div></td>
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
    <td > <marquee scrolldelay="170">
        <span class="style7">Welcome Admin</span>
    </marquee></td>
</tr>
<tr><td height="160" >
<table width="70%" align="center" >
    <br /><br /><tr>
	    <td>
                 <%if("superAdmin".equalsIgnoreCase(u.getRole())){%>
	      <div align="left"><span class="style11"><a href="MyProjServlet?whatToDo=allUsers">Show New Members</a></span> </div></td>
               <%}%>
		<td>
                 <div align="right"><span class="style11">
                  <span style="color: red;">
                     <% if(request.getParameter("alert")!=null){
                        out.print(request.getParameter("alert"));
                     } %> 
                    
                 </span><br/>
                     Add New Role
                     <form action="MyProjServlet" method="post">
                     <input type="text" name="role">
                     <input type="hidden" name="whatToDo" value="addRole">
                     <%if("superAdmin".equalsIgnoreCase(u.getRole())){%>
                        <input type="submit" value="Add role">
                     <%}%>
                 </form></span></div></td>
	</tr>

</table>
</td></tr><br /><br />
<tr>
    <td colspan="5"><div align="center" class="style3">Copyright 2009. Crooks &amp; Castles logo and site content is the Copyright ownership of Mohammad TRavanchi.</div></td>
</tr>
</table>
</body>
</html>
