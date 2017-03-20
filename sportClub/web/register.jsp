<%@ page import="Obj.*" %>
<html>
<head>
<title>Register</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<body bgcolor="#500000" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<!-- ImageReady Slices (theme.psd) -->
<table id="Table_01" width="800" border="0" cellpadding="0" align="center" cellspacing="0">
	<tr>
		<td colspan="2">
		<div style="position:absolute;" align="center">
                        <%
                       User u = (User)session.getAttribute("user");
                        if(u != null){%>
                            <a href="logOut" style="color:#fff;"> Logout</a>
                        <%   }
                        %>
                    </div>
                 <img src="images/index_01.jpg" width="800" height="160" alt="" >
                             
                    
                </td>
	</tr>
	<tr>
		<td width="152" align="left" valign="top">
			<table align="left" vspace="0" cellpadding="0" cellspacing="0">
				<tr>
					<td>
                                             <a href="index.jsp" style="border:0px;"><img border="0" src="images/index_02.jpg" width="150" height="40" alt=""></a>
					</td>
				</tr>
				<tr>
					<td>
                                             <a href="Classes"><img border="0" src="images/index_04.jpg" width="150" height="40" alt=""></a>
					</td>
				</tr>
				<tr>
					<td>
                                             <a href="register.jsp"> <img border="0" src="images/index_05.jpg" width="150" height="40" alt=""></a>
					</td>
				</tr>								
				<tr>
					<td>
                                             <a href="kickboxing.jsp"> <img border="0" src="images/index_06.jpg" width="150" height="40" alt=""></a>
					</td>
				</tr>
			</table>
	  </td>
            <td width="648" align="center" valign="top">
                 <form method="post" action="reg?goTo=registerUser">
                     <table style="color:#FFCC00; font-size:20px;" align="center" vspace="0" cellpadding="0" cellspacing="0">
                            <tr>
                                 <td>
                                   Name: </td><td><input type="text" name="name">
                                 </td>
                            </tr>
                            <tr>
                                 <td>
                                   Family Name: </td><td><input type="text" name="Fname">
                                 </td>
                            </tr>
                            <tr>
                                 <td>
                                    Age: </td><td><input type="text" name="age">
                                 </td>
                            </tr>                            
                            <tr>
                                 <td>
                                    Telephone: </td><td><input type="text" name="tel">
                                 </td>
                            </tr>
                            <tr>
                                 <td>
                                    Username: </td><td><input type="text" name="uname">
                                 </td>
                            </tr>
                            <tr>
                                 <td>
                                    Password: </td><td><input type="password" name="password">
                                 </td>
                            </tr>
                            <tr>
                                 <td>
                                     Address: </td><td><textarea name="address"></textarea>
                                 </td>
                            </tr>
                            <%if(u!=null&&"admin".equalsIgnoreCase(u.getAdmin())){%>
                                <tr>
                                     <td>
                                     Admin: </td><td>
                                     <select name="admin">
                                         <option value="user">User</option>
                                         <option value="admin">Admin</option>
                                     </select>
                                     </td>
                                </tr>                            
                            <%}%>
                            <tr>
                                 <td colspan="2" align="center">
                            <input type="submit" value="Register">
                                 </td>
                            </tr>  
                    </table>
                 </form>
            </td>
	</tr>
</table>
<!-- End ImageReady Slices -->
</body>
</html>