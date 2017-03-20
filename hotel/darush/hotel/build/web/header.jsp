
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="Common.*" %>
<html>
<head>
<title>Untitled-1</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/JavaScript">

</script>
<LINK href="web.css" rel=stylesheet>
</head>
<body bgcolor="#eee" leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" onLoad="MM_preloadImages('images/Untitled-2_03.png','images/Untitled-2_04.png','images/Untitled-2_05.png')">
<table id="Table_01" width="1024" border="0" cellpadding="0" cellspacing="0">
	<tr>
		<td height="200" colspan="5">
			<img src="images/dar_01.png" width="1024" height="200" alt=""></td>
	</tr>
	<tr bgcolor="#ddd">
		<td>
			
		<td><a href="index.jsp">Home</a></td>
		<td><a href="reserve.jsp">Search</a></td>
		<td><a href="register.jsp">Register</a></td>
		<td>
			<img src="images/Untitled-1_06.png" width="230" height="51" alt=""></td>
	</tr>
                     <%
                        String msg = request.getParameter("msg");
                        if(msg==null)
                            msg="";
                        if(!msg.equalsIgnoreCase("")){
                    %>
                     <tr>
                <td colspan="5" align="center">
                      
                    <span style="color:#ff5400; font-size:16px; font-weight:bold;"><%=msg%></span>
                </td>                
            </tr>
              <%}
                    %>
                    <%
                        if(session.getAttribute("user")!=null){
                                //PassengerENT pent = (PassengerENT)session.getAttribute("user");
                    %>
                     <tr>
                <td colspan="5">
                    <a href="logOut">LogOut</a>
                    
                </td>                
            </tr>
              <%}
                    %>
</table>
<!-- End ImageReady Slices -->
</body>
</html>
