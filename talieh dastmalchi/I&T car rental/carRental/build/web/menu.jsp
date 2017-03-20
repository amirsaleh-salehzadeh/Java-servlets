<%-- 
    Document   : menu
    Created on : Mar 11, 2011, 4:38:14 PM
    Author     : Talieh Dastmalchi
--%>

<html>
<head>
<style type="text/css">
	body {
	background-color: #061d00;
	color: #ffa800;
}
a {
	color: #ffa800;
	font-size: 20px;
	font-weight: bold;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
</head>
<body leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" >
<table id="Table_01" width="801" align="center" border="0" cellpadding="0" cellspacing="0">
	<tr>
                <td colspan="4">
                    <img src="images/banner.jpg"></img>
                </td>
            </tr>
            <%
                        String msg = request.getParameter("message");
                        if(msg==null)
                            msg="";
                        if(!msg.equalsIgnoreCase("")){
                    %>
                     <tr>
                <td colspan="4" align="center">
                      
                    <span style="color:white; font-size:16px; font-weight:bold;"><%=msg%></span>
                </td>                
            </tr>
              <%}
                    %>
	<tr>
		<td>
			<a href="index.jsp">
				login
			</a>
		</td>
		<td>
		<a href="register.jsp">
				register
			</a>
		</td>
		<td>
		<a href="searchForCategory">rent a car
			</a>
		</td>
		 <td >
		<%if(session.getAttribute("user")!=null){%>
               
                    <a href="logout">LogOut</a>
                                       
              <%} %>
              </td> 
	</tr>
</table>

</body>
</html>