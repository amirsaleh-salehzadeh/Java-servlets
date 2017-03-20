<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ page import="java.util.ArrayList" %>
<%@ page import="common.*" %>
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

<tr>
    <td > <marquee scrolldelay="170">
          <span class="style7">Welcome Admin</span>
          </marquee>
          <div></div>
    </td>
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
<tr><td align="center">
        <div style="background-color: #bbb; color:#444;">
            <span style="color:#333; font-size:18px; font-weight:bold;">Search:</span>
        <form action="MyProjServlet" method="post">            
              By Username:  <input type="text" name="username" >
            <input type="hidden" name="whatToDo" value="searchByUsername">
            <input type="submit" value="Search">
        </form>
          <form action="MyProjServlet" method="get">
              By role:  <select name="role"> 
                          <option></option>
                            <% ArrayList<String> roles = (ArrayList<String>)session.getAttribute("roles");
                                for(int j=0;j<roles.size();j++){
                                    out.print("<option>");
                                    out.print(roles.get(j));
                                    out.print("</option>");
                                }
                              %>
                        </select>
                <input type="hidden" name="whatToDo" value="searchByRole">
                        <%if("superAdmin".equalsIgnoreCase(u.getRole())){%>
                    <input type="submit" value="Search">
                        <%}%>
            </form>
        </div>
    <br /><br />
	        <%   
            ArrayList<Userparam> new_registered = (ArrayList<Userparam>)session.getAttribute("users");
           %>
                  <span style="color: red;">
                     <% if(request.getParameter("alert")!=null){
                        out.print(request.getParameter("alert"));
                     } %> 
                    
                 </span><br/>
              <table align="center" border="1" width="500px" >
                  <tr><th><span class="style11">Username</span></th>
                  <th><span class="style11">Firstname</span></th>
                  <th><span class="style11">Lastname</span></th>
                  <th><span class="style11">Email</span></th>
                  <th><span class="style11">Role</span></th>
                  <th><span class="style11">Delete</span></th>
                  <th><span class="style11">Update</span></th>
                  </tr>
                             <%

               for(int i=0;i<new_registered.size();i++){
                    %> 
                  <tr><span class="style3">
                      <td><span class="style3"><%out.println(new_registered.get(i).getUsername()) ;%></span></td>
                      <td ><span class="style3"><%out.println(new_registered.get(i).getName()) ;%></span></td>
                      <td ><span class="style3"><%out.println(new_registered.get(i).getFamily()) ;%></span></td>
                      <td ><span class="style3"><%out.println(new_registered.get(i).getEmail()) ;%></span></td>
                      <td ><span class="style3"><%out.println(new_registered.get(i).getRole()) ;%></span></td>
                      ?
                      <%if("superAdmin".equalsIgnoreCase(u.getRole())){%>
                      <td >
                          <form action="MyProjServlet" method="post">
                              <input type="submit" value="Delete">
                            <input type="hidden" name="userName" value="<%=new_registered.get(i).getUsername()%>">
                            <input type="hidden" name="whatToDo" value="deleteUser">
                          </form>
                      </td>
                      <td>
                          <form action="MyProjServlet" method="get">
                            <input type="hidden" name="whatToDo" value="updateUser">
                            <input type="hidden" name="userName" value="<%=new_registered.get(i).getUsername()%>">
                            <select name="role">
                                
                                  <% }
                                    for(int j=0;j<roles.size();j++){
                                        if( roles.get(j).equalsIgnoreCase(new_registered.get(i).getRole())){
                                            out.print("<option selected>");
                                        } else{
                                            out.print("<option>");
                                        }
                                        
                                        out.print(roles.get(j));
                                        out.print("</option>");
                                    }
                                  %>
                              </select>
                                <input type="submit" value="Update">
                          </form>
                      </td>
                      
                </tr>
              <%  }%>
             </table>

	

</td></tr>
<tr>
    <td ><div align="center" class="style3">Copyright 2009. Crooks &amp; Castles logo and site content is the Copyright ownership of Mohammad TRavanchi.</div></td>
</tr>
</table>
</body>
</html>
