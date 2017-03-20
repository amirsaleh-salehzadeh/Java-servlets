<%@ page import="COMMON.*" %>
<html>
<head>
<title>REGISTER</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<body bgcolor="#ff581e" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0">
<!-- ImageReady Slices (Untitled-1) -->
<table id="Table_01" width="920" align="center" cellpadding="0" cellspacing="0">
	<tr>
		<td colspan="3">
			<img src="images/Untitled-1_01.jpg" width="920" height="202" alt="">
                                      <% 
            USER user =(USER)session.getAttribute("user");
            if(user != null){


        %>  
    <div style="font-size:18px;" >
         <a href="logOut" >Log Out</a>
     </div>
     <%}%>
		</td>
	</tr>
	<tr style="font-weight:bold; color: #fff;">
            <td align="center">
                 <a href="index.jsp">HOME</a>
            </td>
            <td align="center">
                 <a href="AllTeas">SHOP</a>
            </td>
            <td align="center">
                 <a href="register.jsp">USER</a>
            </td>
	</tr> 
	<tr style="font-weight:bold; color: #000;">
             <td colspan="3">						
             <form method="post" action="register">
                 <table style=" font-size:19px;" align="center" vspace="0" cellpadding="0" cellspacing="0">
                        <tr>
                             <td>
                               Name: </td><td><input type="text" name="name">
                             </td>
                        </tr>
                        <tr>
                             <td>
                               Family Name: </td><td><input type="text" name="FN">
                             </td>
                        </tr>
                        <tr>
                             <td>
                                Email: </td><td><input type="text" name="email">
                             </td>
                        </tr>                            
                        <tr>
                             <td>
                                Telephone: </td><td><input type="text" name="tel">
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
                       <%if(user!=null &&"true".equals(user.getWebManager())){%>
                       <tr>
                                 <td>
                                 Web Manager </td><td>
                                 <input type="checkbox" name="manager" value="true">
                                 </td>
                            </tr>                            
                        
                        <tr>
                            <%}%>
                             <td colspan="2" align="center">
                        <input type="submit" value="Register">
                             </td>
                        </tr>  
                </table>
                 </form></td>
	</tr>          
</table>
<!-- End ImageReady Slices -->
</body>
</html>